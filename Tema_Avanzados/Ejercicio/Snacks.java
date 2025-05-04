package logica.Tema_Avanzados.Ejercicio;
import java.io.Serializable;
import java.util.Objects;

public class Snacks implements Serializable {
    //Contador
    private static int ContadorSnacaks=0;
    private int idSnacks;
    private String nombreSnacks;
    private double precioSnacks;
    public Snacks (){
        this.idSnacks = ++Snacks.ContadorSnacaks;
    }
    public Snacks (String nombreSnacks, double precioSnacks){
        this();
        this.nombreSnacks = nombreSnacks;
        this.precioSnacks = precioSnacks;
    }

    public String getNombreSnacks() {
        return nombreSnacks;
    }

    public void setNombreSnacks(String nombreSnacks) {
        this.nombreSnacks = nombreSnacks;
    }

    public static int getContadorSnacaks() {
        return ContadorSnacaks;
    }
    public int getIdSnacks() {
        return idSnacks;
    }

    public void setIdSnacks(int idSnacks) {
        this.idSnacks = idSnacks;
    }

    public double getPrecioSnacks() {
        return precioSnacks;
    }

    public void setPrecioSnacks(double precioSnacks) {
        this.precioSnacks = precioSnacks;
    }
    @Override
    public String toString() {
        return "Snacks{" +
                "idSnacks=" + idSnacks +
                ", nombreSnacks='" + nombreSnacks + '\'' +
                ", precioSnacks=" + precioSnacks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snacks snacks = (Snacks) o;
        return idSnacks == snacks.idSnacks && Double.compare(precioSnacks, snacks.precioSnacks) == 0 && Objects.equals(nombreSnacks, snacks.nombreSnacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnacks, nombreSnacks, precioSnacks);
    }
}


