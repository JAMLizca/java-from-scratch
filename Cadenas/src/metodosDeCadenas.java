public class metodosDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "hola mundo";
        //obtener largo cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        //remplazar caracteres
        var nuevaCadena = cadena1.replace('o','a' );
        System.out.println("nuevaCadena = " + nuevaCadena);
        //convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        //convertir a minusculas
        System.out.println("Resultado en minuscula:" + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = "Jh que bendicion      ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacio = " + cadena2.trim());

    }
}
