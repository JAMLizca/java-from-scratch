package logica;
import java.util.Scanner;
public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calcular area y perimetro del rectanguloa ***");
        var consola = new Scanner(System.in);
        System.out.println("Ingresa la base:");
        var base =  Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa la altura:");
        var altura = Integer.parseInt(consola.nextLine());

        //calculo
        var calculo = base + altura;
        System.out.println("El area del rectangulo es:"+" "+ calculo);
        var perimetro = (base * altura)*2;
        System.out.println("El perimetro es:"+perimetro);



    }
}
