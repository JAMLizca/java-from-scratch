package logica;
import java.util.Scanner;
/*
el paqute Scanner no se importa solo, nos toca importarlo:
import java.util.Scannner
ACLARACION: Scanner con S no con s
 */

//manejo de paquetes en java
public class EjemploScanner {
    public static void main(String[] args) {

        //introducir valores por colona
        var consola = new Scanner (System.in); //definir variable y objeto Scanner
        System.out.println("Ingresa tu nombre:");// que es lo que estamos esperando
        var nombre = consola.nextLine(); //leer info que estabos esperando por consola
        System.out.println("Tu nombre es = " + nombre); // info que fue capturada y se muestra

        /*Aclaracion:
        El System.out.printl no imprimer con salto de linea
        El System.out.print no imprime salto de linea
         */
    }

}
