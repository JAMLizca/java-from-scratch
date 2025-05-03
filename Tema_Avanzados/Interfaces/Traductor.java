package logica.Tema_Avanzados.Interfaces;

public interface Traductor {
   // publicos y abstractos
    void traducir();
    //metodos por implementacion por default
    default void iniciarTraductor(){
        System.out.println("Traductor iniciado");
    }
}

//clases que implementas la interfaz
class Ingles implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traducir a ingles");
    }
}
//clase de prueba y polimorfismo
class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();
    }
}

