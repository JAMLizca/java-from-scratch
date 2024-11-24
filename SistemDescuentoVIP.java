package logica;

import java.util.Scanner;

public class SistemDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("***Sistema descuento VIP***");
        final var NO_PRODUCTO_DESCUENTO = 10;
        var consola =new Scanner(System.in);
        System.out.println("Cuantos productos comprastes?");
        var cantidadProducto = Integer.parseInt(consola.nextLine());
        System.out.println("Tienes la menbresia(true/false)");
        var membresia = Boolean.parseBoolean(consola.nextLine());
        var elegibleDescuento =
                cantidadProducto >= NO_PRODUCTO_DESCUENTO && membresia;
        System.out.println("Tiene acceso al descuento VIP? = " + elegibleDescuento);

    }
}
