# Operadores Aritméticos y de Asignación 

## Operadores Aritméticos

Son operadores binarios que realizan operaciones matemáticas:
    
**Suma (+)**: Realiza la suma de dos operandos.
**Resta (-)**:Realiza la resta entre dos operandos. 
**Multiplicación (*)**: Multiplica dos operandos.
**División (/)**: Divide el primer operando por el segundo. Si ambos operandos son enteros, el resultado es un número entero (truncado).
**Modulo (%):** Devuelve el residuo de la división entre dos operandos.
    
```java
    Ejemplo:
int a = 9;
int b = 4;
int suma = a + b; // 9 + 4 = 13
int resta = a - b; // 9 - 4 = 5
int div = a / b; // 9 / 4 = 2 (parte entera)
int res = a % b; // 9 % 4 = 1 (residuo de la división)
  
```

---

## Operadores de Asignación

Los operadores de asignación permiten asignar valores a variables. El operador principal es **=**, pero también existen versiones acumulativas como:

        <li><strong>+=</strong>: Suma el valor de la derecha al de la izquierda y lo asigna.</li>
        <li><strong>-=</strong>: Resta el valor de la derecha al de la izquierda y lo asigna.</li>
        <li><strong>*=</strong>: Multiplica el valor de la derecha por el de la izquierda y lo asigna.</li>
        <li><strong>/=</strong>: Divide el valor de la izquierda por el de la derecha y lo asigna.</li>
        <li><strong>%=</strong>: Asigna el residuo de la división entre la izquierda y la derecha.</li>
    </ul>

**Ejemplo:**

```java
   int a = 5;
a += 3; // a = a + 3; ahora a = 8
a -= 2; // a = a - 2; ahora a = 6
a *= 2; // a = a * 2; ahora a = 12
a /= 3; // a = a / 3; ahora a = 4
a %= 3; // a = a % 3; ahora a = 1
```


#### Tabla de Operadores de Asignación
    <table border="1">
        <thead>
            <tr>
                <th>Operador</th>
                <th>Expresión</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>=</td>
                <td>a = b</td>
                <td>Asigna el valor de <code>b</code> a <code>a</code>.</td>
            </tr>
            <tr>
                <td>+=</td>
                <td>a += b</td>
                <td>Suma <code>b</code> a <code>a</code> y asigna el resultado a <code>a</code>.</td>
            </tr>
            <tr>
                <td>-=</td>
                <td>a -= b</td>
                <td>Resta <code>b</code> a <code>a</code> y asigna el resultado a <code>a</code>.</td>
            </tr>
            <tr>
                <td>*=</td>
                <td>a *= b</td>
                <td>Multiplica <code>a</code> por <code>b</code> y asigna el resultado a <code>a</code>.</td>
            </tr>
            <tr>
                <td>/=</td>
                <td>a /= b</td>
                <td>Divide <code>a</code> entre <code>b</code> y asigna el resultado a <code>a</code>.</td>
            </tr>
            <tr>
                <td>%=</td>
                <td>a %= b</td>
                <td>Asigna el residuo de la división entre <code>a</code> y <code>b</code> a <code>a</code>.</td>
            </tr>
        </tbody>
    </table>
        <h1>Operadores de Incremento y Decremento en Java</h1>
    <p>Los operadores <code>++</code> y <code>--</code> son utilizados para incrementar o decrementar una variable en 1. Pueden usarse de dos maneras:</p>
    <ul>
        <li><strong>Preincremento / Predecremento:</strong> Primero modifica la variable y luego utiliza el valor modificado.</li>
        <li><strong>Postincremento / Postdecremento:</strong> Primero utiliza la variable en su estado actual y luego la modifica.</li>
    </ul>

**Ejemplo Práctico**

```java
Considera el siguiente código en Java:

// Declaración inicial
int x = 5;

// Preincremento (++x)
int y = ++x; // Incrementa x (x pasa a ser 6) y asigna ese valor a y.
System.out.println("x: " + x); // Imprime 6
System.out.println("y: " + y); // Imprime 6

// Postincremento (x++)
int z = x++; // Usa el valor actual de x (6) y luego lo incrementa.
System.out.println("x: " + x); // Imprime 7
System.out.println("z: " + z); // Imprime 6
```

---

## Operadores Relacionales 

Los operadores relacionales sirven para realizar comparaciones de igualdad, desigualdad y relación de menor o mayor. El resultado de estos operadores es siempre un valor booleano **true** o **false**) según se cumpla o no la relación considerada. Se utilizan con frecuencia en estructuras de decisión (**if**, **else**) y bucles (**while**, **for**).

<h2>Tabla de Operadores Relacionales</h2>
    <table>
        <thead>
            <tr>
                <th>Operador</th>
                <th>Descripción</th>
                <th>Ejemplo</th>
                <th>Resultado</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><code>==</code></td>
                <td>Igual a</td>
                <td><code>5 == 5</code></td>
                <td><code>true</code></td>
            </tr>
            <tr>
                <td><code>!=</code></td>
                <td>Diferente de</td>
                <td><code>5 != 3</code></td>
                <td><code>true</code></td>
            </tr>
            <tr>
                <td><code>&lt;</code></td>
                <td>Menor que</td>
                <td><code>3 &lt; 5</code></td>
                <td><code>true</code></td>
            </tr>
            <tr>
                <td><code>&gt;</code></td>
                <td>Mayor que</td>
                <td><code>7 &gt; 5</code></td>
                <td><code>true</code></td>
            </tr>
            <tr>
                <td><code>&lt;=</code></td>
                <td>Menor o igual a</td>
                <td><code>5 &lt;= 5</code></td>
                <td><code>true</code></td>
            </tr>
            <tr>
                <td><code>&gt;=</code></td>
                <td>Mayor o igual a</td>
                <td><code>6 &gt;= 5</code></td>
                <td><code>true</code></td>
            </tr>
        </tbody>
    </table>

----

### Ejemplo de Código en Java

```java

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

 // Operadores de comparación
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a <= b: " + (a <= b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
    }
}
```

   

