package logica;

public class CaracteresEspeciales {
    public static void main(String[] args) { //metodo principal

        //caracteres especiales
        var cadena1 = "Hola \nmundo";
        System.out.println("cadena1 = " + cadena1);
        // Caracter diagonal inversa n (\n)
        //imprime un salto de linea

        //---------------------------//
        //caracer de tabulacion (\t)
        var cadena2 = "\tHello\tWord\tmucho gringo";
        System.out.println("cadena2 = " + cadena2);

        // '\
        var cadena3 = "Hello \' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // '\" agrega una comilla doble
        var cadena4 = "Hola \"Mundo";
        
        // \\ diagonal o barra invertida
        var cadena5 = "Hola\\Mundo ";
        System.out.println("cadena5 = " + cadena5);
    }
}
