 # 🔄 ¿Qué es la sobrecarga de constructores?

La sobrecarga de constructores ocurre cuando una clase tiene más de un constructor, pero con diferente número o tipo de parámetros.


- Permite crear objetos de diferentes maneras.
 
 - Se adapta a la información disponible al crear un objeto.

- Hace tu código más flexible y reutilizable.

---

## 🧪 Ejemplo: Clase Estudiante
```java

public class Estudiante {
String nombre;
String carrera;
double promedio;

    // Constructor vacío (sin parámetros)
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.carrera = "Sin carrera";
        this.promedio = 0.0;
    }

    // Constructor con nombre y carrera
    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = 3.5; // promedio por defecto
    }

    // Constructor con todos los atributos
    public Estudiante(String nombre, String carrera, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}
```

----

## 🧪 Uso en el método main

```java
public class Main {
public static void main(String[] args) {
// Constructor vacío
Estudiante estudiante1 = new Estudiante();
estudiante1.mostrarInfo();

        // Constructor con nombre y carrera
        Estudiante estudiante2 = new Estudiante("Carlos", "Ingeniería");
        estudiante2.mostrarInfo();

        // Constructor con todos los datos
        Estudiante estudiante3 = new Estudiante("Laura", "Medicina", 4.3);
        estudiante3.mostrarInfo();
    }
}
```

----
Puedes usar this(...) para llamar a otro constructor desde dentro de otro:

```java
public Estudiante(String nombre, String carrera) {
this(nombre, carrera, 3.5); // Reutiliza el constructor con 3 parámetros
}
```
---
## Ejemplo

#  Ejemplo de Sobrecarga de Constructores en la Clase `Aritmetica`

A continuación se muestra una versión mejorada de tu clase `Aritmetica`, usando **constructores sobrecargados**, documentados y fáciles de entender.

---

## 🧪 Código Java con sobrecarga de constructores

```java
package logica.OOP.src.ClasesAndObjetos;

public class Aritmetica {
    // Atributos de la clase
    int operandoUno;
    int operandoDos;

    // Constructor vacío (por defecto)
    public Aritmetica() {
        System.out.println("Constructor sin parámetros ejecutado");
    }

    // Constructor con un parámetro
    public Aritmetica(int operandoUno) {
        this.operandoUno = operandoUno;
        this.operandoDos = 0; // Valor por defecto
        System.out.println("Constructor con un parámetro ejecutado");
    }

    // Constructor con dos parámetros
    public Aritmetica(int operandoUno, int operandoDos) {
        this.operandoUno = operandoUno;
        this.operandoDos = operandoDos;
        System.out.println("Constructor con dos parámetros ejecutado");
    }

    // Método para sumar los operandos
    void sumar() {
        int resultado = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    // Método para restar los operandos
    void restar() {
        int resultado = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    // Método principal para ejecutar ejemplos
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica con Sobrecarga de Constructores ***");

        // Usando constructor vacío
        System.out.println("\n→ Objeto 1 (Constructor vacío):");
        Aritmetica obj1 = new Aritmetica();
        obj1.operandoUno = 10;
        obj1.operandoDos = 5;
        obj1.sumar();
        obj1.restar();

        // Usando constructor con un parámetro
        System.out.println("\n→ Objeto 2 (Constructor con un parámetro):");
        Aritmetica obj2 = new Aritmetica(20);
        obj2.operandoDos = 8; // Se asigna manualmente
        obj2.sumar();
        obj2.restar();

        // Usando constructor con dos parámetros
        System.out.println("\n→ Objeto 3 (Constructor con dos parámetros):");
        Aritmetica obj3 = new Aritmetica(15, 7);
        obj3.sumar();
        obj3.restar();
    }
}
```



