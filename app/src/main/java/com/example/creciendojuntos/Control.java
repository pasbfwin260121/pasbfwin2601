package com.example.creciendojuntos;

import java.util.Date;

public class Control {

    private int id;
    private Date fechaControl;
    private int edad;
    private int peso;
    private int talla;
    private int perimetroCefalico;
    private boolean alimPecho;
    private boolean alimArtificial;
    private int hierro;
    private int vitaminaD;
    private int imc;
    private String presionArterial;
    private boolean vacunaVigente;
    private String observaciones;
    private String pediatra;
    private Date proximoControl;

    public Control(int id, Date fechaControl, int edad, int peso, int talla, int perimetroCefalico, boolean alimPecho, boolean alimArtificial, int hierro, int vitaminaD, int imc, String presionArterial, boolean vacunaVigente, String observaciones, String pediatra, Date proximoControl) {
        this.id = id;
        this.fechaControl = fechaControl;
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
        this.perimetroCefalico = perimetroCefalico;
        this.alimPecho = alimPecho;
        this.alimArtificial = alimArtificial;
        this.hierro = hierro;
        this.vitaminaD = vitaminaD;
        this.imc = imc;
        this.presionArterial = presionArterial;
        this.vacunaVigente = vacunaVigente;
        this.observaciones = observaciones;
        this.pediatra = pediatra;
        this.proximoControl = proximoControl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Date fechaControl) {
        this.fechaControl = fechaControl;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getPerimetroCefalico() {
        return perimetroCefalico;
    }

    public void setPerimetroCefalico(int perimetroCefalico) {
        this.perimetroCefalico = perimetroCefalico;
    }

    public boolean isAlimPecho() {
        return alimPecho;
    }

    public void setAlimPecho(boolean alimPecho) {
        this.alimPecho = alimPecho;
    }

    public boolean isAlimArtificial() {
        return alimArtificial;
    }

    public void setAlimArtificial(boolean alimArtificial) {
        this.alimArtificial = alimArtificial;
    }

    public int getHierro() {
        return hierro;
    }

    public void setHierro(int hierro) {
        this.hierro = hierro;
    }

    public int getVitaminaD() {
        return vitaminaD;
    }

    public void setVitaminaD(int vitaminaD) {
        this.vitaminaD = vitaminaD;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public boolean isVacunaVigente() {
        return vacunaVigente;
    }

    public void setVacunaVigente(boolean vacunaVigente) {
        this.vacunaVigente = vacunaVigente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPediatra() {
        return pediatra;
    }

    public void setPediatra(String pediatra) {
        this.pediatra = pediatra;
    }

    public Date getProximoControl() {
        return proximoControl;
    }

    public void setProximoControl(Date proximoControl) {
        this.proximoControl = proximoControl;
    }

    @Override
    public String toString() {
        return "Control{" +
                "id=" + id +
                ", fechaControl=" + fechaControl +
                ", edad=" + edad +
                ", peso=" + peso +
                ", talla=" + talla +
                ", perimetroCefalico=" + perimetroCefalico +
                ", alimPecho=" + alimPecho +
                ", alimArtificial=" + alimArtificial +
                ", hierro=" + hierro +
                ", vitaminaD=" + vitaminaD +
                ", imc=" + imc +
                ", presionArterial='" + presionArterial + '\'' +
                ", vacunaVigente=" + vacunaVigente +
                ", observaciones='" + observaciones + '\'' +
                ", pediatra='" + pediatra + '\'' +
                ", proximoControl=" + proximoControl +
                '}';
    }
}
