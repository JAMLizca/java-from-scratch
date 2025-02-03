package logica;

import java.util.Scanner;

public class menuIterativo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir =false;

        while (!salir){
            System.out.println("--Sitema de iteracion de menu--");
            System.out.println("Menu");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Salir");
            System.out.println("Ingresa una option:"+" ");
            var option = consola.nextLine();
            if (option.equals("1")){
                System.out.println("Creando cuenta :V");
            }else if(option.equals("2")){
                System.out.println("Eliminando cuenta :X");
            }else {
                System.out.println("Saliendo del sistema!");
                salir = true;
            }

        }


    }
}
