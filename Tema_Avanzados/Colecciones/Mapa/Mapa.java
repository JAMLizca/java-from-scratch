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
        //forma tres
        persona.forEach((k,v) -> System.out.println(k + " = " + v));
    }
}
