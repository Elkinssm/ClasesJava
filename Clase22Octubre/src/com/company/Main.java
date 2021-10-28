package com.company;

import java.util.Scanner;

public class Main {


    public static String pedirNombreJugador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de los jugadores:");
        return scanner.nextLine();
    }

    public static int pedirOpcionJugador(String jugador) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(jugador + " ingresá la opción deseada: 1.Piedra 2.Papel 3.Tijera");
        return validarOpcion(scanner.nextInt(), 1, 3);
    }

    public static int validarOpcion(int numero, int minimo, int maximo) {
        Scanner scanner = new Scanner(System.in);
        while (numero < minimo || numero > maximo) {
            System.out.println("La opción ingresada no es válida, por favor reingresá:1.Piedra 2.Papel 3.Tijera");
            numero = scanner.nextInt();
        }
        return numero;
    }


    public static int calcularGanador(int opcionJ1, int opcionJ2) {
        int ganador = 0;
        // Si no es empate...
        if (opcionJ1 != opcionJ2) {
            // Si gana jugador 1...
            if (opcionJ1 == 1 && opcionJ2 == 3 || // J1: piedra, J2: tijera
                    opcionJ1 == 2 && opcionJ2 == 1 || // J1: papel,  J2: piedra
                    opcionJ1 == 3 && opcionJ2 == 2) { // J1: tijera, J2: papel
                ganador = 1;
            } else {
                ganador = 2;
            }
        }
        return ganador;
    }

    public static void mostrarPuntos(String jugador1, int ptosJ1, String jugador2, int ptosJ2) {
        System.out.println(jugador1 + ": " + ptosJ1);
        System.out.println(jugador2 + ": " + ptosJ2);
    }

    public static void jugar() {
        Scanner scanner = new Scanner(System.in);

        String jugador1 = pedirNombreJugador(),
                jugador2 = pedirNombreJugador(),
                seguirJugando;

        int opcionJ1, opcionJ2, ganador,
                ptosJ1 = 0,
                ptosJ2 = 0;

        do {
            opcionJ1 = pedirOpcionJugador(jugador1);
            opcionJ2 = pedirOpcionJugador(jugador2);
            ganador = calcularGanador(opcionJ1, opcionJ2);

            if (ganador == 1) {
                ptosJ1++;
            } else if (ganador == 2) {
                ptosJ2++;
            }

            mostrarPuntos(jugador1, ptosJ1, jugador2, ptosJ2);
            System.out.println("\nIngrese cualquier tecla si desea seguir, o [*] para salir: ");
            seguirJugando = scanner.next();
        } while (seguirJugando.charAt(0) != '*');

        System.out.println("\nGracias por jugar! Nos vemos <3");
    }

    public static void main(String[] args) {
        jugar();
    }

}

