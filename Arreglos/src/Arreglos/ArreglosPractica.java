package logica.Arreglos.src.Arreglos;

public class ArreglosPractica {
    public static void main(String[] args) {
        String [] apellidos = new String [5];
        apellidos[0] = "Lopez";
        apellidos[1] = "Perez";
        apellidos[2] = "Garcia";
        apellidos[3] = "Martinez";
        apellidos[4] = "Dominguez";

        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("Apellido " + (i+1) + ": " + apellidos[i]);
        }
    }
}
