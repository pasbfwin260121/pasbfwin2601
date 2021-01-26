package com.example.creciendojuntos;

import java.util.Date;

public class AptitudFisica {

    private int id;
    private int edad;
    private boolean apto;
    private Date validoHasta;
    private String pediatra;
    private String nroMatricula;
    private String observaciones;

    public AptitudFisica(int id, int edad, boolean apto, Date validoHasta, String pediatra, String nroMatricula, String observaciones) {
        this.id = id;
        this.edad = edad;
        this.apto = apto;
        this.validoHasta = validoHasta;
        this.pediatra = pediatra;
        this.nroMatricula = nroMatricula;
        this.observaciones = observaciones;
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

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public Date getValidoHasta() {
        return validoHasta;
    }

    public void setValidoHasta(Date validoHasta) {
        this.validoHasta = validoHasta;
    }

    public String getPediatra() {
        return pediatra;
    }

    public void setPediatra(String pediatra) {
        this.pediatra = pediatra;
    }

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "AptitudFisica{" +
                "id=" + id +
                ", edad=" + edad +
                ", apto=" + apto +
                ", validoHasta=" + validoHasta +
                ", pediatra='" + pediatra + '\'' +
                ", nroMatricula='" + nroMatricula + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
