# 🖥️  Clases y Objeto 🚀  

## 📌 ¿Qué es una clase?  
Una **clase** en Java es como un molde o plantilla que define cómo serán los objetos. Dentro de una clase, podemos definir atributos (datos) y métodos (acciones que puede realizar un objeto).  

### 📌 Ejemplo del mundo real  
Imagina que una **clase** es un plano de construcción de una casa. En este plano, se definen características como el número de habitaciones, el color de las paredes y el material del techo. Pero el plano por sí solo **no es una casa**, sino solo una referencia para construir casas.  

---

## 📌 ¿Qué es un objeto?  
Un **objeto** es una instancia de una clase, es decir, algo **real** que se ha creado a partir de la plantilla (clase).  

### 📌 Ejemplo del mundo real  
Si la clase es el plano de una casa, un objeto sería una casa real construida a partir de ese plano. Podemos hacer varias casas (**objetos**) con el mismo plano (**clase**), pero cada casa puede tener detalles diferentes (por ejemplo, diferentes colores o tamaños).  

---

## 📝 Ejemplo en Código  
Vamos a crear una **clase** llamada `Persona`, y a partir de esta clase, crearemos **objetos** (personas reales) con nombres y apellidos.

### Crear la Clase
```java
// Definimos la clase Persona (molde)
public class Persona {
    // Atributos: características de la persona
    String nombre;
    String apellido;
    
    // Método: acción que puede realizar el objeto
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
```

### 🔍 Explicación

✅ **Persona** es la clase que define qué atributos tendrá cada persona.

✅ **nombre y apellido** son atributos que guardarán los datos de cada persona.

✅ **mostrarInfo()** es un método que mostrará el nombre y apellido en pantalla.

### Crear Objetos a partir de la Clase

```java
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Persona
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Pérez";
        
        // Llamamos al método para mostrar la información
        persona1.mostrarInfo();
    }
}
```
---
✅ **Persona persona1 = new Persona();** → Se crea un objeto de la clase Persona.

✅ **persona1.nombre = "Juan";** → Se asigna un nombre al objeto persona1.

✅ **persona1.apellido = "Pérez";** → Se asigna un apellido.

✅ **persona1.mostrarInfo();** → Se llama al método para mostrar la información en pantalla.

### 📌 Resultado en la Consola

```java
Nombre: Juan
Apellido: Pérez
```
