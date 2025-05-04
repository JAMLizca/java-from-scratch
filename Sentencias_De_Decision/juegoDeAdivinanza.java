package logica.Sentencias_De_Decision;

import java.util.Random;

public class juegoDeAdivinanza {
    public static void main(String[] args) {
        System.out.println("---JUEGO DE ADIVINANZA---");
        var consola = new java.util.Scanner(System.in);
        var ramdom =new Random();

        var numero = ramdom.nextInt(10)+1;
        var intentos = 0;
        var adivinaza =0;
        final var MAXIMO_INTENTOS = 5;
        while(adivinaza!=numero && intentos<MAXIMO_INTENTOS){
            System.out.println("Adivina el num secreto");

            if (adivinaza<numero){
                System.out.println("El numero es mayor");
            }else if (adivinaza>numero){
                System.out.println("El numero es menor");
            }
            intentos++;
            adivinaza = consola.nextInt();

            if (adivinaza==numero){
                System.out.println("Adivinaste el numero"+ numero +"y en un total de "+intentos+" intentos");
            }
        }
    }
}
