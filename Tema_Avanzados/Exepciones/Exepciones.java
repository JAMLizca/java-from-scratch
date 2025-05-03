package logica.Tema_Avanzados.Exepciones;

public class Exepciones {
    public static void main(String[] args) {
        //Se va a realizar una division por cero
        int dividendo = 10, divisores = 0;
        try {
            int resultado = dividendo / divisores;
            System.out.println("resultado = " + resultado);
        }catch (Exception e){
            System.out.println("Ocurrio un error"+" "+
             e);
        }

        /*
        Al momento de ejecutar el codigo pueden observar que nos arrojó un mensjae que es una exepcion en tiempo de ejecución:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	   at logica.Tema_Avanzados.Exepciones.Exepciones.main(Exepciones.java:8)

       Esto es una exception de tipo arithmetic y nos dice que es una division por cero, para prevenir que el programa se
       quiebre disruptiba mente se aplica un bloque try/catch


         */
    }
}
