package com.example.creciendojuntos;

import java.util.Date;

public class Ninio_Ninia extends Padre_Madre_Tutor {

    private int id;
    private Date fechaNacimiento;
    private String nombreNinio;
    private int cedula;
    private String genero;

    public Ninio_Ninia(String domicilio, String telefono) {
        super(domicilio, telefono);
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreNinio = nombreNinio;
        this.cedula = cedula;
        this.genero = genero;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreNinio() {
        return nombreNinio;
    }

    public void setNombreNinio(String nombreNinio) {
        this.nombreNinio = nombreNinio;
    }

    @Override
    public int getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Ninio_Ninia{" +
                "id=" + id +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nombreNinio='" + nombreNinio + '\'' +
                ", cedula=" + cedula +
                ", genero='" + genero + '\'' +
                '}';
    }
}
