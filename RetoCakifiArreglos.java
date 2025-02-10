package logica;
import java.util.Scanner;
public class RetoCakifiArreglos {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Ingrese el numero de cali4ficaciones que desea agregar?");
        var notas = consola.nextInt();

        int[] arreglo = new int[notas];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = consola.nextInt();
        }
        var sumaPromedio = 0;
        for (var i=0; i<notas; i++){
            sumaPromedio += notas;
        }
        var promedio = sumaPromedio / notas;
        System.out.println("El promedio es:"+ " "+ promedio);

    }
}
