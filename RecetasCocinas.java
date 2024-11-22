package logica;
import java.util.Scanner;
public class RecetasCocinas {
    public static void main(String[] args) {
        System.out.println("***Recetas de cocina***");
        var receta = new Scanner (System.in);
        //nombre receta
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = receta.nextLine();

        //ingredientes
        System.out.println("Ingresa lo ingredientes");
        var ingredientes = receta.nextLine();

        // tiempo receta
        System.out.println("Ingresa el tiempo de preparacion (min)");
        var tiempoReceta = Integer.parseInt(receta.nextLine());

        // dificultad preparacion
        System.out.println("Ingresa la dificultad (facil,medio,dificil):");
        var dificultadReceta = receta.nextLine();

        //imprimir valores de receta

        System.out.println("\n***Receta de cocina***");
        System.out.println("\nnombre receta:"+ nombreReceta);
        System.out.println("\nIngredientes: "+ingredientes);
        System.out.println("\nTiempo preparacion:"+ tiempoReceta   + "MINUTOS");
        System.out.println("\nDidicultad:"+ dificultadReceta);
        
    }
}
