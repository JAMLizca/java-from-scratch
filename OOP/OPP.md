# 🚀 Introducción a la Programación Orientada a Objetos (POO)  

## 🤔 ¿Por qué deberías aprender POO?  
Imagina que quieres construir un videojuego, una aplicación o incluso un software para tu empresa. Si lo haces de manera desorganizada, pronto se convertirá en un caos difícil de entender y modificar. **Aquí es donde entra la POO**. Con este enfoque, puedes crear programas más estructurados, reutilizables y fáciles de mantener.  

Aprender POO te abrirá puertas en el mundo de la programación, permitiéndote trabajar en proyectos grandes y complejos sin perder el control. ¡Vamos a descubrir cómo funciona!  

---  

## 📌 ¿Qué es la Programación Orientada a Objetos?  
La **Programación Orientada a Objetos (POO)** es un paradigma de programación que organiza el código en torno a **objetos** en lugar de funciones o procedimientos.  

En términos simples, es como crear un mundo en el que cada cosa (objeto) tiene características y puede realizar acciones.  

---  

## 🏛️ Conceptos Claves de la POO  

### 🔹 1. Clases  
Una **clase** es como un plano o molde. Define cómo serán los objetos.  
Ejemplo: Un **molde** para hacer galletas.  

```java
// Definiendo una clase llamada Persona
public class Persona {
    String nombre;
    int edad;
}
```

---  

### 🔹 2. Objetos  
Un **objeto** es una instancia de una clase, es decir, un elemento creado a partir de un molde.  
Ejemplo: Si la clase es un **molde de galletas**, el objeto sería una **galleta real**.  

```java
// Creando un objeto a partir de la clase Persona
Persona persona1 = new Persona();
persona1.nombre = "Juan";
persona1.edad = 25;
```

---  

### 🔹 3. Atributos  
Los **atributos** son las características de un objeto.  
Ejemplo: Una persona tiene **nombre** y **edad**.  

```java
public class Persona {
    String nombre;
    int edad;
}
```

---  

### 🔹 4. Métodos  
Los **métodos** son las acciones que un objeto puede realizar.  
Ejemplo: Una persona puede **caminar** o **hablar**.  

```java
public class Persona {
    String nombre;
    int edad;
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
```

---  

### 🔹 5. Principios de la POO  
La **Programación Orientada a Objetos** se basa en cuatro principios fundamentales:

✅ **Encapsulamiento**: Protege los datos dentro de una clase.  
✅ **Herencia**: Permite que una clase herede atributos y métodos de otra.  
✅ **Polimorfismo**: Un mismo método puede comportarse de diferentes maneras.  
✅ **Abstracción**: Oculta los detalles complejos y muestra solo lo esencial.  

#### 📌 **Encapsulamiento**  
El **encapsulamiento** protege los datos dentro de una clase, evitando que sean modificados directamente desde fuera.  

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
```

#### 📌 **Herencia**  
La **herencia** permite que una clase reutilice los atributos y métodos de otra.  

```java
// Clase base
public class Animal {
    String nombre;

    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase que hereda de Animal
public class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```

#### 📌 **Polimorfismo**  
El **polimorfismo** permite que un mismo método se comporte de diferentes maneras en distintas clases.  

```java
public class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}
```

#### 📌 **Abstracción**  
La **abstracción** oculta detalles innecesarios y solo expone lo esencial.  

```java
// Clase abstracta
abstract class Figura {
    abstract void dibujar();
}

// Subclase que implementa la clase abstracta
class Circulo extends Figura {
    void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}
```

---  

## 🚀 Conclusión  
La **POO** nos ayuda a organizar mejor el código, haciéndolo más fácil de entender, reutilizar y mantener. Es como construir un mundo digital donde los objetos tienen propiedades y pueden interactuar entre sí. ¡Ahora estás listo para empezar a programar con POO en Java! 💡


