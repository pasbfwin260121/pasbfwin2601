package com.example.creciendojuntos;

public class SaludBucal {

    private int id;
    private int edad;
    private String nroMatricula;
    private String caries;
    private String perdidaDentarias;
    private String enfermedades;
    private String observacioens;

    //PRUEBA BRUNO_3
    public SaludBucal(int id, int edad, String nroMatricula, String caries, String perdidaDentarias, String enfermedades, String observacioens) {
        this.id = id;
        this.edad = edad;
        this.nroMatricula = nroMatricula;
        this.caries = caries;
        this.perdidaDentarias = perdidaDentarias;
        this.enfermedades = enfermedades;
        this.observacioens = observacioens;
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

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public String getCaries() {
        return caries;
    }

    public void setCaries(String caries) {
        this.caries = caries;
    }

    public String getPerdidaDentarias() {
        return perdidaDentarias;
    }

    public void setPerdidaDentarias(String perdidaDentarias) {
        this.perdidaDentarias = perdidaDentarias;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getObservacioens() {
        return observacioens;
    }

    public void setObservacioens(String observacioens) {
        this.observacioens = observacioens;
    }

    @Override
    public String toString() {
        return "saludBucal{" +
                "id=" + id +
                ", edad=" + edad +
                ", nroMatricula='" + nroMatricula + '\'' +
                ", caries='" + caries + '\'' +
                ", perdidaDentarias='" + perdidaDentarias + '\'' +
                ", enfermedades='" + enfermedades + '\'' +
                ", observacioens='" + observacioens + '\'' +
                '}';
    }
}
