package com.company;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;

    }

    public void incrementarDeuda(Double valor) {
        this.deuda += valor;

    }

    public void pagarDeuda() {
        this.deuda = 0.0;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
}
