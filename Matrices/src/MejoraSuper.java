package logica.Matrices.src;
import java.util.Random;
import java.util.Scanner;
public class MejoraSuper {

        static final int PRODUCTOS = 50;
        static final int MESES = 6;

        public static void main(String[] args) {
            double[][] precios = new double[PRODUCTOS][MESES];
            double[] preciosMaximos = new double[PRODUCTOS];

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Llenar la matriz con valores aleatorios
            llenarMatrizAleatoria(precios, random);

            // Calcular los precios máximos de cada producto
            preciosMaximos = calcularPreciosMaximos(precios);

            // Contar cuántos productos tienen precios altos cada mes
            int[] productosAltosPorMes = contarPreciosAltos(precios);

            // Calcular el promedio general de todos los precios
            double promedioGeneral = calcularPromedioGeneral(precios);

            // Mostrar productos con promedio mayor al general
            System.out.println("\nProductos con promedio superior al general:");
            mostrarProductosMayorAlPromedio(precios, promedioGeneral);

            // Mostrar productos y meses con precios superiores al promedio
            System.out.println("\nProductos y meses con precios mayores al promedio general:");
            mostrarPreciosSuperioresAlPromedio(precios, promedioGeneral);

            scanner.close();
        }

        // Método para llenar la matriz manualmente
        public static void llenarMatrizManual(double[][] precios, Scanner scanner) {
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    System.out.print("Ingrese el precio del producto " + (i + 1) + " en el mes " + (j + 1) + ": ");
                    precios[i][j] = scanner.nextDouble();
                }
            }
        }

        // Método para llenar la matriz con valores aleatorios entre 0 y 200
        public static void llenarMatrizAleatoria(double[][] precios, Random random) {
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    precios[i][j] = random.nextDouble() * 200; // Precios entre 0 y 200
                }
            }
        }

        // Método para calcular el precio máximo de cada producto
        public static double[] calcularPreciosMaximos(double[][] precios) {
            double[] maximos = new double[PRODUCTOS];

            for (int i = 0; i < PRODUCTOS; i++) {
                double max = precios[i][0]; // Inicializar con el primer mes
                for (int j = 1; j < MESES; j++) {
                    if (precios[i][j] > max) {
                        max = precios[i][j];
                    }
                }
                maximos[i] = max;
            }
            return maximos;
        }

        // Método que determina si un precio es mayor o igual a 100
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


