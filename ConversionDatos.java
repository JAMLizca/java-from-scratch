package logica;

 import java.util.Scanner;
public class ConversionDatos {
    public static void main(String[] args) {
        var nombre = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre.nextLine();
        System.out.println("nombre = " + nombre);

        //conversion de datos
        System.out.println("Ingresa un valor entero=");
        var enteroString = nombre.nextLine();
        /*
        clase integer con un metodo parseInt, recive una cadena y 
        nos da uun valor tipo entero
         */
        //var entero= Integer.prseInt(enteroString);
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        
        //tipo flotante
        System.out.println("Proporciona un valor tipo flotante");
        var flotante = Float.parseFloat(nombre.nextLine());
        System.out.println("flotante = " + flotante);
        
    }
}
