package logica.Tema_Avanzados.For_Each;

public class For_Each {
    public static void main(String[] args) {
        // Nos permite recorrer los elementos de un arreglo y colecciones
        int edades[] ={2,3,4,5,6,7,4};
        for (int edad:edades){
            System.out.println("edad = " + edad);
        }
    }
    //la desventaja es que no podemos acceder al indice

}
