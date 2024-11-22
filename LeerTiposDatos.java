package logica;
import java.util.Scanner;
public class LeerTiposDatos {
    public static void main(String[] args) {
         //leer un tipo int
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad =");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        
    }
}
