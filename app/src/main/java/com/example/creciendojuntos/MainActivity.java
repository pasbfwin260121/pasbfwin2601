package com.example.creciendojuntos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextName;
    private EditText mEditTextEmail;
    private EditText mEditTextPassword;
    private Button mButtonRegister;
    private TextView mTextViewData;
    private Spinner mSpinnerPerfil;
    private Button mButtonIniciar;

    // Variables de los datos a registrar
    private String name = "";
    private String password = "";
    private String email = "";
    private String nPerfil;
    FirebaseAuth mAuth;
    DatabaseReference mDatabase;
    String mPerfilSeleccionado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        loadPerfiles();

        mEditTextName = (EditText) findViewById(R.id.editTextName);
        mEditTextEmail = (EditText) findViewById(R.id.editTextEmail);
        mEditTextPassword = (EditText) findViewById(R.id.editTextPassword);
        mTextViewData = (TextView) findViewById(R.id.textViewData);
        mSpinnerPerfil = (Spinner) findViewById(R.id.spinnerPerfil);
        mButtonRegister = (Button) findViewById(R.id.btnRegister);
        mButtonIniciar = (Button) findViewById(R.id.btnIniciar);

        mButtonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = mEditTextName.getText().toString();
                email = mEditTextEmail.getText().toString();
                password = mEditTextPassword.getText().toString();
                nPerfil = mPerfilSeleccionado;

                if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                    if (password.length() >= 6) {
                        registerUser();
                    } else {
                        Toast.makeText(MainActivity.this, "El password debe tener al menos 6 caracteres", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Debe completar los campos", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void loadPerfiles(){
        final List<Perfil> perfiles = new ArrayList<>();
        mDatabase.child("Perfiles").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    for(DataSnapshot ds: dataSnapshot.getChildren()){
                        String id = ds.getKey();
                        String nombre = ds.child("nombre").getValue().toString();
                        perfiles.add(new Perfil(id,nombre));
                    }
                    ArrayAdapter<Perfil> arrayAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, perfiles);
                    mSpinnerPerfil.setAdapter(arrayAdapter);
                    mSpinnerPerfil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            mPerfilSeleccionado = adapterView.getItemAtPosition(i).toString();
                            String id = perfiles.get(i).getId();
                            mTextViewData.setText("Perfil " + id + " - " + mPerfilSeleccionado);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    private void registerUser() {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Map<String, Object> map = new HashMap<>();

                    map.put("name", name);
                    map.put("email", email);
                    map.put("password", password);
                    map.put("nPerfil", nPerfil);

                    String id = mAuth.getCurrentUser().getUid();

                    startActivity(new Intent(MainActivity.this, ProfileActivity.class));

                    mDatabase.child("Users").child(id).setValue(map);

                    Toast.makeText(MainActivity.this, "El usuario se ha registrado correctamente", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "No se puede registrar este usuario", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

