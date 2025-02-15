public class MasCocatenacionDeCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en java
        // Formas ya estudiadas
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;

        // Se trabajará con el método concat
        // Solo se puede concatenar dos valores
        cadena3 = cadena1.concat(" ").concat("Mundo2");

        // Otro método para concatenar
        // Se trabaja con la clase StringBuilder (constructor de cadenas)
        var cadena4 = new StringBuilder();

        // Llamamos el método append
        cadena4.append(cadena1);
        cadena4.append(" ");
        cadena4.append(cadena2);

        // Llamamos el método toString para generar la cadena final
        var cadena5 = cadena4.toString();
        System.out.println("cadenas concatenadas = " + cadena5);

        // Se trabaja con la clase StringBuffer
        // Solo cuando tenemos varios hilos "Procesos"
        var cadena6 = new StringBuffer(); // Instanciamos un StringBuffer
        cadena6.append(cadena1).append(" ").append(cadena2); // Usamos el objeto cadena6
        cadena5 = cadena6.toString(); // Convertimos a String
        System.out.println("resultado del StringBuffer = " + cadena5);

        // Método join
        cadena5 = String.join(" ", cadena1, cadena2);
        System.out.println("resultado join = " + cadena5);
    }
}
