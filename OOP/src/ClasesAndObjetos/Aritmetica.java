package logica.OOP.src.ClasesAndObjetos;

public class Aritmetica {
    int operandoUno;
    int operandoDos;

    //Constructores

    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    //Meotdos sumar, no recibe ningun parametro
     void sumar(){
         var resultado = operandoUno + operandoDos;
         System.out.println("El resultado de la suma es: "+ resultado);
     }
     void restar (){
         var resultadosResta= operandoUno - operandoDos;
         System.out.println("El resultado de la resta es: "+ resultadosResta);
     }

     //Creacion de objetos
    //Metodo Main
     public static void main(String[] args) {
         System.out.println("*** Ejemplo Aritmetica ***");
         //Crear objeto
         System.out.println(" ");
         System.out.println("Objeto Uno");
         var aritmeticaUno = new Aritmetica();
         //acceder a los atributos
         aritmeticaUno.operandoUno = 12;
         aritmeticaUno.operandoDos = 5;
         aritmeticaUno.sumar();
         aritmeticaUno.restar();

         // Nuevo Objeto

         var aritmeticaDos = new Aritmetica();
         aritmeticaDos.operandoUno =12;
         aritmeticaDos.operandoDos =16;
         System.out.println("  ");
         System.out.println("Objeto Dos");
         aritmeticaDos.sumar();
         aritmeticaDos.restar();
     }
}
