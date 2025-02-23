public class tipoVar {
    public static void main(String[] args) {
        System.out.println("Se trabaja con el uso de var");
        // sin var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        //con var
        //inferir tipo de dato
        var nombre2 = "juan";
        System.out.println("nombre2 = " + nombre2);
    }
}