package logica;

public class FormateoCadena {
    public static void main(String[] args) {

        System.out.println("***Formateo Cadenas***");
        var nombre = "juan";
        var edad = 34;
        var salario = 2100.345;

        //utilizar el metodo format de la clase String
        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //metodo printf
        System.out.printf("Nombre: %S, Edad:%d, salario:%.2f%n", nombre, edad , salario);

        var numeroEmpleado= 12;
        //formateo con text block
        mensaje = """
                %nDetalle de la persona:\s
                --------------------------
                \tNombre: %s
                \tNum. Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f%n
                """.formatted(nombre,numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        //formate con text block y printf directamente
        System.out.printf("""
                %nDetalle de la persona:\s
                --------------------------
                \tNombre: %s
                \tNum. Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f%n
                """,nombre,numeroEmpleado,edad,salario);git init





    }
}
