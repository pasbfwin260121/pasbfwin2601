package com.example.creciendojuntos;

public class Padre_Madre_Tutor {

    private int id;
    private int cedula;
    private String nombreCompleto;
    private String domicilio;
    private String telefono;

    public Padre_Madre_Tutor(int id, int cedula, String nombreCompleto, String domicilio, String telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Padre_Madre_Tutor(String domicilio, String telefono) {
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Padre_Madre_Tutor{" +
                "id=" + id +
                ", cedula=" + cedula +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}


