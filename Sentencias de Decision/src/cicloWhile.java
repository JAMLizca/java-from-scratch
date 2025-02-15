import java.util.Scanner;
public class cicloWhile {
    public static void main(String[] args) {
      var consola = new Scanner(System.in);
        System.out.println("Ingresa un num:"+ " ");

        var num = Integer.parseInt(consola.nextLine());

        while(num<=100){
            System.out.println(num++);


        }
    }
    /*
    num par= contador % 2 == 0
    *Dentro de los while podemos anidar un if

     */


}
