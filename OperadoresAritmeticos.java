package logica;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("***Operadores Aritmeticos***");
        int a= 56, b= 2, resultado=0;
        //suma
        resultado= a+b;
        System.out.println("resultado suma" +" "+ resultado);

        //resta
        resultado= a-b;
        System.out.println("Resultado resta"+" "+resultado);

        //multiplicacion
        resultado= a*b;
        System.out.println("Resultado multiplicacio"+ " "+ resultado);

        //division
        resultado= a/b;
        System.out.println("Resultado division"+ " "+resultado);

        //modulo (residuo de la division) %
        resultado= a%b;
        System.out.println("Modulo = " + resultado);
    }
}
