package logica.OOP.src.Encapsulamiento.EjemploPP;

public class PruebaPersona {
        public static void main(String[] args) {
            System.out.println("--- Creacion de clases y objetos persona ---");
            var objeto1 = new Persona("Alejo","Cordoba");
            objeto1.mostrarPersona();
            var objeto2 = new Persona("Mariana", "Puentes");
            objeto2.mostrarPersona();
        }
    }

