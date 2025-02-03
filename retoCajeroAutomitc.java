package logica;
import java.util.Scanner;

public class retoCajeroAutomitc {
    public static void main(String[] args) {
            var DEPOSITAR =0;
            var RETIRAR=0;
            var CONSULTAR_SALDO=10000;
            var salir = false;

            var depoReCon = new Scanner(System.in);

        System.out.println("---Cajero Automatico---");
        System.out.println("Operaciones que puedes realizar: ");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4.Salir");
        System.out.println("Ingresa una opcion:");
        var opcion = depoReCon.nextLine();
        while (!salir)

             if (opcion.equals("1")) {
                 System.out.println("Ingrese la cantidad a depositar:");
                 var cantidad = depoReCon.nextInt();
                 DEPOSITAR += cantidad;
                 System.out.println("Su saldo actual es de: " + DEPOSITAR);
                 break;
             }   else if (opcion.equals("2")) {
                 System.out.println("Ingrese la cantidad a retirar:");
                 var cantidad = depoReCon.nextInt();
                 RETIRAR += cantidad;
                 System.out.println("Su saldo actual es de: " + RETIRAR);
                 break;
             }else if (opcion.equals("3")) {
                 System.out.println("Su saldo actual es de: " + CONSULTAR_SALDO);
                 break;
             }else{
                 System.out.println("Gracias por su visita");
                 salir = true;
             }


    }
}
