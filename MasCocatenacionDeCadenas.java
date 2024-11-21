package logica;

public class MasCocatenacionDeCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en java
        //formas ya estudiada
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1+" "+cadena2;

        //se trabajara con el metodo concat
        // solo se puede concatenar dos valores

        cadena3 = cadena1.concat(" ").concat("Mundo2");

        //otro metodo para concatenar
        //se trabaja con la clase StringBuilder (constructor de cadenas)
        var cadena4 = new StringBuilder();

        //llamamos el metodo append
        cadena4.append(cadena1);
        cadena4.append(" ");
        cadena4.append(cadena2);

        //llamamos el metodo tosString para generar la cadena final
        var cadena5 = cadena4.toString();
        System.out.println("cadenas concatenadas = " + cadena5);

        //se trabaja con la clase StringBuffer
        //solo cuando tenemos varios hilos"Procesos"

        var cadena6 = new StringBuffer();
        StringBuffer.append(cadena1).append(" ").append(cadena2);
        cadena5 = StringBuffer.toString();
        System.out.println("resultado del StringBuffer = " + cadena5);

        //metodo join
        cadena5 = String.join(" ", cadena1, cadena2);
        System.out.println("resultado join = " + cadena5);
    }
}
