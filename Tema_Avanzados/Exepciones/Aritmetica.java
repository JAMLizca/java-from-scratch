package logica.Tema_Avanzados.Exepciones;

public class Aritmetica {
    public static int division(int dividendo, int divisor){
        if(divisor == 0)
            throw new RuntimeException("No se puede dividir por cero");
        return dividendo/divisor;
    }
}
class PruebaDivision{
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println("resultado = " + resultado);
        }catch (Exception e){
            System.out.println("Ocurrio un error"+" "+
                    e);
        }
    }
}
