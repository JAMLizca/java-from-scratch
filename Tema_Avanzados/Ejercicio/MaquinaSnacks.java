package logica.Tema_Avanzados.Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        List<Snacks> productos = new ArrayList<>();
        System.out.println("Bienvenido a la maquina de snacks");

        while (!salir) {
            try {
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpcion(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            } finally {
                System.out.println();
            }
        }
        consola.close();
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.println("*** Menú ***");
        System.out.println("1. Comprar snack");
        System.out.println("2. Mostrar ticket");
        System.out.println("3. Salir");
        System.out.print("Ingresa una opción: ");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpcion(int opcion, Scanner consola, List<Snacks> productos) {
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> {
                System.out.println("Gracias por usar la máquina de snacks.");
                return true;
            }
            default -> System.out.println("Opción inválida.");
        }
        return false;
    }

    private static void comprarSnack(Scanner consola, List<Snacks> productos) {
        Snack.mostrarSnacks();
        System.out.print("Ingresa el ID del snack que deseas comprar: ");
        int idSnack = Integer.parseInt(consola.nextLine());

        boolean snackEncontrado = false;
        for (Snacks snack : Snack.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                productos.add(snack);
                System.out.println("¡Compraste: " + snack.getNombre() + " por $" + snack.getPrecio() + "!");
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado) {
            System.out.println("Snack no encontrado.");
        }
    }

    private static void mostrarTicket(List<Snacks> productos) {
        String ticket = "*** Ticket de venta ***";
        double total = 0.0;
        for (Snacks producto : productos) {
            ticket += "\n" + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\nTotal: $" + total;
        System.out.println(ticket);
    }
}
