## 1. Importación de la clase Random

```java
import java.util.Random;

```
La clase Random permite generar números aleatorios. Se usa aquí para crear temperaturas aleatorias dentro del rango de 30°C a 41°C.

---------

## Definición de la clase y método principal

```java
public class Temperaturas2025 {
    public static void main(String[] args) {


```

La clase Temperaturas2025 es el punto de entrada del programa.
El método main es donde se ejecuta todo el código.

----

## 3. Creación de un objeto Random

```java
Random rand = new Random();

```

rand es un objeto que se usa para generar números aleatorios, lo cual será útil para asignar temperaturas aleatorias.

-----

## 4. Definición del número de días por mes

```java
int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


```

Este arreglo almacena el número de días en cada mes del año. Se usa para definir el tamaño de cada subarreglo de temperaturas.

---


## 5. Creación de la matriz de temperaturas

```java
double[][] temperaturas = new double[12][];

```

Es una matriz de 12 filas (correspondientes a los meses).
Cada fila tiene una cantidad variable de columnas, según los días del mes.

---

## 6. Generación de temperaturas aleatorias

```java
for (int mes = 0; mes < 12; mes++) {
    temperaturas[mes] = new double[diasPorMes[mes]];
    for (int dia = 0; dia < diasPorMes[mes]; dia++) {
        temperaturas[mes][dia] = 30 + rand.nextDouble() * 11;
    }
}


```

Se recorre cada mes del año.

Se crea un arreglo de temperaturas para cada mes, con una longitud igual al número de días de ese mes.

Se asigna a cada día una temperatura aleatoria entre 30°C y 41°C usando rand.nextDouble() * 11.

----

## 7. Variables para el cálculo anual

```java
double sumaAnual = 0, tempMaxAnual = 30, tempMinAnual = 41;
int totalDias = 0;


```
*sumaAnual*: Almacena la suma total de temperaturas del año.

*tempMaxAnual*: Guarda la temperatura más alta encontrada.

*tempMinAnual*: Guarda la temperatura más baja encontrada.

*totalDias*: Lleva la cuenta del total de días del año.

----

## 8. Impresión de temperaturas diarias


```java
System.out.println("------ TEMPERATURAS DIARIAS -------");
for (int mes = 0; mes < 12; mes++) {
    System.out.println("\nMes " + (mes + 1));
    System.out.println("+------+------------+");
    System.out.println("| Día  | Temperatura |");
    System.out.println("+------+------------+");

    for (int dia = 0; dia < temperaturas[mes].length; dia++) {
        System.out.printf("| %4d | %10.2f°C |\n", dia + 1, temperaturas[mes][dia]);
    }
    System.out.println("+------+------------+");
}


```

Se recorre cada mes y cada día dentro del mes.

Se imprime una tabla con los valores de temperatura generados.

----

## 9. Cálculo e impresión de estadísticas mensuales

```java
System.out.println("\n------ TEMPERATURAS MENSUALES ------");
System.out.println("+-----+------------+------------+------------+");
System.out.println("| Mes | Promedio   | Máxima      | Mínima      |");
System.out.println("+-----+------------+------------+------------+");


```
Imprime la cabecera de una tabla donde se mostrarán estadísticas mensuales.

## Cálculo de temperaturas por mes

```java
for (int mes = 0; mes < 12; mes++) {
    double sumaMensual = 0, tempMaxMensual = 30, tempMinMensual = 41;

    for (double temp : temperaturas[mes]) {
        sumaMensual += temp;
        tempMaxMensual = Math.max(tempMaxMensual, temp);
        tempMinMensual = Math.min(tempMinMensual, temp);
    }

    double promedioMensual = sumaMensual / temperaturas[mes].length;
    System.out.printf("| %3d | %10.2f°C | %10.2f°C | %10.2f°C |\n", mes + 1, promedioMensual, tempMaxMensual, tempMinMensual);


```

Se recorre cada mes.

Se suman todas las temperaturas del mes.

Se calculan la temperatura máxima y mínima.

Se imprime el promedio, la máxima y la mínima del mes.

----

## 10. Cálculo y muestra del resumen anual

```java
sumaAnual += sumaMensual;
tempMaxAnual = Math.max(tempMaxAnual, tempMaxMensual);
tempMinAnual = Math.min(tempMinAnual, tempMinMensual);
totalDias += temperaturas[mes].length;


```
Se acumulan los valores para calcular las estadísticas anuales.

Se comparan temperaturas máximas y mínimas.

---------

## 11. Cálculo del promedio anual

```java
double promedioAnual = sumaAnual / totalDias;


```

Calcula la temperatura promedio de todo el año.

----

## 12. Impresión del resumen anual

```java
System.out.println("\n------ RESUMEN ANUAL -----");
System.out.println("+-------------+------------+");
System.out.println("| Categoría   | Temperatura |");
System.out.println("+-------------+------------+");
System.out.printf("| Promedio    | %10.2f°C |\n", promedioAnual);
System.out.printf("| Máxima      | %10.2f°C |\n", tempMaxAnual);
System.out.printf("| Mínima      | %10.2f°C |\n", tempMinAnual);
System.out.println("+-------------+------------+");

```
Se imprimen las estadísticas finales:

    -Temperatura promedio del año.

    -Temperatura máxima registrada.

    -Temperatura mínima registrada.

- Algunas cosas ustede ya las debe saber :v


