# 📌 ¿Qué es una Matriz?
Una matriz es una estructura de datos que nos permite almacenar múltiples valores en una tabla de filas y columnas. Se usa cuando queremos manejar datos organizados en una estructura bidimensional.

### 💡 Ejemplo en la vida real:
Imagina una hoja de cálculo de Excel con filas y columnas. Cada celda es un espacio donde puedes guardar un valor.

---

## 📌 Cómo Declarar una Matriz 
En Java, una matriz se declara con el siguiente formato:

```java
tipoDeDato[][] nombreMatriz = new tipoDeDato[filas][columnas];
```
**💡 Ejemplo:**
Si queremos una matriz de 3 filas y 3 columnas que almacene números enteros, la declaramos así:

```java
int[][] matriz = new int[3][3];
```
Esto crea una tabla de 3x3 donde cada posición contiene el valor 0 por defecto.

---
## 📌 Cómo Acceder a los Datos de una Matriz
Cada posición dentro de una matriz tiene un índice basado en filas y columnas, que empieza desde 0.
```java
matriz[fila][columna] = valor;
```
**💡 Ejemplo:**
Si queremos asignar el número 5 a la primera posición (fila 0, columna 0):
```java
matriz[0][0] = 5;

```
Si queremos ver qué hay en esa posición:
```java
System.out.println(matriz[0][0]); // Imprime: 5
```
---
## 📌 Cómo Ingresar Datos en una Matriz con un Bucle
Podemos usar un bucle for anidado para recorrer la matriz y pedir datos al usuario.

**💡 Ejemplo: Llenar una matriz de 3x3 con datos ingresados por el usuario**
```java
import java.util.Scanner;

public class MatrizUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Llenamos la matriz con datos ingresados por el usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
```
---
## 📌 Cómo Generar Datos Aleatorios en una Matriz
Podemos llenar una matriz con números aleatorios usando la clase Random de Java.

**💡 Ejemplo: Llenar una matriz de 3x3 con números aleatorios entre 1 y 100**

```java
import java.util.Random;

public class MatrizAleatoria {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];

        // Llenamos la matriz con números aleatorios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números entre 1 y 100
            }
        }

        // Mostramos la matriz generada
        System.out.println("Matriz con números aleatorios:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```
---
✔️ **Las matrices** permiten almacenar datos en una estructura de filas y columnas.

✔️ Podemos acceder y modificar cualquier dato con sus índices [fila][columna].

✔️ Podemos llenar matrices manualmente o usando valores aleatorios.

✔️ Usamos bucles for para recorrer y manipular matrices de manera eficiente.

---

# 📚 Material de Apoyo para Matrices en Java

## 📺 Videos Explicativos
- [Matrices en Java desde Cero - Ejemplo Práctico](https://www.youtube.com/watch?v=5LNLxoW6Fow)
- [Cómo trabajar con matrices en Java - Curso Completo](https://www.youtube.com/watch?v=GJqOYsXrjgg)
- [Matrices en Java con Ejemplos](https://www.youtube.com/watch?v=8JL2uT7kCWk)

## 📖 Páginas y Documentación
- [GeeksforGeeks - Matrices en Java](https://www.geeksforgeeks.org/multidimensional-arrays-in-java/)
- [JavaTPoint - Java Arrays](https://www.javatpoint.com/multidimensional-array-in-java)
- [W3Schools - Arrays en Java](https://www.w3schools.com/java/java_arrays.asp)

## 🛠 Ejercicios Interactivos
- [LeetCode - Problemas con Matrices](https://leetcode.com/tag/array/)
- [HackerRank - Arrays](https://www.hackerrank.com/domains/tutorials/10-days-of-javascript)
- [CodingBat - Ejercicios de Arrays en Java](https://codingbat.com/java/Array-1)  
