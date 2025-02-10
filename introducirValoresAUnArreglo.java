package logica;
import java.util.Scanner;
public class introducirValoresAUnArreglo {
    public static void main(String[] args) {
        var consola= new Scanner(System.in);
        int[] arreglo = new int[5];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i]= consola.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El valor del arreglo ["+i+"] es: "+arreglo[i]);
        }



    }
}
