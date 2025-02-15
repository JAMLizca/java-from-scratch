import java.util.Scanner;

public class FuncionPar {

    //saber si un num  es par

    static boolean esPar(int num){
     //   if (num%2==0){
        //  return true;

      //  }else
        //    return false;
        return (num%2==0)? true:false;
    }

    public static void main(String[] args) {
        System.out.println("Proporciona un valor numerico:");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Numero par?"+ " "+ esPar(numero));
    }
}
