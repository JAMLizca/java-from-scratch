public class remplazarSubcadenas {
    public static void main(String[] args) {
        //remplazar subcadenas
        var cadena = "HOLA MUNDO";
        System.out.println("cadena = " + cadena);
        //remplazar "MUNDO" por "chamo"
        var nuevaCadena= cadena.replace("MUNDO", "chamo");
        System.out.println("nuevaCadena = " + nuevaCadena);
        //remplazar "hola" por "cordial saludo"
        nuevaCadena = cadena.replace("HOLA", "cordial saludo");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
