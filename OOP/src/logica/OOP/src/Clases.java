package logica.OOP.src;
 // Paquete donde se encuentra la clase

public class Clases {
    // Declaración de la clase "Clases"
    // El nombre de las clases inicia con una letra mayúscula: Clases

    // Declaración de atributos de la clase
    String nombre;  // Almacena el nombre de la persona
    String apellido;  // Almacena el apellido de la persona
    int edad;  // Almacena la edad de la persona

    // Método que imprime la información de la persona
    void persona() {
        // Declaración de una variable local con "var" (funciona desde Java 10 en adelante)
        var variableLocal = "valor";

        // Imprime el valor de la variable local
        System.out.println("Variable: " + variableLocal);

        // Imprime los datos de la persona almacenados en los atributos de la clase
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("El apellido es: " + apellido);
    }

    public static void main(String[] args) {  // Método principal donde se ejecuta el programa
        System.out.println("Creación de clase de persona");  // Mensaje de inicio

        // Creación de un objeto de la clase "Clases"
        var objeto1 = new Clases();

        // Asignación de valores a los atributos del objeto
        objeto1.nombre = "Juan";
        objeto1.apellido = "Perez";

        // Llamada al método "persona()" para mostrar la información
        objeto1.persona();
    }
}


