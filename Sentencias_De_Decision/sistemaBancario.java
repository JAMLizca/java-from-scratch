package logica.Sentencias_De_Decision;
import java.util.Scanner;
public class sistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Sistema Bancario ***");
        var consola = new Scanner (System.in);
        System.out.print("Desea salir del sistema (true/flasse)?");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());
        //verificacion (aplicamos logica inversa)
        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema.....");
        }else{
            System.out.println("Saliendo del sistema....");
        }

    }
}
