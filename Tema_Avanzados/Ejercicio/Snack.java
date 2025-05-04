package logica.Tema_Avanzados.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Snack {
    private static final List<Snacks> snacks;

    static {
        snacks = new ArrayList<>();
        snacks.add(new Snacks("Papas", 100));
        snacks.add(new Snacks("Queso", 150));
        snacks.add(new Snacks("Arroz", 200));
        snacks.add(new Snacks("Chocolate", 100));
        snacks.add(new Snacks("Naranja", 100));
    }

    public static void mostrarSnacks() {
        for (Snacks snack : snacks) {
            System.out.println(snack);
        }
    }

    public static List<Snacks> getSnacks() {
        return snacks;
    }
}
