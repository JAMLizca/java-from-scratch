package logica;

public class mayorDeDosNum {
    public static void main(String[] args) {
        System.out.println("Mayor de dos numeros");

        var consola = new java.util.Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        var numero1 = consola.nextInt();
        System.out.println("Ingrese el segundo numero");
        var numero2 = consola.nextInt();
        if (numero1>numero2){
            System.out.println("El numero mayor es: " + numero1);
        }else {
            System.out.println("El numero mayor es: " + numero2);
        }
    }
}
