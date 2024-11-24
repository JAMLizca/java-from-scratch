package logica;

public class operadoresLogicos {
    public static void main(String[] args) {
        System.out.println("***Operadores Logicos***");

        /*Estos operadores evaluandos valores logicos (boolean) y regresa un valor logico(true/false)
        * && (and) = Regresa verdadero si ambos son true
        * || (or) = Regresa verdadero si cualquiera es true
        * ! (negacion) = invierte el valor logico solo usa un operando
         */

        System.out.println("Operador and");
        boolean a= true, b= false;
        var resultado= a && b;
        System.out.println("resultado = " + resultado);
        System.out.println("  ");

        boolean c= true, d=false;
        var resul = a || b; // caracter pai ||
        System.out.println("resultado || = " + resul);
        System.out.println(" ");


        var  e = false;
        //Operador not ! (invierte el valor logico)
        var solucion =  !e;
        System.out.println("solucion ! = " + solucion);

    }
}
