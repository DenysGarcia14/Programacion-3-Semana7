package com.uped.proyecto.modelo;

public class Cliente extends Persona {
    private String codigoCliente;

    public Cliente(String nombre, String dui, String codigoCliente) {
        super(nombre, dui);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
}