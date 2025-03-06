import java.util.Scanner;

public class Peaje {
    private static final int DIAS = 30;
    private static final int FRANJAS = 4;
    private static int[][] matriz = new int[DIAS][FRANJAS];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        llenarMatriz();
        mostrarEncabezado();
        generarReporteDiario(scanner);
        calcularPromedioPorFranja();
        determinarDiasMayorMenorCirculacion();
        scanner.close();
    }
    
    private static void llenarMatriz() {
        for (int i = 0; i < DIAS; i++) {
            for (int j = 0; j < FRANJAS; j++) {
                matriz[i][j] = (j == 0 || j == 3) ? (int) (Math.random() * 71) + 10 : (int) (Math.random() * 91) + 60;
            }
        }
    }
    
    private static void mostrarEncabezado() {
        System.out.println("------------------------------");
        System.out.println(" reporte de vehiculos peaje ");
        System.out.println("------------------------------");
    }
    
    private static void generarReporteDiario(Scanner scanner) {
        System.out.print("ingrese un numero de dia (1-30): ");
        int dia = scanner.nextInt();
        
        if (dia >= 1 && dia <= DIAS) {
            System.out.println("\n------------------------------");
            System.out.println(" reporte del dia " + dia);
            System.out.println("------------------------------");
            System.out.println("hora 0-6   hora 6-12   hora 12-18   hora 18-24");
            System.out.println("----------------------------------------------");
            System.out.println(matriz[dia-1][0] + "          " + matriz[dia-1][1] + "          " + matriz[dia-1][2] + "          " + matriz[dia-1][3]);
            
            int franja_00_12 = matriz[dia-1][0] + matriz[dia-1][1];
            int franja_12_24 = matriz[dia-1][2] + matriz[dia-1][3];
            System.out.println("----------------------------------------------");
            System.out.println("00-12 total: " + franja_00_12);
            System.out.println("12-24 total: " + franja_12_24);
        } else {
            System.out.println("dia fuera de rango.");
        }
    }
    
    private static void calcularPromedioPorFranja() {
        double[] sumaFranja = new double[FRANJAS];
        
        for (int i = 0; i < DIAS; i++) {
            for (int j = 0; j < FRANJAS; j++) {
                sumaFranja[j] += matriz[i][j];
            }
        }
        
        System.out.println("\n------------------------------");
        System.out.println(" promedio de vehiculos por franja ");
        System.out.println("------------------------------");
        System.out.println("hora 0-6   hora 6-12   hora 12-18   hora 18-24");
        System.out.println("----------------------------------------------");
        System.out.println((int)(sumaFranja[0] / DIAS) + "          " + (int)(sumaFranja[1] / DIAS) + "          " + (int)(sumaFranja[2] / DIAS) + "          " + (int)(sumaFranja[3] / DIAS));
    }
    
    private static void determinarDiasMayorMenorCirculacion() {
        int[] totalDia = new int[DIAS];
        int mayor = 0, menor = Integer.MAX_VALUE, diaMayor = 1, diaMenor = 1;
        
        for (int i = 0; i < DIAS; i++) {
            totalDia[i] = matriz[i][0] + matriz[i][1] + matriz[i][2] + matriz[i][3];
            if (totalDia[i] > mayor) {
                mayor = totalDia[i];
                diaMayor = i + 1;
            }
            if (totalDia[i] < menor) {
                menor = totalDia[i];
                diaMenor = i + 1;
            }
        }
        
        System.out.println("\n------------------------------");
        System.out.println(" dias con mayor y menor circulacion ");
        System.out.println("------------------------------");
        System.out.println("dia con mayor circulacion: " + diaMayor + "  vehiculos: " + mayor);
        System.out.println("dia con menor circulacion: " + diaMenor + "  vehiculos: " + menor);
    }
}
