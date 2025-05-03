package logica.Tema_Avanzados.Clases_Abstractas;

public class Clase_Abstracta {
    public static void main(String[] args) {
        //Creacion objeto de esta clase
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica() {} nos va a producir error porque no se puedde isntanciar


        //clase abstracta
        //No podemos crear objetos de esta clase
        abstract class FiguraGeometrica {
            public abstract void dibujar();
        }
        //clase hija que hereda de figura geometrica
        class Rectangulo extends FiguraGeometrica {
            //sobrescritura de metodo
            @Override
            public void dibujar() {
                System.out.println("Dibujar rectangulo");
            }
        }
    }