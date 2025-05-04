package logica.Tema_Avanzados.Ejercicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        List<Snack> snacks = new ArrayList<>();
        System.out.println("Bienvenido a la maquina de snacks");
        Snack.mostrarSnacks();
        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
               // salir = ejecutarOpcion(opcion, consola, productos)
            }catch (Exception e){
                System.out.println("Ocurrio un error"+" "+e);
            }finally {
                System.out.println(" ");
            }
        }
    }
    private static int mostrarMenu(Scanner consola) {
        System.out.println("*** Menu ***");
        System.out.println("1. Comprar snack");
        System.out.println("2. Mostrar snacks");
        System.out.println("3. Salir");
        System.out.println("Ingresa una opcion:");
        return Integer.parseInt(consola.nextLine());
    }
}
