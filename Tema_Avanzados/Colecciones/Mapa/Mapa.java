package logica.Tema_Avanzados.Colecciones.Mapa;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        //Mapas o diccionarios
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Juan");
        persona.put("apellido", "Perez");
        persona.put("edad", "20");
        //Forma uno
        persona.entrySet().forEach(System.out::println);
        //forma dos
        System.out.println(persona);
        System.out.println(" ");
        persona.put("sexo", "Masculino"); //el put es para añadir
        System.out.println("\n Nuevos valores del mapa :");
        persona.entrySet().forEach(System.out::println);

        //Iterar
        System.out.println("Itereando los elementos del mapa :");
        persona.forEach((k,v) -> System.out.println(k + " = " + v));



    }
}
