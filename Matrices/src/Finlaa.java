package logica.Matrices.src;
import java.util.Scanner;

public class Finlaa {
        static final int PRODUCTOS = 50;
        static final int MESES = 6;

        public static void main(String[] args) {
            double[][] precios = llenarMatriz(); // Llenar matriz con datos ingresados por el usuario
            double[] preciosMaximos = obtenerPreciosMaximos(precios);

            double promedioGeneral = calcularPromedioGeneral(precios);

            System.out.println("\nProductos con un promedio más alto que el promedio general:");
            mostrarProductosPromedioAlto(precios, promedioGeneral);

            System.out.println("\nProductos y meses con precios más altos que el promedio:");
            mostrarProductosPreciosAltos(precios, promedioGeneral);
        }

        // Método para llenar la matriz con entrada del usuario
        public static double[][] llenarMatriz() {
            Scanner sc = new Scanner(System.in);
            double[][] matriz = new double[PRODUCTOS][MESES];

            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    System.out.print("Ingrese el precio del producto " + (i + 1) + " en el mes " + (j + 1) + ": ");
                    matriz[i][j] = sc.nextDouble();
                }
            }
            return matriz;
        }

        // Método para obtener el precio máximo de cada producto
        public static double[] obtenerPreciosMaximos(double[][] precios) {
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

        // Método para determinar si un precio es alto (>= 100)
        public static boolean esPrecioAlto(double precio) {
            return precio >= 100;
        }

        // Método para calcular el promedio general de todos los precios
        public static double calcularPromedioGeneral(double[][] precios) {
            double suma = 0;
            int total = PRODUCTOS * MESES;

            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    suma += precios[i][j];
                }
            }
            return suma / total;
        }

        // Mostrar productos con promedio mayor al general
        public static void mostrarProductosPromedioAlto(double[][] precios, double promedioGeneral) {
            for (int i = 0; i < PRODUCTOS; i++) {
                double suma = 0;
                for (int j = 0; j < MESES; j++) {
                    suma += precios[i][j];
                }
                double promedio = suma / MESES;
                if (promedio > promedioGeneral) {
                    System.out.println("Producto " + (i + 1) + " con promedio " + promedio);
                }
            }
        }

        // Mostrar productos y meses con precios más altos que el promedio general
        public static void mostrarProductosPreciosAltos(double[][] precios, double promedioGeneral) {
            for (int i = 0; i < PRODUCTOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    if (precios[i][j] > promedioGeneral) {
                        System.out.println("Producto " + (i + 1) + ", Mes " + (j + 1) + " - Precio: " + precios[i][j]);
                    }
                }
            }
        }
    }

