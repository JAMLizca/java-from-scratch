package logica;

public class sentenciaIfElseIf {
    public static void main(String[] args) {
        System.out.println("*** Sentencia If Else If ***");
        int edad = 16;
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else if (edad>=13 && edad <18){
            System.out.println("Eres un adolescente");
        }else{
            System.out.println("Eres un niño");
        }
    }
}