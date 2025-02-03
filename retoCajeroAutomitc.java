package logica;
import java.util.Scanner;

public class retoCajeroAutomitc {
    public static void main(String[] args) {
        int saldo = 10000;  // Saldo inicial
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir) {
            // Mostrar opciones
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            String opcion = scanner.nextLine(); // Leer opción como String para evitar errores

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int deposito = scanner.nextInt();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida. Intente de nuevo.");
                    }
                    scanner.nextLine(); // Limpiar el buffer
                    break;

                case "2":
                    System.out.print("Ingrese la cantidad a retirar: ");
                    int retiro = scanner.nextInt();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o cantidad inválida.");
                    }
                    scanner.nextLine(); // Limpiar el buffer
                    break;

                case "3":
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case "4":
                    System.out.println("Gracias por su visita.");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
