package logica.Tema_Avanzados.Clases_Abstractas;

public class Clase_Abstracta {
    public static void main(String[] args) {
        // Creacion objeto de esta clase
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica() {} nos va a producir error porque no se puede instanciar
        // Podemos crear un objeto de la clase hija y a la vez aplicamos polimorfismo
        FiguraGeometrica figuraGeometrica = new Rectangulo(); // Aplicamos polimorfismo
        figuraGeometrica.dibujar();
    }

    // Clase abstracta
    // No podemos crear objetos de esta clase
    abstract static class FiguraGeometrica {
        public abstract void dibujar();
    }

    // Clase hija que hereda de FiguraGeometrica
    static class Rectangulo extends FiguraGeometrica {
        // Sobrescritura de método
        @Override
        public void dibujar() {
            System.out.println("Dibujar rectángulo");
        }
    }
}
