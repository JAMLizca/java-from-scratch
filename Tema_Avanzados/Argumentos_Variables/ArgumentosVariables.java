package logica.Tema_Avanzados.Argumentos_Variables;

public class ArgumentosVariables {
    public static void main(String[] args) {
        // imprimirNumeros(1,2,3,4,5); //argumentos variables varargas
        variosParametros("yo",12,22,22);
    }

    static void variosParametros(String nombre, int edad.. numeros) {
    }

    //Metodo
//static void imprimirNumeros(int i, int i1, int i2, int i3, int i4) {
    //lo que hace el int... numeros es que recibe un numero variable de argumentos, crea un tipo de arreglo
    static void imprimirNumeros(int... numeros) {
        for (var i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }

    }

}
