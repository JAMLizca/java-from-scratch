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

**+=**: Suma el valor de la derecha al de la izquierda y lo asigna.

**-=**: Resta el valor de la derecha al de la izquierda y lo asigna.

**=**: Multiplica el valor de la derecha por el de la izquierda y lo asigna.

**/=**: Divide el valor de la izquierda por el de la derecha y lo asigna.

**%=**: Asigna el residuo de la división entre la izquierda y la derecha.

**Ejemplo:**

```java
int a = 5;
a += 3; // a = a + 3; ahora a = 8
a -= 2; // a = a - 2; ahora a = 6
a *= 2; // a = a * 2; ahora a = 12
a /= 3; // a = a / 3; ahora a = 4
a %= 3; // a = a % 3; ahora a = 1
```


## Tabla de Operadores de Asignación


| Operador | Expresión | Descripción |
|----------|-----------|-------------|
| `=`  | `a = b`  | Asigna el valor de `b` a `a`. |
| `+=` | `a += b` | Suma `b` a `a` y asigna el resultado a `a`. |
| `-=` | `a -= b` | Resta `b` a `a` y asigna el resultado a `a`. |
| `*=` | `a *= b` | Multiplica `a` por `b` y asigna el resultado a `a`. |
| `/=` | `a /= b` | Divide `a` entre `b` y asigna el resultado a `a`. |
| `%=` | `a %= b` | Asigna el residuo de la división entre `a` y `b` a `a`. |

---

# Operadores de Incremento y Decremento 

Los operadores `++` y `--` son utilizados para incrementar o decrementar una variable en 1. Pueden usarse de dos maneras:


- **Preincremento / Predecremento:** Primero modifica la variable y luego utiliza el valor modificado.

- **Postincremento / Postdecremento:** Primero utiliza la variable en su estado actual y luego la modifica.


**Ejemplo Práctico**

```java
Considera el siguiente código:

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

### Tabla de Operadores Relacionales

| Operador | Descripción       | Ejemplo      | Resultado |
|----------|------------------|-------------|-----------|
| `==`     | Igual a          | `5 == 5`    | `true`    |
| `!=`     | Diferente de     | `5 != 3`    | `true`    |
| `<`      | Menor que        | `3 < 5`     | `true`    |
| `>`      | Mayor que        | `7 > 5`     | `true`    |
| `<=`     | Menor o igual a  | `5 <= 5`    | `true`    |
| `>=`     | Mayor o igual a  | `6 >= 5`    | `true`    |


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

   

