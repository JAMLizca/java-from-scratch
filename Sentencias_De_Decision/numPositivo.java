package logica.Sentencias_De_Decision;
import java.util.Scanner;
public class numPositivo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa cualquier numero:");
        int numEntero =Integer.parseInt(consola.nextLine()) ;
        if (numEntero>0){
            System.out.println("Tu numero espositivo");
        }else if(numEntero<0){
            System.out.println("Tu numero es negativo");
        }else {
            System.out.println("Tu numero es cero");
        }
    }
}
