package logica;
import java.util.Scanner;
public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Systema de Autenticación ***");
        final var USUARIO_VALIDO = "admin";
        final var PASWORD_VALIDO = "123456789";
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu usuario:"+" ");
        var usuario = consola.nextLine();
        System.out.print("Ingresa tu contraseña:"+" ");
        var contrasena = consola.nextLine();

        var datosCorrectos = usuario.equals(USUARIO_VALIDO) && contrasena.equals(PASWORD_VALIDO);
        System.out.println("Los datos son correcto?"+" "+ datosCorrectos);

    }
}
