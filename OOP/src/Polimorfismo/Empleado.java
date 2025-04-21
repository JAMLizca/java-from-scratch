package logica.OOP.src.Polimorfismo;

public class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobrescrito por las subclases
    public void calcularSalario() {
        System.out.println("El salario del empleado es genérico.");
    }
}

// Subclase Gerente
class Gerente extends Empleado {
    public Gerente(String nombre) {
        super(nombre); // Llama al constructor de Empleado
    }

    @Override
    public void calcularSalario() {
        System.out.println(nombre + " (Gerente) gana $5000 al mes.");
    }
}

// Subclase Desarrollador
class Desarrollador extends Empleado {
    public Desarrollador(String nombre) {
        super(nombre);
    }

    @Override
    public void calcularSalario() {
        System.out.println(nombre + " (Desarrollador) gana $4000 al mes.");
    }
}

// Subclase Becario
class Becario extends Empleado {
    public Becario(String nombre) {
        super(nombre);
    }

    @Override
    public void calcularSalario() {
        System.out.println(nombre + " (Becario) gana $1000 al mes.");
    }
}

