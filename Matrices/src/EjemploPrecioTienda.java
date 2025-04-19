package logica.Matrices.src;
import java.util.Random;

public class EjemploPrecioTienda {
    static final int FILAS = 50; // Productos
    static final int COLUMNAS = 6; // Meses
    static final double PRECIO_TOPE = 100.0; // Precio límite para considerar "alto"

    public static void main(String[] args) {
        double[][] precios = new double[FILAS][COLUMNAS]; // Matriz de precios
        double[] maximos = new double[FILAS]; // Vector de precios máximos

        llenarMatriz(precios);
        calcularMaximos(precios, maximos);

        double promedioGeneral = calcularPromedio(precios);

        System.out.println("Promedio general de precios: " + promedioGeneral);
        mostrarProductosMayorPromedio(precios, promedioGeneral);
        mostrarPreciosMayorPromedio(precios, promedioGeneral);

        // Contar cuántos productos tienen al menos un precio mayor a PRECIO_TOPE
        int productosConPrecioAlto = contarProductosConPrecioAlto(precios, PRECIO_TOPE);
        System.out.println("\nCantidad de productos con al menos un precio mayor a " + PRECIO_TOPE + ": " + productosConPrecioAlto);
    }

    // Método para llenar la matriz con valores aleatorios entre 50 y 150
    public static void llenarMatriz(double[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = 50 + rand.nextDouble() * 100; // Precios entre 50 y 150
            }
        }
    }

    // Método para calcular el precio máximo de cada producto
    public static void calcularMaximos(double[][] matriz, double[] maximos) {
        for (int i = 0; i < FILAS; i++) {
            double max = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            maximos[i] = max;
        }
    }

    // Método para calcular el promedio general de los precios
    public static double calcularPromedio(double[][] matriz) {
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

    // Método estático para determinar si un precio es alto
    public static boolean esPrecioAlto(double precio) {
        return precio > PRECIO_TOPE;
    }

    // Método para contar cuántos productos tienen al menos un precio mayor a PRECIO_TOPE
    public static int contarProductosConPrecioAlto(double[][] matriz, double precioTope) {
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (esPrecioAlto(matriz[i][j])) {
                    contador++;
                    break; // Si ya tiene un precio alto, pasamos al siguiente producto
                }
            }
        }
        return contador;
    }

    // Método para mostrar los productos con precio promedio mayor al general
    public static void mostrarProductosMayorPromedio(double[][] matriz, double promedio) {
        System.out.println("\nProductos con precio promedio mayor al general:");
        for (int i = 0; i < FILAS; i++) {
            double suma = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];
            }
            double promedioProducto = suma / COLUMNAS;
            if (promedioProducto > promedio) {
                System.out.println("Producto " + (i + 1) + " - Promedio: " + promedioProducto);
            }
        }
    }

    // Método para mostrar los productos y meses donde el precio es mayor que el promedio general
    public static void mostrarPreciosMayorPromedio(double[][] matriz, double promedio) {
        System.out.println("\nProductos y meses con precios mayores al promedio:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (matriz[i][j] > promedio) {
                    System.out.println("Producto " + (i + 1) + " - Mes " + (j + 1) + " - Precio: " + matriz[i][j]);
                }
            }
        }
    }
}

