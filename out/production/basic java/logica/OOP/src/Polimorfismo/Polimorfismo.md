# 🔷 Polimorfismo 


**Polimorfismo** es un pilar fundamental de la Programación Orientada a Objetos (POO) que permite que un mismo método o interfaz pueda comportarse de distintas formas dependiendo del **objeto** que lo utilice. Proviene del griego *"poli" (muchos)* y *"morphé" (formas)*, es decir, **"muchas formas"**.

---


El polimorfismo te permite **usar un mismo nombre de método** para ejecutar diferentes comportamientos **según el tipo de objeto** que lo invoque.  
Esto hace que tu código sea más flexible, reutilizable y fácil de mantener.

Por ejemplo: todos los vehículos pueden *moverse*, pero cada uno se mueve de manera diferente. Con polimorfismo, puedes definir un método `mover()` y que cada clase (Auto, Moto, Avión) lo implemente a su manera.

---

## 📦 Tipos de polimorfismo en Java

| Tipo                      | ¿Qué es?                                                                 |
|---------------------------|---------------------------------------------------------------------------|
| **Polimorfismo en tiempo de compilación** | También llamado **sobrecarga de métodos** (`overloading`). Se elige el método por la cantidad/tipo de argumentos. |
| **Polimorfismo en tiempo de ejecución**   | También llamado **sobrescritura de métodos** (`overriding`). Se elige el método en tiempo de ejecución según el tipo real del objeto. |

---

## ✅ Ejemplo 

```java
// Clase base
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Subclase Perro
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

// Subclase Gato
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

// Clase principal
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal; // Referencia de tipo padre

        miAnimal = new Perro();
        miAnimal.hacerSonido(); // Salida: El perro ladra

        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Salida: El gato maúlla
    }
}
```
- Tenemos una referencia de tipo Animal, pero apunta a un Perro o a un Gato.

- Cada clase sobrescribe el método hacerSonido() con su comportamiento.

- Gracias al polimorfismo, Java ejecuta el método correcto en tiempo de ejecución, dependiendo del tipo real del objeto.
- ---
## 🧪 Ejercicio 

Crea una clase Empleado con un método calcularSalario().
Luego crea clases Gerente, Desarrollador y Becario, que sobrescriban ese método con lógica diferente.
Prueba el polimorfismo usando un arreglo de tipo Empleado y recorrelo llamando calcularSalario().
----
## 🌐 Recursos recomendados

### 📘 Documentación y tutoriales

- [📘 Documentación oficial de Oracle - Polimorfismo](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [🧠 Programiz - Java Polymorphism](https://www.programiz.com/java-programming/polymorphism)
- [🧠 W3Schools - Java Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp)

### 🎥 Videos recomendados

- [🎥 Polimorfismo en Java - Píldoras Informáticas](https://www.youtube.com/watch?v=Do7Orv8jL9g)
- [🎥 Curso de Java POO - Polimorfismo explicado fácil (JavaFacilito)](https://www.youtube.com/watch?v=tMTOluJvC7I)


