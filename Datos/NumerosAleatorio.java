package logica;
import java.util.Random;
public class NumerosAleatorio {
    //numero aleatorio
    public static void main(String[] args) {
        Random random = new Random();
        var numero = random.nextInt(100)+1;
        System.out.println("numero = " + numero);

    }
}
