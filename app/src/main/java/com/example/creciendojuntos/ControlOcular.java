package com.example.creciendojuntos;

import java.util.Date;

public class ControlOcular {

    private int id;
    private int edad;
    private Date fechaOculista;
    private String nroMatricula;
    private String ojoDerecho;
    private String ojoIzquierdo;
    private String observacion;

    public ControlOcular(int id, int edad, Date fechaOculista, String nroMatricula, String ojoDerecho, String ojoIzquierdo, String observacion) {
        this.id = id;
        this.edad = edad;
        this.fechaOculista = fechaOculista;
        this.nroMatricula = nroMatricula;
        this.ojoDerecho = ojoDerecho;
        this.ojoIzquierdo = ojoIzquierdo;
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaOculista() {
        return fechaOculista;
    }

    public void setFechaOculista(Date fechaOculista) {
        this.fechaOculista = fechaOculista;
    }

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public String getOjoDerecho() {
        return ojoDerecho;
    }

    public void setOjoDerecho(String ojoDerecho) {
        this.ojoDerecho = ojoDerecho;
    }

    public String getOjoIzquierdo() {
        return ojoIzquierdo;
    }

    public void setOjoIzquierdo(String ojoIzquierdo) {
        this.ojoIzquierdo = ojoIzquierdo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "ControlOcular{" +
                "id=" + id +
                ", edad=" + edad +
                ", fechaOculista=" + fechaOculista +
                ", nroMatricula='" + nroMatricula + '\'' +
                ", ojoDerecho='" + ojoDerecho + '\'' +
                ", ojoIzquierdo='" + ojoIzquierdo + '\'' +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}
