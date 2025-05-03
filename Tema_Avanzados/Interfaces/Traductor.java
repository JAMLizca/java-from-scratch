package logica.Tema_Avanzados.Interfaces;

public interface Traductor {
    // publicos y abstractos
    void traducir();

    // métodos con implementación por default
    default void iniciarTraductor() {
        System.out.println("Traductor iniciado");
    }
}

// clases que implementan la interfaz
class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traducir a inglés");
    }
}

class Frances implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traducir a francés");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Traductor iniciado a francés");
    }
}

// clase de prueba y polimorfismo
class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();

        Traductor frances = new Frances();
        frances.traducir();
        frances.iniciarTraductor();
    }
}
