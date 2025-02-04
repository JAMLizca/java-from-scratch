package logica;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("---Calculadora---");
            System.out.print("Ingresa el primer número: ");
            int num1 = consola.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int num2 = consola.nextInt();

            System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir por 0");
                    } else {
                        System.out.println("División: " + ((double) num1 / num2)); // C12onversión a double
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        }

        consola.close(); // Cerrar Scanner
    }
}
