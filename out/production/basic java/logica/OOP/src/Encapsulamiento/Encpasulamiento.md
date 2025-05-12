# 🔐 Encapsulamiento 

---

## 🧠 ¿Qué es el encapsulamiento?

El **encapsulamiento** es un **principio fundamental de la Programación Orientada a Objetos (POO)** que consiste en:

> **Ocultar los detalles internos de una clase** y **restringir el acceso directo a sus datos**, permitiendo interactuar solo a través de métodos públicos llamados *getters* y *setters*.

---
## 🧠 ¿Cuántos niveles de acceso existen en Java?

| Modificador | Desde la misma clase | Desde el mismo paquete | Desde subclases | Desde otras clases |
|-------------|----------------------|-------------------------|------------------|---------------------|
| `private`   | ✅                   | ❌                      | ❌               | ❌                  |
| *default* (sin modificador) | ✅ | ✅                      | ❌               | ❌                  |
| `protected` | ✅                   | ✅                      | ✅               | ❌                  |
| `public`    | ✅                   | ✅                      | ✅               | ✅                  |

---
## 🧰 ¿Cómo se logra el encapsulamiento?

1. Declarando los **atributos como `private`** (solo accesibles dentro de la clase).
   ✅ ¿Cómo puedo acceder entonces?

Usamos métodos especiales llamados:

- get → para obtener (leer) el valor de un atributo.

- set → para asignar (modificar) el valor de un atributo.

---

## 🧪 Ejemplo práctico: Clase `Persona`

```java
public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para edad
    public int getEdad() {
        return edad;
    }

    // Método setter para edad
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
}
```

Siempre que declares un atributo private, crea sus métodos get y set si necesitas accederlo desde fuera.

---
### ✨ Recomendación: Usar IDE como IntelliJ o Eclipse

Estos entornos tienen atajos para generar automáticamente los getters y setters.

Ejemplo en IntelliJ IDEA:

    Haz clic derecho sobre la variable → Generate → Getter and Setter

----
## 🎯 Ejercicio propuesto

Crea una clase Producto con:

- Atributos privados: nombre, precio, stock.

-  Getters y setters para cada atributo.

 -   Valida que el precio y stock no sean negativos.

---
## 🌐 Recursos recomendados

- 📘 [Documentación oficial de Java - Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- 🎥 [Video - Encapsulamiento en Java (YouTube)](https://www.youtube.com/watch?v=CVMeUqDK6DI)
- 🧠 [W3Schools - Java Encapsulation](https://www.w3schools.com/java/java_encapsulation.asp)
