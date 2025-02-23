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
