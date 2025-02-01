package logica;

public class operadorTernario {
    public static void main(String[] args) {
        //Es una forma concisa de realizar una operacion if-else en una sola linea de codigo.

        //sintaxis

        /*
         condicion ? expresion1 : expresion2;

         *condicion: expresion booleana a evaluar
         *expresion1 : valor que se devuelve si la expresion es true
         *expresion2 : valor que se devuelve si la expresion es false

         */

        //Ejemplo

        int edad = 20;
        String mensaje = edad >= 20 ? "eres mayor de edad" : "aun eres menor";
        System.out.println(mensaje);




    }
}
