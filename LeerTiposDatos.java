package logica;
import java.util.Scanner;
public class LeerTiposDatos {
    public static void main(String[] args) {
         //leer un tipo int
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad =");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);


       //Analizen
        // Crear el objeto Scanner para leer datos desde la consola
        var nombre = new Scanner(System.in);
        //En el trancurso del curso se explicara ese tema que son exepciones en java
        try {
            // Solicitar al usuario que ingrese su edad
            System.out.print("Por favor, ingresa tu edad: ");
            var anio = consola.nextInt(); // Leer un número entero
            System.out.println("Tu edad es: " + anio);
                } catch (java.util.InputMismatchException e) {
                    // Manejar el caso en que el usuario no ingrese un número válido
                    System.out.println("Error: Debes ingresar un número entero.");
                } finally {
                    // Cerrar el Scanner para liberar recursos
                    consola.close();
                }
            }
        }



