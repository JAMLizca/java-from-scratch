package logica;

public class matrices {
    public static void main(String[] args) {

        //ejemplo de matrices
       // int [][] matriz = new int [2][3];
        /*
        esta es una matriz de dos renglones y tres columnas
         */


        var matriz = new int [][]{{1,2,3},{3,2,1}};

        //modificar los valores

        //recorrer una matriz
        //recorrer los renglones
        for (var ren=0; ren<matriz.length; ren++){
            //recorrer las columnas
            for (var col =0; col<matriz[ren].length; col++){
                System.out.println("Valor ["+ren+"]["+col+"] ="+ matriz [ren][col]);
            }
        }


        //acceder a estos valores
        //System.out.println("valor 1 [0][0] ="+ "  "+ matriz [0][0]);

       // for (var i = 0; i< matriz.length; i++)
           // System.out.println();



    }
}
