package logica;

import java.util.Scanner;

public class casaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("***Bienvenido a la casa de los espejos**");

        var consola = new Scanner(System.in);

        System.out.println("Ingresa tu edad");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes miedo a la oscuridad?");
         var miedoOscuridad = Boolean.parseBoolean(consola.nextLine());

         //verificacion

        if (!miedoOscuridad && edad >=10){
            System.out.println("Ingresa");
        }else{
            System.out.println("Sos niño y por ende gallina :v");
        }
    }

}
