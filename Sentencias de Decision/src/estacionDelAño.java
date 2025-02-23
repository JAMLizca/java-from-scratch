package logica;

import java.util.Scanner;

public class estacionDelAño {
    public static void main(String[] args) {
        System.out.println("**Idemtificando la estacion**");
        System.out.println("--------------------------------");
        System.out.println("Ingrese el mes(1 al 12)");

        var consola = new Scanner(System.in);
        var mesNum = consola.nextInt();
        
        if(mesNum == 12 || mesNum == 1 || mesNum == 2){
            System.out.println("Estamos en invierno");
        } else if ( mesNum == 3 || mesNum == 4 || mesNum == 5) {
            System.out.println("Estamos en primavera");
        }else if ( mesNum == 6 || mesNum == 7 || mesNum == 8) {
            System.out.println("Estamos en verano");
        } else if ( mesNum == 9 || mesNum == 10 || mesNum == 11) {
            System.out.println("Estamos en otoño");
        }else{
            System.out.println("Estacion desconocida");
        }


    }
}
