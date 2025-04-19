package logica.Matrices.src;
import java.util.Scanner;
public class NuevaMejora {

        public static final int NUM_PRODUCTOS = 50;
        public static final int NUM_MESES = 6;

        public static void main(String[] args) {
            // Llenamos la matriz de precios y el vector de máximos con valores aleatorios
            double[][] precios = llenarMatrizAleatoria();
            double[] preciosMaximos = obtenerPreciosMaximos(precios);

            // Calculamos el promedio general de todos los precios
            double promedioGeneral = calcularPromedioGeneral(precios);

            // Mostramos la cantidad de productos con precio alto  por cada mes
            for (int mes = 0; mes < NUM_MESES; mes++) {
                int cont = contarPreciosAltosPorMes(precios, mes);
                System.out.println("Mes " + (mes + 1) + ": " + cont + " productos tienen precio alto.\n");
            }

            System.out.println("Productos con promedio individual mayor que el promedio general (" + promedioGeneral + "):");
            // Listado de productos cuyo promedio individual es mayor que el promedio general
            for (int i = 0; i < NUM_PRODUCTOS; i++) {
                double promedioProducto = calcularPromedioProducto(precios[i]);
                if (promedioProducto > promedioGeneral) {
                    System.out.println("Producto " + (i + 1) + " - Promedio: " + promedioProducto);
                }
            }

            System.out.println("\nMes(es) para cada producto cuyo precio es mayor que el promedio individual del producto:");
            // Para cada producto, mostrar los meses en los que el precio es mayor que el promedio del producto
            for (int i = 0; i < NUM_PRODUCTOS; i++) {
                double promedioProducto = calcularPromedioProducto(precios[i]);
                System.out.print("Producto " + (i + 1) + " (Promedio: " + promedioProducto + "): Mes: ");
                boolean hayMes = false;
                for (int mes = 0; mes < NUM_MESES; mes++) {
                    if (precios[i][mes] > promedioProducto) {
                        System.out.print((mes + 1) + " ");
                        hayMes = true;
                    }
                }
                if (!hayMes) {
                    System.out.print("Ninguno");
                }
                System.out.println();
            }
        }

        // Método que llena la matriz de precios con valores aleatorios válidos (entre 0 y 200)
        public static double[][] llenarMatrizAleatoria() {
            double[][] matriz = new double[NUM_PRODUCTOS][NUM_MESES];
            for (int i = 0; i < NUM_PRODUCTOS; i++) {
                for (int j = 0; j < NUM_MESES; j++) {
                    // Genera un valor aleatorio entre 0 y 200 (puede ser 0)
                    matriz[i][j] = Math.round(Math.random() * 200 * 100.0) / 100.0; // redondeado a 2 decimales
                }
            }
            return matriz;
        }

        // Método que obtiene un vector de precios máximos para cada producto
        public static double[] obtenerPreciosMaximos(double[][] matriz) {
            double[] maximos = new double[NUM_PRODUCTOS];
            for (int i = 0; i < NUM_PRODUCTOS; i++) {
                double max = matriz[i][0];
                for (int j = 1; j < NUM_MESES; j++) {
                    if (matriz[i][j] > max) {
                        max = matriz[i][j];
                    }
                }
                maximos[i] = max;
            }
            return maximos;
        }

        // Método estático que determina si un precio es alto (>= 100)
        public static boolean esPrecioAlto(double precio) {
            return precio >= 100;
        }

        // Método para contar cuántos productos tienen precio alto en un mes específico
        public static int contarPreciosAltosPorMes(double[][] matriz, int mes) {
            int contador = 0;
            for (int i = 0; i < NUM_PRODUCTOS; i++) {
                if (esPrecioAlto(matriz[i][mes])) {
                    contador++;
                }
            }
            return contador;
        }

        // Método que calcula el promedio general de todos los precios de la matriz
        public static double calcularPromedioGeneral(double[][] matriz) {
            double suma = 0;
            int total = NUM_PRODUCTOS * NUM_MESES;
            for (int i = 0; i < NUM_PRODUCTOS; i++) {
                for (int j = 0; j < NUM_MESES; j++) {
                    suma += matriz[i][j];
                }
            }
            return Math.round((suma / total) * 100.0) / 100.0; // redondeado a 2 decimales
        }

        // Método que calcula el promedio de los precios de un producto (fila de la matriz)
        public static double calcularPromedioProducto(double[] preciosProducto) {
            double suma = 0;
            for (double precio : preciosProducto) {
                suma += precio;
            }
            return Math.round((suma / NUM_MESES) * 100.0) / 100.0;
        }
    }
