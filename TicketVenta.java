package logica;
import java.util.Scanner;
public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("***Ticket de Venta***");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el precio el primer producto:" + " ");
        var precio1 = Double.parseDouble(consola.nextLine());
        System.out.println(" ");
        System.out.println("Ingresa el preico del segundo producto:"+ "  ");
        var precio2 = Double.parseDouble(consola.nextLine());
        System.out.print(" ");
        System.out.print("Ingresa el precio del tercer producto:"+ " ");
        var precio3 = Double.parseDouble(consola.nextLine());
        System.out.println(" ");
        System.out.print("Precio del ultimo producto:"+ " ");
        var precio4 = Double.parseDouble(consola.nextLine());
        System.out.println(" ");
        var subtotal = precio1 + precio2 + precio3 + precio4 ;
        //impuesto
        var impuesto = subtotal*0.20;
        //total compra con inpuesto
        var costoTotal = subtotal + impuesto;

        System.out.printf("""
                 subtotal : $%.2f
                 Impuesto (16%%): $%.2f
                 Costo total de la compra: $%.2f
                """,subtotal,impuesto,costoTotal);


    }
}
