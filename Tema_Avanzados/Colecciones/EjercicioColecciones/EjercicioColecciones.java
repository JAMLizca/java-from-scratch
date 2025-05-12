package logica.Tema_Avanzados.Colecciones.EjercicioColecciones;

import java.util.ArrayList;
import java.util.List;

public class EjercicioColecciones {
    public static void main(String[] args) {
        List<Integer> todosLosNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            todosLosNumeros.add((int) (Math.random() * 100));
        }
        System.out.println("Todos los números:");
        mostrarNumeros(todosLosNumeros);

        List<Integer> soloPares = new ArrayList<>();
        List<Integer> soloImpares = new ArrayList<>();

        for (Integer i : todosLosNumeros) {
            if (i % 2 == 0) {
                soloPares.add(i);
            } else {
                soloImpares.add(i);
            }
        }

        // Mostrar listas de pares e impares
        System.out.println("Pares:");
        mostrarNumeros(soloPares);
        System.out.println("Impares:");
        mostrarNumeros(soloImpares);

        // Lista con mas elementos
        System.out.println("Arreglo con más elementos:");
        if (soloPares.size() > soloImpares.size()) {
            System.out.println("El arreglo de pares tiene más elementos.");
        } else if (soloImpares.size() > soloPares.size()) {
            System.out.println("El arreglo de impares tiene más elementos.");
        } else {
            System.out.println("Ambos arreglos tienen la misma cantidad de elementos.");
        }
    }

    // metodo mostarr numeros
    public static void mostrarNumeros(List<Integer> numeros) {
        for (Integer i : numeros) {
            System.out.println(i);
        }
    }
}
