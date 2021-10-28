package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner; //Definimos un objeto Scanner, lo llamamos scanner
        scanner = new Scanner(System.in); // Creamos el scanner a partir de System.in
        //Definimos las variables para los datos que queremos ingresar
        int num1;
        int num2;
        float coeficiente;

        System.out.println("Ingrese el primer valor");
        num1 = scanner.nextInt();
        System.out.println("Ingrese segundo valor");
        num2 = scanner.nextInt();

        System.out.println("Ingrese el coeficiente");
        coeficiente = scanner.nextFloat();

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        char inicial = nombre.charAt(0);
    }
}
