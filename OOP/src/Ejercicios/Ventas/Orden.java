package logica.OOP.src.Ejercicios.Ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;


    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //Metodo
    public void agrgarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("No se pueden agregar mas productos a la orden"
                    + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            var productos = this.productos[i];
            total += productos.getPrecio();
        }
        return total;
    }

    //    public void mostrarOrden(){
//        System.out.println(" Id Orden: " + this.idOrden);
//        var totalOrden = this.calcularTotal();
//        System.out.println("Total de la orden :"+ totalOrden);
//        System.out.println("Productos de la orden : ");
//        for(int i = 0; i < this.contadorProductos; i++)
//            System.out.println(this.productos[i]);
//
//    }
    @Override
    public String toString() {
        var resultado = "Id Orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado+=("Total de la orden :" + totalOrden+ "\n");
        resultado+=("Productos de la orden : "+ "\n");
        for (int i = 0; i < this.contadorProductos; i++)
            resultado+= this.productos[i];
        return resultado;
    }
}