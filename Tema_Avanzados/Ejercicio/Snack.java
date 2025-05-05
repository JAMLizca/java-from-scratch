package logica.Tema_Avanzados.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Snack {
    private static final List<Snacks> snacks = new ArrayList<>();

    static {
        snacks.add(new Snacks("Papas", 100, 10));
        snacks.add(new Snacks("Queso", 150, 5));
        snacks.add(new Snacks("Arroz", 200, 8));
        snacks.add(new Snacks("Chocolate", 100, 12));
        snacks.add(new Snacks("Naranja", 100, 4));
    }

    public static void mostrarSnacks() {
        for (Snacks snack : snacks) {
            System.out.println(snack);
        }
    }

    public static List<Snacks> getSnacks() {
        return snacks;
    }

    public static void agregarSnack(Snacks nuevoSnack) {
        snacks.add(nuevoSnack);
    }
}
