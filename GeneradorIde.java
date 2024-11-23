package logica;
import java.util.Random;
import java.util.Scanner;
public class GeneradorIde {
    public static void main(String[] args) {
        System.out.println("***Generador de Ide***");
        var consola = new Scanner (System.in);
        var random = new Random();

        //solicitar nombre
        System.out.println("Ingresa tu nombre");
        var nombre = consola.nextLine();

        //solicitar apellido
        var apellido = consola.nextLine();

        //solicitar año nacimiento
        System.out.println("Cual es tu año de nacimiento");
        var anio = consola.nextLine();
        
    }
}
