package logica;

public class dibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("Dibujar triangulo");
        var consola = new java.util.Scanner(System.in);
        System.out.println("Proporciona el num de filas");
        var filas = consola.nextInt();
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j <= i; j++) {
                //for (var k=0; k<i-j; k++){
                System.out.print(" d");
                // }
            }
            System.out.println();
        }
        //for(var fila =1; fila<=numfila; fila++9{
        //vara espacioWhite = " ".repeat(numfila-fila;

    }
         /*
         si quieres seguir probando puedes quitarle el comentario al fragmento de codigo, de lo contrario puedes
         añadir otros fory experimentar por ti mismo, suerte!!
          */

    }
}
