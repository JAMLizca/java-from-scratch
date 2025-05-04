package logica.Tema_Avanzados.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Snack {
    private static final List<Snacks> snacks;

    // Bloque estático inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snacks("Papas", 100));
        snacks.add(new Snacks("Queso", 150));
        snacks.add(new Snacks("Arroz", 200));
        snacks.add(new Snacks("Chocolate", 100));
        snacks.add(new Snacks("Naranja", 100));
    }

    public static void agregarSnack(Snacks nuevoSnack) {
        snacks.add(nuevoSnack);
    }

    public static void mostrarSnacks() {
        var inventarioSnacks = "";
        for (Snacks snack : snacks) {
            inventarioSnacks += snack.toString()+"\n";
        }
        System.out.println("*** Snacks en el inventarios ***");
        System.out.println(inventarioSnacks);
    }
    public static List<Snacks> getSnacks() {
        return snacks;
    }
}
