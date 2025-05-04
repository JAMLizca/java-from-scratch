package logica.Tema_Avanzados.Colecciones.Sets;

import java.util.TreeSet;
import java.util.Set;

public class Sets {
    //con set no se pueden repetir elementos
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Hola");
        conjunto.add("Mundo");
        conjunto.add("Mundo");
        System.out.println(conjunto);
        conjunto.forEach(System.out::println);

        //Remover elementos
        conjunto.remove("Mundo");
        System.out.println(conjunto);
    }
}
