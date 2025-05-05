package logica.Tema_Avanzados.Ejercicio;

public class Snacks {
    private static int contadorId = 1;
    private int idSnack;
    private String nombre;
    private int precio;
    private int stock;

    public Snacks(String nombre, int precio, int stock) {
        this.idSnack = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void disminuirStock() {
        if (stock > 0) {
            stock--;
        }
    }

    @Override
    public String toString() {
        return "[" + idSnack + "] " + nombre + " - $" + precio + " (Stock: " + stock + ")";
    }
}
