package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cliente primerCliente = new Cliente(1234, "Elkin Silva");
        System.out.println("El nombre del cliente es " + primerCliente.getNombre());
        //modificamos el valor del nombre
        primerCliente.setNombre("Juan");
        System.out.println("El nombre del cliente es " + primerCliente.getNombre());

        System.out.println("La deuda es " + primerCliente.getDeuda());

        primerCliente.setDeuda(1000.0);
        primerCliente.incrementarDeuda(125.0);
        System.out.println("El saldo de su deuda es " + primerCliente.getDeuda());
        primerCliente.pagarDeuda();
        System.out.println("El nuevo saldo de se deuda es " + primerCliente.getDeuda());

    }
}
