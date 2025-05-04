package logica.Tema_Avanzados.Ejercicio;

public class Snacks {
    private static int contadorId = 1;
    private int idSnack;
    private String nombre;
    private int precio;

    public Snacks(String nombre, int precio) {
        this.idSnack = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "[" + idSnack + "] " + nombre + " - $" + precio;
    }
}
