#   🧱 Constructores   🧱

## 🔹 ¿Qué es un constructor?

Un **constructor** es un **método especial** dentro de una clase, se utiliza para **crear e inicializar objetos**. Su función principal es **asignar valores iniciales** a los atributos de una clase cuando se crea un nuevo objeto.

### ✅ Características:

- Tiene el **mismo nombre que la clase**.
- **No retorna ningún valor**, ni siquiera `void`.
- Se ejecuta **automáticamente** al crear un objeto usando `new`.
- Se puede **sobrecargar** (tener múltiples constructores con diferentes parámetros).
- Si no defines uno, **Java crea un constructor por defecto** sin parámetros.

---

### Clase `Persona` con constructor

```java
public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Persona.
     * Inicializa los atributos nombre y edad con los valores recibidos.
     *
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asignamos el valor recibido al atributo de clase
        this.edad = edad;
    }

    /**
     * Método para mostrar la información de la persona.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}
```

### Clase Main para usar el constructor
```java
public class Main {
public static void main(String[] args) {
// Crear un objeto de tipo Persona usando el constructor  (instanciar)
Persona persona1 = new Persona("Carlos", 25);

        // Llamar al método para mostrar la información
        persona1.mostrarInformacion();
    }
}
```
- Se crea un objeto persona1 con el constructor new Persona("Carlos", 25);.

- El constructor se ejecuta automáticamente y asigna los valores a los atributos nombre y edad.

- Luego se llama al método mostrarInformacion() para imprimir los datos.

## 📌 Tips para entender mejor los constructores

- Es como una "fábrica de objetos" personalizada: tú decides con qué características nace cada objeto.
 
- Si usas this, estás diciendo "este atributo de la clase", no una variable local.

- Puedes tener múltiples constructores con diferentes combinaciones de parámetros.

## 📚 Material Extra: Constructores en Java

## 📝 Lecturas recomendadas

### 1. [Documentación oficial de Oracle sobre constructores](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- Explicación oficial del funcionamiento de los constructores en Java.
- Ejemplos claros y precisos.

### 2. [Programación Orientada a Objetos en Java – Aprende Java](https://aprendejava.org/poo/)
- Curso gratuito muy didáctico.
- Explica constructores, herencia, clases, objetos y más.

---

## 🎥 Videos recomendados

### 🔸 [Píldoras Informáticas – Constructores en Java](https://www.youtube.com/watch?v=WNVV7lMekUQ)
- Video en español, muy popular entre estudiantes.
- Explicación clara con ejemplos en consola.

### 🔸 [Código Místico – POO en Java: Constructores](https://www.youtube.com/watch?v=2iX9bZaaAQA)
- Ejemplos con NetBeans.
- Visual y fácil de seguir.

---

## 🧪 Plataformas para practicar

### 🔹 [CodingBat – Ejercicios en Java](https://codingbat.com/java)
- Muchos ejercicios prácticos.
- Ideal para reforzar lógica y manejo de métodos.

### 🔹 [JetBrains Academy – Curso interactivo de Java](https://www.jetbrains.com/academy/)
- Curso paso a paso.
- Incluye teoría, ejemplos y ejercicios con feedback.

---

## 🧠 Ejercicios sugeridos

### ✅ 1. Clase `Libro`
Crea una clase con los siguientes atributos:
- `titulo`
- `autor`
- `paginas`
  Incluye un constructor y un método para mostrar la información.

---

### ✅ 2. Clase `Estudiante`
Atributos:
- `nombre`
- `carrera`
- `promedio`

Incluye dos constructores:
- Uno con todos los parámetros.
- Otro solo con nombre y carrera (usa un promedio por defecto de 3.5).

---

### ✅ 3. Clase `CuentaBancaria`
Atributos:
- `saldo`

Métodos:
- `depositar(double cantidad)`
- `retirar(double cantidad)`
- `consultarSaldo()`

Incluye un constructor que inicialice el saldo.

---
