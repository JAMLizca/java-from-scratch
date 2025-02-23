package logica;

import java.util.Random;
import java.util.Scanner;

public class GeneradorIde {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID ***");

        var consola = new Scanner(System.in);
        var random = new Random();

        // Solicitar nombre
        System.out.println("Ingresa tu nombre:");
        var nombre = consola.nextLine();

        // Solicitar apellido
        System.out.println("Ingresa tu apellido:");
        var apellido = consola.nextLine();

        // Solicitar año de nacimiento
        System.out.println("¿Cuál es tu año de nacimiento (yyyy)?");
        var anio = consola.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2); // Tomar las primeras 2 letras del nombre
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2); // Tomar las primeras 2 letras del apellido
        var anio2 = anio.trim().substring(2); // Tomar los últimos 2 dígitos del año

        // Generar valor aleatorio (1 a 9999)
        var numAleatorio = random.nextInt(9999) + 1; // Random genera entre 0 y 9999, +1 asegura un rango de 1 a 9999

        // Formato 4 dígitos
        var numAleatorioStr = String.format("%04d", numAleatorio); // Formatea a 4 dígitos con ceros a la izquierda

        // Generar ID único
        var idUnico = nombre2 + apellido2 + anio2 + numAleatorioStr;

        // Imprimir el resultado
        System.out.printf("""
                %nHola %s %s
                \tTu nuevo ID es:
                \t%s
                \t¡Muy bien! :v
                """, nombre, apellido, idUnico);

        consola.close(); // Cerrar el Scanner para asi evitar fugas de recursos
    }
}
