package logica.Sentencias_De_Decision;

public class numInversos {

    /*
    imprimir numeros inversos con el ciclo do while
     */
    public static void main(String[] args) {
        int num = 10;
        do{
            System.out.println(num--);
        }while (num>0);
    }
}
