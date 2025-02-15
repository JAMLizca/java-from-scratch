public class arreglos {
    public static void main(String[] args) {

        //1. Declaramos el arreglo
        int[] arreglos;

        //2. se inicializa el arreglo y se asignan dentro sesion de memoria para 5 elementos
        arreglos = new int[5];

        //podemos declar e inicializar el arreglo en una sola linea
        int[]numeros = new int[5];

        //otra forma
        var num2 =new int[5];

        //Modificar valores
        int[] eneteros = new int[5];
        eneteros[0]=10; //el indice 0 y estamos asignando un valor
        eneteros[1]=20;
        eneteros[2]=30;
        eneteros[3]=40;
        eneteros[4]=50;
        //leer valores de arreglos
        System.out.println("Valor en el indice 2 = " + eneteros[2] + " ");

    }
}
