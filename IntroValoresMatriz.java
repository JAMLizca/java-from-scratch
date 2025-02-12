package logica;
import java.util.Scanner;
public class IntroValoresMatriz {
    public static void main(String[] args) {
        //introducir valores en una matriz

        int renglones, colummnas;
         var consola = new Scanner(System.in);

         //definir matriz

        System.out.println("Proporciona los renglones:");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.println("Inrgese el numeros de columnas:");
        colummnas= Integer.parseInt(consola.nextLine());

        var matriz = new int [renglones][colummnas];
        for (var ren=0; ren<renglones; ren++){
            for(var col=0; col<colummnas; col++){
                System.out.println("Valor ["+ren+"]["+col+"] = ");
                matriz[ren][col]= Integer.parseInt(consola.nextLine());


            }
        }
        //Iterar los valores de la matriz

        for (var ren=0; ren<renglones; ren++){
            for(var col=0; col<colummnas;col++){
                System.out.println("Matriz["+ren+"]["+col+"]= "+ matriz[ren][col]);
            }
        }

    }
}
