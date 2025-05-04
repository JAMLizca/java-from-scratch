package logica.Sentencias_De_Decision;
 import java.util.Scanner;
public class sistemaReservaHotel2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Sistema reserva hotel");
        System.out.println(" ");

        System.out.println("Ingresa tu nombre");
        var nombre = consola.nextLine();

        System.out.println("Cuantos dias te vas a quedar en el hotel?");
        var dias = Integer.parseInt(consola.nextLine());

        System.out.println("Cuarto con vista al mar? (true/false)");
        var cuartoVista = consola.nextLine();

        if(cuartoVista.equals("true")) {
            var total  = dias* 190.50;

            System.out.println("El costo toatal de tu reserva"+" "+nombre + " es de: "+total+" "+ " "+"con vista al mar");
        }else{
            var total2 = dias* 150.50;
            System.out.println("El costo toatal de tu reserva "+" "+ nombre+"es de: "+total2+" "+" "+ "sin vista al mar");
        }

        /*
         el método .equals se utiliza para comparar si dos objetos son iguales en términos de contenido


         */

    }
}
