package logica;

public class manejoSubcadena {
    public static void main(String[] args) {
        //subcadenas
        /*obtener una parte de una cadena original*/
        var cadena1 = "hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //subcadena
        var subcadena1 = cadena1.substring(0,4);
        //proporcionamos el indice de inicio (0) y el final (4)
        System.out.println("subcadena1 = " + subcadena1);
        
        //var subcadena2 = cadena1.substring(5,10);
        var subcadena2 = cadena1.substring(5,10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
