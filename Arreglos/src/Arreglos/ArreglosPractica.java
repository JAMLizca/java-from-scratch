package logica.Arreglos.src.Arreglos;
import java.util.Scanner;

public class ArreglosPractica {
    public static void main(String[] args) {
        String[] apellidos = new String[5];
        apellidos[0] = "Lopez";
        apellidos[1] = "Perez";
        apellidos[2] = "Garcia";
        apellidos[3] = "Martinez";
        apellidos[4] = "Dominguez";

        int sumaprecios = 0;

        // Mostrar apellidos
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("Apellido " + (i + 1) + ": " + apellidos[i]);
        }

        Scanner sc = new Scanner(System.in);
        int precios[] = new int[4];

        // Capturar precios
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingresa el precio " + (i + 1) + ":");
            precios[i] = sc.nextInt();
        }

        // Mostrar precios
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i + 1) + ": " + precios[i]);
        }

        // Calcular la suma de los precios
        for (int i = 0; i < precios.length; i++) {
            sumaprecios = sumaprecios + precios[i];
        }

        System.out.println("La suma de los precios es: " + sumaprecios);

        sc.close(); // Cerrar Scanner para evitar advertencias

        // Calcular el promedio de los precios
        double precio = sumaprecios/precios.length;
        System.out.println("El promedio de los precios es: " + precio);


    }
}
