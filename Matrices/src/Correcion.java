package logica.Matrices.src;
import java.util.Scanner;

public class Correcion {
        static final int PRODUCTOS = 50;
        static final int MESES = 6;

        public static void main(String[] args) {
            double[][] precios = new double[PRODUCTOS][MESES];
            Scanner scanner = new Scanner(System.in);

            // Preguntar cómo llenar los datos
            System.out.println("Seleccione el método para llenar los datos:");
            System.out.println("1. Ingresar los precios manualmente.");
            System.out.println("2. Generar los precios aleatoriamente.");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                llenarMatrizManual(precios, scanner);
            } else if (opcion == 2) {
                llenarMatrizAleatoria(precios);
            } else {
                System.out.println("Opción no válida. Se generarán datos aleatoriamente.");
                llenarMatrizAleatoria(precios);
            }

            // Mostrar los datos de los 6 meses
            mostrarDatos(precios);

            scanner.close();
        }

        // Método para llenar la matriz manualmente
        public static void llenarMatrizManual(double[][] precios, Scanner scanner) {
            System.out.println("Ingrese los precios para cada producto y mes:");
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    System.out.print("Precio del Producto " + (i + 1) + " en el Mes " + (j + 1) + ": ");
                    precios[i][j] = scanner.nextDouble();
                    while (precios[i][j] < 0) { // Validación para evitar precios negativos
                        System.out.print("Error. Ingrese un precio válido (≥0): ");
                        precios[i][j] = scanner.nextDouble();
                    }
                }
            }
        }

        // Método para llenar la matriz con valores aleatorios entre 0 y 200
        public static void llenarMatrizAleatoria(double[][] precios) {
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    precios[i][j] = Math.random() * 200; // Valores entre 0 y 200
                }
            }
            System.out.println("Datos generados aleatoriamente.");
        }

        // Método para mostrar los datos de los 6 meses
        public static void mostrarDatos(double[][] precios) {
            System.out.println("\nDatos de los 6 meses:");
            for (int j = 0; j < MESES; j++) {
                System.out.println("Mes " + (j + 1) + ":");
                for (int i = 0; i < PRODUCTOS; i++) {
                    System.out.println("Producto " + (i + 1) + " -> Precio: " + precios[i][j]);
                }
            }
        }
    }

