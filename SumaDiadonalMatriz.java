package logica;
import java.util.Scanner;
public class SumaDiadonalMatriz {
    public static void main(String[] args) {
        System.out.println("SUma de la diagonal de una matriz");
        int renglones,columnas;

        var consola = new Scanner(System.in);
        System.out.println("Ingrese el numero de renglones:");
        //definir la matriz
        renglones= Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese el numero de columnas:");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];
        //solicitar los valor
        //el cilo for mas externo permite manejar los renglones
        for (var ren=0; ren<renglones; ren++){
            for (var col=0; col<columnas;col++){
                System.out.println("valor["+ren+"]["+col+"]");
                matriz[ren][col]= Integer.parseInt(consola.nextLine());
            }
        }
        //suma diagonal de la matriz
        var SumaDiagonal =0;
        for (var rn=0; rn<renglones;rn++){
            for (var col=0;col<columnas;col++){
               if (rn==col){
                   SumaDiagonal += matriz[rn][col];
               }
            }
        }
        System.out.println( "La suma diagonal de la matriz es:"+SumaDiagonal);


    }
}
