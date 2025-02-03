package logica;

public class sumaAcumulativaCicloWhile {
    public static void main(String[] args) {
        final var MAXIMO = 5;
        var acumaldor =0;
        //ieterar los valores
       var num = 1;
        while (num<= MAXIMO){
            acumaldor +=num++;
            System.out.println("la suma de los num"+ " "+ MAXIMO + " num ="+ " "+ acumaldor);

        }
    }
}
