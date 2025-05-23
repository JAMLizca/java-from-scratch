package logica.Tema_Avanzados.Colecciones.Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //List miLista = new ArrayList();
        //Manejo de datos generics
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

//        for (var dia:miLista){
//            System.out.println(">" + dia + "<");
//        }

//        Funciones lamda (funcion anonima de un codigo muy compacto) programacion funcional
//        miLista.forEach(dia -> System.out.println(">" + dia + "<"));

        //Metodos de referencia
        miLista.forEach(System.out::println);
        //Otra forma de crear una lista
        System.out.println("---Otra forma de crear una lista---");
        List<String> nombres = Arrays.asList("Juan","pepe");
        nombres.forEach(System.out::println);
    }
}

