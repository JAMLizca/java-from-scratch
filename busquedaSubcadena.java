package logica;

public class busquedaSubcadena {
    public static void main(String[] args) {
        //funcion indexOf devuvleve el indice de la primera
        //aparicion de la subcadena

        var cadena1 = "HOLA MUNDO";
        //subcadena a buscar "HOLA"
        var indice1 = cadena1.indexOf("HOLA");
        System.out.println("indice1 = " + indice1);
        // metodo lastIndexOf
        //devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("MUNDO");
        System.out.println("indice2 = " + indice2);
        //subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("python");
        System.out.println("indice3 = " + indice3);
    }
}
