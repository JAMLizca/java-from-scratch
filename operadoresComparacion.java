package logica;

public class operadoresComparacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de Comparacion***");
             int a = 3 , b=4;
             
             //igualdad
        var resultado = a == b; //podemos utilizar parentesis no es obligatorio (a==b)
        System.out.println("resultado de a == b = " + resultado);
        
        //Distinto
        resultado= a != b;
        System.out.println("resultado = " + resultado);
        
        //mayor que
        resultado = a>b;
        System.out.println("resultado = " + resultado);
        
        //mayor o igual
        resultado = a>=b;
        System.out.println("resultado = " + resultado);
        
        //menor que
        resultado = a<b;
        System.out.println("resultado = " + resultado);
        
        //menor o igual
        resultado= a<=b;
        System.out.println("resultado = " + resultado);
        


        //Pon en practica
    }
}
