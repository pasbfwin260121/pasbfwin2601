package com.example.creciendojuntos;

public class Medico {

    private int id;
    private int cedula;
    private String nombreCompleto;
    private String nroMatricula;
    private String telefono;
    private String especialidad;

    public Medico(int id, int cedula, String nombreCompleto, String nroMatricula, String telefono, String especialidad) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.nroMatricula = nroMatricula;
        this.telefono = telefono;
        this.especialidad = especialidad;
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

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", cedula=" + cedula +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", nroMatricula='" + nroMatricula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
