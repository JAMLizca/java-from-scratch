import java.util.Scanner;

public class TiendaJuguetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int total = 0;
        int cantidadCarro = 0, cantidadMuñeca = 0, cantidadPelota = 0, cantidadRompecabezas = 0;

        while (continuar) {
            System.out.println("\n--- Menú de Compras de Juguetes ---");
            System.out.println("1. Carro de juguete - $10");
            System.out.println("2. Muñeca - $15");
            System.out.println("3. Pelota - $5");
            System.out.println("4. Rompecabezas - $20");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                total += 10;
                cantidadCarro++;
                System.out.println("Carro de juguete agregado al carrito.");
            } else if (opcion == 2) {
                total += 15;
                cantidadMuñeca++;
                System.out.println("Muñeca agregada al carrito.");
            } else if (opcion == 3) {
                total += 5;
                cantidadPelota++;
                System.out.println("Pelota agregada al carrito.");
            } else if (opcion == 4) {
                total += 20;
                cantidadRompecabezas++;
                System.out.println("Rompecabezas agregado al carrito.");
            } else if (opcion == 5) {
                continuar = false;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            if (continuar) {
                System.out.print("\n¿Desea generar factura? (s/n): ");
                char respuesta = scanner.nextLine().charAt(0);
                if (respuesta == 's' || respuesta == 'S') {
                    generarFactura(total, cantidadCarro, cantidadMuñeca, cantidadPelota, cantidadRompecabezas);
                    total = 0;
                    cantidadCarro = cantidadMuñeca = cantidadPelota = cantidadRompecabezas = 0;
                }
            }
        }
        System.out.println("Gracias por su visita.");
        scanner.close();
    }

    public static void generarFactura(int total, int cantidadCarro, int cantidadMuñeca, int cantidadPelota, int cantidadRompecabezas) {
        System.out.println("\n--- Factura de Compra ---");
        if (cantidadCarro > 0) System.out.println("Carro de juguete x" + cantidadCarro + " - $" + (cantidadCarro * 10));
        if (cantidadMuñeca > 0) System.out.println("Muñeca x" + cantidadMuñeca + " - $" + (cantidadMuñeca * 15));
        if (cantidadPelota > 0) System.out.println("Pelota x" + cantidadPelota + " - $" + (cantidadPelota * 5));
        if (cantidadRompecabezas > 0) System.out.println("Rompecabezas x" + cantidadRompecabezas + " - $" + (cantidadRompecabezas * 20));
        System.out.println("Total a pagar: $" + total);
    }
}
