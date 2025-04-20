package logica.OOP.src.Herencia;

public class Animal {
   protected void comer(){
       /*protected es un modificador de acceso, no es publico para todas las
       clases solo para clases hijas.*/
        System.out.println("Como muchas veces al dia");
    }
    protected void dormir(){ //firma del metodo
        System.out.println("Duermo muchas horas");
    }
}
class perro extends  Animal{
    public void hacerSonido() {
        System.out.println("Puedo ladrar");
    }
    //sobreescritura del metodo dormir
    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas al dia"); //clase hija
        //llamar el metodo definido que se a ocultado
        System.out.println("Metodo de la clase padre");
        super.dormir(); //comportamientos clase padre
    }

}
class pruebaAnimal{
    public static void main(String[] args) {
        System.out.println(" -- Ejemplo de herencia --");
        System.out.println("Clase padre, soy un animal");
        var animal = new Animal();
        animal.comer();
        animal.dormir();
        //animal.hacerSonido //este metodo no esta definida en la clase padre
        System.out.println("\n Clase hija, soy un perro");
        var perro1 = new perro();
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();
    }
}