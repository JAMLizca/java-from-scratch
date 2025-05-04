package logica.Sentencias_De_Decision;
import java.util.Scanner;
public class tiendaEnLinea {
    //ejemplo de sentencia if else if, aplicando lo tratado anteriormente
    public static void main(String[] args) {
        System.out.println("*** Tienda en linea ***");
        System.out.println(" ");
        final var MONTO_COMPRA = 1000.00;
   Scanner monto = new Scanner(System.in);
        System.out.print("Ingrese el monto de tu compra?");
        var totalCompra =  Double.parseDouble(monto.nextLine());
        System.out.println(" ");
        System.out.println(" Eres miembro de la tienda (true/false");
        var miembro = Boolean.parseBoolean(monto.nextLine());
        //calcular descuento
        var descuento = 0.0;

        if( totalCompra >=  MONTO_COMPRA && miembro){
            descuento= 0.1;
        }
        else if (miembro){
            descuento= 0.5; //descuento del 5%
        }else{
            descuento = 0; //descuento del 0%
        }
        //calculos respectivos para el monto final
        if (descuento !=0) {
            var montoDescuento = totalCompra * descuento;
            var montoFinal = totalCompra - montoDescuento;
            System.out.printf("""
                            %nFelicidades, has obtenido un descuento del %.2f%%
                            Monto de la compra: $%.2f
                            Monto del descuento: $%.2f
                            Monto final de la compra con descuento: $%.2f\n
                            """, descuento * 100, totalCompra, montoDescuento, totalCompra - montoDescuento); // Calcula el monto final

        }else{
            System.out.printf("""
                    %nNo obtuvistes ningun descuento.
                    Te invito hacer parte de la tienda
                    Monto final de la compra: $%.2f%n
                    """);
        }
    }
}
