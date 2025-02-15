import java.util.Scanner;
public class ejercicioOperadores {
    public static void main(String[] args) {
        System.out.println("***Valor dentro de un rango***");
        //definimos los limites
        final var MINIMA = 0;
        final var MAXIMO = 5;
        //solicitar un valor entre  0 y 5
        System.out.println("Proporciona un numero entre 0 y 5:");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //verificar si el dato esta en el rango
        var estaRango = dato >= MINIMA && dato <= MAXIMO;
        System.out.println("Esta en el rango? = "+" " + estaRango);

        //pon en practica :v
    }
}
