# 📌 ¿Qué es un Arreglo?
Un arreglo (array) es una estructura de datos que almacena múltiples valores del mismo tipo en una sola variable. Es como una fila de casillas numeradas, donde cada casilla puede contener un dato.

**💡 Ejemplo en la vida real:**
Imagina una lista de estudiantes en un salón. Cada estudiante ocupa una posición en la lista, y puedes acceder a él usando su número de asiento.

---

## 📌 Cómo Declarar un Arreglo
En Java, los arreglos se declaran con este formato:

```java
tipoDeDato[] nombreArreglo = new tipoDeDato[tamaño];

```

**💡 Ejemplo:**
Si queremos un arreglo de 5 números enteros, lo declaramos así:

```java
int[] numeros = new int[5];


```
Esto crea un arreglo de 5 posiciones donde cada posición contiene 0 por defecto.

---

## 📌 Cómo Asignar y Acceder a Datos en un Arreglo

Cada posición de un arreglo tiene un índice, que empieza desde 0.

```java
nombreArreglo[indice] = valor;


```
**💡 Ejemplo:**
Si queremos guardar el número 10 en la primera posición:

```java
numeros[0] = 10;



```
Si queremos ver qué hay en esa posición:

```java
System.out.println(numeros[0]); // Imprime: 10




```

---

## 📌 Cómo Ingresar Datos en un Arreglo con un Bucle

Podemos usar un bucle **for** para llenar el arreglo con datos ingresados por el usuario.
**💡 Ejemplo: Llenar un arreglo de 5 números desde el teclado**

```java
import java.util.Scanner;

public class ArregloUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Llenamos el arreglo con datos ingresados por el usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostramos el arreglo
        System.out.println("Números ingresados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }
}



```
----

## 📌 Cómo Generar Datos Aleatorios en un Arreglo

Podemos llenar un arreglo con números aleatorios usando la clase **Random**.

**💡 Ejemplo: Llenar un arreglo de 10 números aleatorios entre 1 y 100**

```java
import java.util.Random;

public class ArregloAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        // Llenamos el arreglo con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // Números entre 1 y 100
        }

        // Mostramos el arreglo generado
        System.out.println("Arreglo con números aleatorios:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}


```

-----
## 📌 Cómo Ordenar un Arreglo

Podemos ordenar un arreglo con **Arrays.sort().**

**💡 Ejemplo: Ordenar un arreglo de números**

```java
import java.util.Arrays;

public class ArregloOrdenado {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 6};

        // Ordenamos el arreglo
        Arrays.sort(numeros);

        // Mostramos el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}


```
---

✔️ Los arreglos permiten almacenar y manipular múltiples valores del mismo tipo.

✔️ Se accede a cada elemento con su **índice**, que empieza en **0**.

✔️ Podemos llenar arreglos manualmente o con valores aleatorios.

✔️ Los arreglos pueden ordenarse y manipularse fácilmente con métodos como **Arrays.sort()**.


