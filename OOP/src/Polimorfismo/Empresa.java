package logica.OOP.src.Polimorfismo;

// Clase principal donde se aplica el polimorfismo
public class Empresa {
    public static void main(String[] args) {
        // Creamos un arreglo de empleados (tipo padre)
        Empleado[] empleados = new Empleado[3];

        // Asignamos instancias de clases hijas (subtipos)
        empleados[0] = new Gerente("Laura");
        empleados[1] = new Desarrollador("Carlos");
        empleados[2] = new Becario("Ana");

        // Polimorfismo: el método correcto se ejecuta según el tipo real del objeto
        for (Empleado emp : empleados) {
            emp.calcularSalario();  // ← AQUÍ OCURRE EL POLIMORFISMO
        }
        //Aunque emp es de tipo Empleado, Java sabe en tiempo de ejecución si realmente es un Gerente, Desarrollador o Becario, y ejecuta la versión correcta del método calcularSalario()
    }
}
