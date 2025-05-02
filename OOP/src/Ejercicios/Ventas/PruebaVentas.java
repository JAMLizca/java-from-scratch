package logica.OOP.src.Ejercicios.Ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        //Creacion de objetos de tipo producto
       // System.out.println("*** Sistema de ventas *** ");
        var producto1 = new Producto("Pantalon", 10000);
        System.out.println(producto1);
        var producto2 = new Producto("Chaqueta", 20000);
        //System.out.println(producto2);

        //objeto de tipo orden
        var orden1 = new Orden();
        orden1.agrgarProducto(producto1);
        orden1.agrgarProducto(producto2);
     // orden1.mostrarOrden();
        System.out.print(orden1);

        var orden2 = new Orden();
        orden2.agrgarProducto(new Producto("Pantalon", 110000));
        orden2.agrgarProducto(producto1);
      //orden2.mostrarOrden();
        System.out.print(orden2);

    }
}
