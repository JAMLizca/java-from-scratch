public class FuncionesRecursivas {

    //imprimir valores del 1 al 15

    static void funcionR (int numero){
        //caso base
        if(numero==1){
            System.out.println(numero+" ");
        }else{
            //caso recursivo
            System.out.println(numero+" "); //imprime de forma descendente
            funcionR(numero -1);
            //System.out.println(numero+" "); //imprime de froma ascendente
        }
    }

    public static void main(String[] args) {
        funcionR(15);
        //numero a introducir
    }
}
