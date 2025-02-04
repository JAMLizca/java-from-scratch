package logica;

import java.util.Scanner;

public class validacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Crea una contraseña:");
        System.out.print("Ingresa tu nueva contraseña:"+ " ");
        var contraseña= consola.nextLine();

        while (contraseña.length()<8){
            System.out.println("La contraseña no cumple los requisitos, minimo 6 caracteres.");
            System.out.print("Ingresa otra vez la contraseña:"+ " ");
            contraseña= consola.nextLine();
        }
        System.out.print("La contraseña es valida= "+ " "+ contraseña);
    }
}
