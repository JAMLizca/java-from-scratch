package logica.Matrices.src;
import java.util.Random;
import java.util.Scanner;
/*public class OtraVez {
        static final int FILAS = 50; // Productos
        static final int COLUMNAS = 6; // Meses

        public static void main(String[] args) {
            double[][] precios = llenarMatrizManual(); // O usar llenarMatrizAleatoria()
            double[] preciosMaximos = calcularPreciosMaximos(precios);
            double promedioGeneral = calcularPromedioGeneral(precios);

            System.out.println("Productos con promedio superior al promedio general:");
            for (int i = 0; i < FILAS; i++) {
                double promedioProducto = calcularPromedioProducto(precios[i]);
                if (promedioProducto > promedioGeneral) {
                    System.out.println("Producto " + (i + 1));
                }
            }

            System.out.println("\nPrecios más altos que el promedio:");
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    if (precios[i][j] > promedioGeneral) {
                        System.out.println("Producto " + (i + 1) + " - Mes " + (j + 1) + ": " + precios[i][j]);
                    }
                }
            }
        }

        public static double[][] llenarMatrizManual() {
            Scanner scanner = new Scanner(System.in);
            double[][] matriz = new double[FILAS][COLUMNAS];

            for (int i = 0; i < FILAS; i++) {
                System.out.println("Ingrese los precios del producto " + (i + 1) + " para los 6 meses:");
                for (int j = 0; j < COLUMNAS; j++) {
                    matriz[i][j] = scanner.nextDouble();
                }
            }
            return matriz;
        }

        public static double[][] llenarMatrizAleatoria() {
            Random random = new Random();
            double[][] matriz = new double[FILAS][COLUMNAS];

            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    matriz[i][j] = random.nextDouble() * 200; // Precio aleatorio entre 0 y 200
                }
            }
            return matriz;
        }

        public static double[] calcularPreciosMaximos(double[][] matriz) {
            double[] maximos = new double[FILAS];

            for (int i = 0; i < FILAS; i++) {
                double max = 0;
                for (int j = 0; j < COLUMNAS; j++) {
                    if (matriz[i][j] > max) {
                        max = matriz[i][j];
                    }
                }
                maximos[i] = max;
            }
            return maximos;
        }

        public static boolean esPrecioAlto(double precio) {
            return precio >= 100;
        }

        public static double calcularPromedioGeneral(double[][] matriz) {
            double suma = 0;
            int contador = 0;

            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
            return suma / contador;
        }

        public static double calcularPromedioProducto(double[] precios) {
            double suma = 0;
            for (double precio : precios) {
                suma += precio;
            }
            return suma / COLUMNAS;
        }
    }

 */

public class OtraVez{

    public static final int NUM_PRODUCTOS = 50;
    public static final int NUM_MESES = 6;

    public static void main(String[] args) {
        // Llenamos la matriz de precios y el vector de máximos con valores aleatorios
        double[][] precios = llenarMatrizAleatoria();
        double[] preciosMaximos = obtenerPreciosMaximos(precios);

        // Calculamos el promedio general de todos los precios
        double promedioGeneral = calcularPromedioGeneral(precios);

        // Mostramos la cantidad de productos con precio alto (>= 100) por cada mes
        for (int mes = 0; mes < NUM_MESES; mes++) {
            int cont = contarPreciosAltosPorMes(precios, mes);
            System.out.println("Mes " + (mes+1) + ": " + cont + " productos tienen precio alto (>=100).");
        }

        System.out.println("\nProductos con promedio individual mayor que el promedio general (" + promedioGeneral + "):");
        // Listado de productos cuyo promedio individual es mayor que el promedio general
        for (int i = 0; i < NUM_PRODUCTOS; i++) {
            double promedioProducto = calcularPromedioProducto(precios[i]);
            if (promedioProducto > promedioGeneral) {
                System.out.println("Producto " + i + " - Promedio: " + promedioProducto);
            }
        }

        System.out.println("\nMes(es) para cada producto cuyo precio es mayor que el promedio individual del producto:");
        // Para cada producto, mostrar los meses en los que el precio es mayor que el promedio del producto
        for (int i = 0; i < NUM_PRODUCTOS; i++) {
            double promedioProducto = calcularPromedioProducto(precios[i]);
            System.out.print("Producto " + i + " (Promedio: " + promedioProducto + "): Mes(es) ");
            boolean hayMes = false;
            for (int mes = 0; mes < NUM_MESES; mes++) {
                if (precios[i][mes] > promedioProducto) {
                    System.out.print((mes+1) + " ");
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
        for (int j = 0; j < NUM_MESES; j++) {
            suma += preciosProducto[j];
        }
        return Math.round((suma / NUM_MESES) * 100.0) / 100.0;
    }
}
