package logica;
public class inmutacionCadenas{
    public static void main(String[] args) {
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        //modificar
         cadena1 = "p";
        System.out.println("cadena1 modificado = " + " "+ cadena1);
        System.out.println("cadena2"+ cadena2);
    }
}