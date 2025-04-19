public class ArrreglosPractica {
public static void main(String[] args) {
    //1. Declaramos el arreglo que va almacenar 7 elementos
    String [] Apellidos = new String [7];
    // Los arreglos se inican desde 0
    Apellidos[0] = "Garcia";
    Apellidos[1] = "Perez";
    Apellidos[2] = "Lopez";
    Apellidos[3] = "Gonzalez";
    Apellidos[4] = "Rodriguez";
    Apellidos[5] = "Sanchez";
    Apellidos[6] = "Ramirez";
    //leer valores de arreglos de la froma mas fea
    System.out.println("Valor en el indice 2 = " + Apellidos[2] + " ");
    System.out.println("Valor en el indice 4 = " + Apellidos[4] + " ");
    //existe la otra forma que es con un ciclo for
    for (int i = 0; i < Apellidos.length; i++) {
        System.out.println("Valor en el indice " + i + " = " + Apellidos[i] + " ");
    }
    //otra forma de recorrer el arreglo
    for (String apellido : Apellidos) {
        System.out.println("Valor = " + apellido);

    }    
 }

}