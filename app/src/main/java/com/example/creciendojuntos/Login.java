package com.example.creciendojuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPassword;
    private Button mButtonLogin;

    // Variables de los datos a verificar
    private String password = "";
    private String email = "";
    FirebaseAuth mAuth;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mEditTextEmail = (EditText) findViewById(R.id.editTextEmail);
        mEditTextPassword = (EditText) findViewById(R.id.editTextPassword);
        mButtonLogin = (Button) findViewById(R.id.btnLogin);

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email = mEditTextEmail.getText().toString();
                password = mEditTextPassword.getText().toString();

                if (!email.isEmpty() && !password.isEmpty()) {
                    if (password.length() >= 6) {
                       // verificarUser(); "Metodo a implementar"
                        // Por razones de tiempo vamos a asumir lo siguiente:
                        // juancito se registra con un perfil e email unicos
                        // si se quiere registrar con otro perfil debe
                        // registrarse con una direccion de email no
                        // existente en el sistema
                    } else {
                        Toast.makeText(Login.this, "El password debe tener al menos 6 caracteres", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Debe completar los campos", Toast.LENGTH_LONG).show();
                }

                startActivity(new Intent(Login.this, PerfilMedico.class));
            }
        });


    }
}