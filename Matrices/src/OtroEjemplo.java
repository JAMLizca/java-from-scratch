package logica.Matrices.src;
import java.util.Scanner;

public class OtroEjemplo {
        static final int PRODUCTOS = 50;
        static final int MESES = 6;

        public static void main(String[] args) {
            double[][] precios = new double[PRODUCTOS][MESES];
            double[] preciosMaximos;

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

            // Calcular precios máximos
            preciosMaximos = calcularPreciosMaximos(precios);

            // Contar cuántos productos tienen precios altos cada mes
            int[] productosAltosPorMes = contarPreciosAltos(precios);

            // Calcular el promedio general de todos los precios
            double promedioGeneral = calcularPromedioGeneral(precios);

            // Mostrar resultados
            System.out.println("\nProductos con promedio superior al general:");
            mostrarProductosMayorAlPromedio(precios, promedioGeneral);

            System.out.println("\nProductos y meses con precios mayores al promedio general:");
            mostrarPreciosSuperioresAlPromedio(precios, promedioGeneral);

            scanner.close();
        }

        // Método para llenar la matriz manualmente
        public static void llenarMatrizManual(double[][] precios, Scanner scanner) {
            System.out.println("Ingrese los precios para cada producto y mes:");
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    System.out.print("Precio del Producto " + (i + 1) + " en el Mes " + (j + 1) + ": ");
                    precios[i][j] = scanner.nextDouble();
                    while (precios[i][j] < 0) { // Validación
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

        // Método para calcular el precio máximo de cada producto
        public static double[] calcularPreciosMaximos(double[][] precios) {
            double[] maximos = new double[PRODUCTOS];

            for (int i = 0; i < PRODUCTOS; i++) {
                double max = precios[i][0];
                for (int j = 1; j < MESES; j++) {
                    if (precios[i][j] > max) {
                        max = precios[i][j];
                    }
                }
                maximos[i] = max;
            }
            return maximos;
        }

        // Método que determina si un precio es alto (>=100)
        public static boolean esPrecioAlto(double precio) {
            return precio >= 100;
        }

        // Método para contar cuántos productos tienen precios altos en cada mes
        public static int[] contarPreciosAltos(double[][] precios) {
            int[] conteo = new int[MESES];

            for (int j = 0; j < MESES; j++) {
                int contador = 0;
                for (int i = 0; i < PRODUCTOS; i++) {
                    if (esPrecioAlto(precios[i][j])) {
                        contador++;
                    }
                }
                conteo[j] = contador;
                System.out.println("Mes " + (j + 1) + ": " + contador + " productos con precio alto.");
            }
            return conteo;
        }

        // Método para calcular el promedio general de la matriz
        public static double calcularPromedioGeneral(double[][] precios) {
            double suma = 0;
            int totalElementos = PRODUCTOS * MESES;

            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    suma += precios[i][j];
                }
            }
            return suma / totalElementos;
        }

        // Método para mostrar productos cuyo promedio es mayor al promedio general
        public static void mostrarProductosMayorAlPromedio(double[][] precios, double promedioGeneral) {
            for (int i = 0; i < PRODUCTOS; i++) {
                double suma = 0;
                for (int j = 0; j < MESES; j++) {
                    suma += precios[i][j];
                }
                double promedioProducto = suma / MESES;
                if (promedioProducto > promedioGeneral) {
                    System.out.println("Producto " + (i + 1) + " con promedio: " + promedioProducto);
                }
            }
        }

        // Método para mostrar productos y meses con precios superiores al promedio general
        public static void mostrarPreciosSuperioresAlPromedio(double[][] precios, double promedioGeneral) {
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    if (precios[i][j] > promedioGeneral) {
                        System.out.println("Producto " + (i + 1) + ", Mes " + (j + 1) + " -> Precio: " + precios[i][j]);
                    }
                }
            }
        }
    }

