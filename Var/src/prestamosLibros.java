package logica;
import java.util.Scanner;
public class prestamosLibros {
    public static void main(String[] args) {
        System.out.println("***Sistema de prestamos de libros***");
        final var DISTANCIA_PREMITIDA = 3;
        var consola = new Scanner(System.in);
        System.out.println(" Cuentas con credenciales de estudiante (true/false)?");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.println("Distancia de la biblioteca en Km?");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var elegiblePrestamo = tieneCredencial || distanciaBiblioteca <DISTANCIA_PREMITIDA;
        System.out.println("Eres elegible para prestamo de libros" +" "+ elegiblePrestamo);
    }
}
