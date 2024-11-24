package logica;
import java.util.Scanner;
public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un dato entero");
        var dato = Integer.parseInt(consola.nextLine());
        //revisar si esta dentro del campo (entre 1 y 2)
        var estRango = dato >=1 && dato <= 10;
        System.out.println("variable entre el rango = " +" "+ estRango);

        // revisar logica inversa
        var estaFueraRango = !(dato >=1 &&  dato <= 10);
        System.out.println("variable fuera de rango  = " +" "+ estaFueraRango);

        //Practica :v

    }
}
