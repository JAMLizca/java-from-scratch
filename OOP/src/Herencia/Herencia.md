# 🧬 Herencia 


> La **herencia** en Java es un mecanismo mediante el cual una clase puede heredar atributos y métodos de otra clase. Permite crear jerarquías de clases donde una clase hija (subclase) extiende las funcionalidades de una clase padre (superclase).  
> En Java, se implementa usando la palabra clave `extends`.

---

Imagina que tienes una clase general llamada `Persona` con atributos como `nombre` y `edad`, y un método que muestra esa información.  
Ahora supongamos que quieres crear una clase `Estudiante`.  
En lugar de volver a escribir `nombre`, `edad`, y ese método, puedes decir:

> **“Estudiante hereda de Persona”**.

Así, `Estudiante` ya tiene `nombre`, `edad` y todo lo que tiene `Persona`, ¡sin tener que repetirlo!  
Después, puedes **agregar cosas propias de un estudiante**, como `matrícula`, `notaFinal`, etc.

Esto es **herencia**: **reutilizar código**, **crear jerarquías** y mantener tu programa **organizado y fácil de mantener**.

---

## 💻 Ejemplo 

Vamos a crear:
- Clase padre: `Persona`
- Clase hija: `Estudiante`
- Uso de `super()` para invocar al constructor de la clase padre
- Un método que se **sobrescribe** (`@Override`)

---

### 🧩 Clase `Persona` (superclase)

```java
// Clase base o superclase
public class Persona {

    // Atributos comunes
    protected String nombre;
    protected int edad;

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que muestra la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
```
----
### 👨‍🎓 Clase Estudiante (subclase que hereda de Persona)
```java
// Clase hija que hereda de Persona usando extends
public class Estudiante extends Persona {

    // Atributo adicional de Estudiante
    private String matricula;

    // Constructor: llama al constructor de Persona con super()
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llama al constructor de la clase padre
        this.matricula = matricula;
    }

    // Método exclusivo de Estudiante
    public void mostrarMatricula() {
        System.out.println("Matrícula: " + matricula);
    }

    // Sobrescribimos el método de Persona para agregar más información
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama a la versión original
        System.out.println("Matrícula: " + matricula); // Añade más datos
    }

    // Método main para ejecutar el ejemplo
    public static void main(String[] args) {
        System.out.println("Herencia en Java - Ejemplo completo");

        // Creamos un objeto Estudiante
        Estudiante estudiante1 = new Estudiante("José Mora", 22, "2025A001");

        // Llamamos al método sobreescrito
        estudiante1.mostrarInformacion();
    }
}
```
----
## 📌 ¿Qué conceptos aplicamos?

| Concepto    | Explicación                                                                 |
|-------------|------------------------------------------------------------------------------|
| `extends`   | Permite que una clase herede de otra.                                        |
| `super()`   | Llama al constructor o métodos de la clase padre.                            |
| `@Override` | Redefine un método heredado para adaptarlo a la subclase.                    |
| Herencia    | Reutiliza código, define jerarquías y mejora el diseño del programa.         |

---
##  ¿Qué es `@Override`?

La anotación `@Override` se utiliza para **sobrescribir un método heredado** de una clase padre en una clase hija.  
Esto permite **modificar el comportamiento de un método** sin cambiar el código original de la clase base.

✅ Mejora la legibilidad.  
✅ Ayuda al compilador a detectar errores.  
✅ Refuerza las buenas prácticas de la Programación Orientada a Objetos (POO).

---

## 🧠 Ejemplo 

```java
class Animal {
    public void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("El perro ladra");
    }
}
```
```java
public class Test {
public static void main(String[] args) {
Animal miPerro = new Perro();
miPerro.sonido(); // Imprime: El perro ladra
}
}
```

---
## 📚 Recursos adicionales

### 🌐 Documentación y tutoriales

- 📘 [Documentación oficial de Oracle: Herencia en Java](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- 🧠 [W3Schools - Java Inheritance](https://www.w3schools.com/java/java_inheritance.asp)
- 🧠 [Programiz - Java Inheritance](https://www.programiz.com/java-programming/inheritance)

### 🎥 Videos recomendados

- 🎥 [Herencia en Java (YouTube - Píldoras Informáticas)](https://www.youtube.com/watch?v=I3zVCzxPj0o)
- 🎥 [Curso Java - Herencia y Polimorfismo (JavaFacilito)](https://www.youtube.com/watch?v=2ISD8KQ7QvI)
----
## 🌐 Documentación y tutoriales

- 📘 [Documentación oficial de Oracle: Overriding Methods](https://docs.oracle.com/javase/tutorial/java/IandI/override.html)
- 🧠 [W3Schools - Java Method Overriding](https://www.w3schools.com/java/java_override.asp)
- 📗 [Programiz - Java Method Overriding](https://www.programiz.com/java-programming/method-overriding)

## 🎥 Videos recomendados

- 🎥 [Sobrescritura de métodos en Java - Píldoras Informáticas](https://www.youtube.com/watch?v=WjWkR5VZ8SQ)
- 🎥 [Java @Override explicado - Código Mentores](https://www.youtube.com/watch?v=XlTzAoyQqDY)
- 🎥 [Métodos sobreescritos en Java - Develoteca](https://www.youtube.com/watch?v=bfAjhzSkauY)


