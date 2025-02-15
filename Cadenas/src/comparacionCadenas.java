public class comparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "java";
        var cadena2 = "java";
        var cadena3 = new String("python");
        //comparar cadena (==)
        System.out.print(" La cadena1 es igual a la cadena2="
        +" ");
        System.out.println(cadena1 == cadena2);
        System.out.println("Cadena1 es igual a cadena3?");
        System.out.println(cadena1== cadena3);
        //comparar contenido
        /*se usa el metodo equals */
        System.out.println("Cadena1 es igual en contenido a cadena3:"  );
        System.out.println(cadena1.equals(cadena3));


    }
}
