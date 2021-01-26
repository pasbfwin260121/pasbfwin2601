package com.example.creciendojuntos;

public class Administrador {

    private int id;
    private String nombreCompleto;

    public Administrador(int id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
