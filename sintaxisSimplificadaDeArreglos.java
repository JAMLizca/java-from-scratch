package logica;

public class sintaxisSimplificadaDeArreglos {
    public static void main(String[] args) {
        //int[] enteros = {1,2,3,4,5,6};
        /*en este arreglo estamos iniciando la cantidad de elementos y asi mismo la cantidad
        de indices, entonces ese arreglo cuenta con 6 indices del 0 al 5
         */

        //otra forma con var
        var enteros = new int[]{1,2,3,4,5,6}; //sintaxis simplificada y dandoles valores directamente
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);

            /*
            En este ciclo for, declaramos una variable entera i y le asignamos
            un valor inicial de 0. Luego, utilizamos la propiedad .length del arreglo
            para determinar su longitud y compararla con i. Mientras i sea menor que la
            cantidad de elementos en el arreglo, el ciclo continuará ejecutándose. En cada
             iteración, i se incrementa en 1, y se imprime el valor correspondiente del arreglo.

            El resultado será la impresión de los números del 1 al 6, recorriendo el arreglo en orden.
             */

            /*
            otra forma de mandar a imprimir es utilizando system.out.println
             */
        }

    }
}
