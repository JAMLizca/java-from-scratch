# Formas de Ejecutar Código Java

Java es un lenguaje de programación versátil y ampliamente utilizado en el desarrollo de aplicaciones móviles, de escritorio y sistemas empresariales. En esta guía, te mostramos las formas más comunes de ejecutar código Java, cómo instalar el entorno de desarrollo adecuado y configurarlo en tu sistema.

## 1. Instalación de Java

![JDK](https://www.codtronic.com/wp-content/uploads/2022/10/jdk.png)

Para comenzar a programar en Java, primero debes instalar el Java Development Kit (JDK). Aquí están los pasos para hacerlo:

**Paso 1:** Dirígete a la página oficial de Oracle para descargar la última versión de Java.  
[Descargar JDK desde Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)

**Paso 2:** Selecciona la versión adecuada para tu sistema operativo (Windows, macOS, Linux) y descarga el instalador.

**Paso 3:** Ejecuta el instalador y sigue las instrucciones para completar la instalación.

**Paso 4:** Configura la variable de entorno `JAVA_HOME` para que puedas ejecutar comandos Java desde la línea de comandos.

**Nota:** La versión más reciente es la **JDK 21**, y puedes verificar la última versión en el siguiente enlace:  
[Última versión de Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

## 2. Configuración de las Variables de Entorno

Configurar las variables de entorno permite que puedas ejecutar los comandos de Java en cualquier directorio de tu sistema.

| Sistema Operativo | Pasos |
|--------------------|-------|
| **Windows**        | 1. Accede al Panel de Control y busca "Variables de Entorno".<br>2. Añade una nueva variable llamada `JAVA_HOME` con la ruta de instalación de Java (por ejemplo, `C:\Program Files\Java\jdk-XX.X.X`).<br>3. Modifica la variable `PATH` para incluir `%JAVA_HOME%\bin`. |
| **macOS/Linux**    | 1. Edita el archivo de configuración `.bashrc` o `.zshrc` y agrega las siguientes líneas:<br> `export JAVA_HOME=/ruta/a/jdk`<br>`export PATH=$JAVA_HOME/bin:$PATH`<br>2. Ejecuta `source ~/.bashrc` o `source ~/.zshrc` para que los cambios tomen efecto. |

## 3. Formas de Ejecutar Código Java

![Logo de Java](https://desarrolloweb.com/storage/collection_images/actual/0wLchbKtPUumIKGjaGAVPYQT2ADz20xQMkjyTUBY.jpg)

Una vez que Java esté instalado y configurado, existen diversas formas de ejecutar tus programas. Aquí te mostramos las más comunes:

| Método                     | Descripción                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
| **Usar un IDE**            | Herramientas como IntelliJ IDEA, Eclipse, NetBeans y VS Code ofrecen un entorno completo para escribir, compilar y ejecutar programas Java. |
| **Desde la línea de comandos** | Compila y ejecuta tu código Java utilizando los comandos de la terminal:<br>`javac MiPrograma.java`<br>`java MiPrograma` |
| **Con herramientas online** | Puedes ejecutar código Java en plataformas online como JDoodle, Replit, o Compiler Explorer. |
| **Usando un editor de texto y terminal** | Escribe el código en un editor como VS Code o Sublime Text, compílalo y ejecútalo desde la terminal. |

## 4. Descarga y Uso de IDEs

Aquí te presentamos algunos de los IDEs más populares para programar en Java:

- **NetBeans:** Un IDE gratuito y de código abierto que incluye todo lo necesario para desarrollar, depurar y ejecutar aplicaciones Java.  
  [Descargar NetBeans](https://netbeans.apache.org/download/index.html)

# Aprende Java desde Cero 🚀✨

## ¿Por qué elegir Java?  
Java es un lenguaje de programación robusto, versátil y ampliamente utilizado en el desarrollo de aplicaciones empresariales, móviles y de escritorio.

---

### 1. Descarga e instala el JDK  
Para programar en Java, necesitas el **Java Development Kit (JDK)**. Descárgalo desde su sitio oficial:  
[Descargar JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

---

### 2. Configura las variables de entorno  
Después de instalar el JDK, configura las variables de entorno para que tu sistema reconozca los comandos de Java. Consulta esta guía paso a paso para hacerlo:  
[Configuración de variables de entorno](https://www.oracle.com/java/technologies/javase-jdk-installation-guide.html)

---

### 3. Elige un editor o IDE  
#### a) VS Code  
Visual Studio Code es un editor ligero y altamente personalizable. Descárgalo desde:  
[Descargar VS Code](https://code.visualstudio.com/)  

Luego, instala la extensión "Java Extension Pack" desde el Marketplace dentro de VS Code.

#### b) IntelliJ IDEA  
IntelliJ IDEA es un IDE potente y fácil de usar, recomendado para mejorar la productividad al programar en Java. Ofrece:  
- **Refactorización de código:** Reestructura el código sin perder funcionalidad.  
- **Integración con control de versiones:** Compatible con Git y SVN.  
- **Asistente de depuración:** Detecta y corrige errores eficientemente.  

Descárgalo desde:  
[Descargar IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

---

### 4. Tutorial guía: Aprende a ejecutar código Java  
Consulta este video diseñado para principiantes que explica cómo configurar tu entorno y ejecutar tu código:  
[Tutorial: Cómo ejecutar código Java](https://www.youtube.com/watch?v=4WKo13f2Qpc)

---

## Fundamentos de Java  

### ¿Qué es Java?  
![Logo de Java](https://docpath.com/wp-content/uploads/benefits-of-using-java-programming-language.jpg)  

Java es un lenguaje de programación orientado a objetos desarrollado por Sun Microsystems (ahora parte de Oracle). Es conocido por su portabilidad, ya que permite ejecutar el mismo código en diferentes plataformas gracias a la máquina virtual de Java (JVM).

---

### Hola Mundo en Java  
El programa más básico para empezar a programar en Java es "Hola Mundo". A continuación, se muestra cómo se escribe:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }

```

### Ejemplo:
  ```java
System.out.println("Hola");
System.out.println("mundo");
  ```
    
### Salida:
```java
Hola
mundo
```
# Entrada de datos en Java:
    <h2>Clase <code>Scanner</code></h2>
    <p>La clase <code>Scanner</code> se usa para obtener entrada de datos del usuario y se encuentra en el paquete <code>java.util</code>. Antes de usarla, es necesario importarla.</p>
    <h3>¿Cómo usar <code>Scanner</code>?</h3>
    <ol>
        <li><strong>Importar la clase Scanner:</strong>  
        <pre>
<code>import java.util.Scanner;</code>
        </pre>
        </li>
        <li><strong>Crear un objeto Scanner:</strong>  
        <pre>
<code>Scanner sc = new Scanner(System.in);</code>
        </pre>
        Este objeto servirá para leer la entrada del usuario.</li>
        <li><strong>Leer datos del usuario:</strong>  
        Usamos el método <code>nextLine()</code> para leer texto ingresado por el usuario:
        <pre>
<code>String userName = sc.nextLine();</code>
        </pre>
        Aquí, lo que el usuario escriba se guardará en la variable <code>userName</code>.
        </li>
        <li><strong>Mostrar el dato ingresado:</strong>  
        Finalmente, mostramos el dato con:
        <pre>
<code>System.out.println("Tu nombre es: " + userName);</code>
        </pre>
        </li>
    </ol>

<h3>Ejemplo Completo:</h3>
    <pre>
<code>
import java.util.Scanner;  // Importa la clase Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Crea un objeto Scanner

System.out.println("Por favor, ingresa tu nombre:");  // Pide al usuario su nombre
        String userName = sc.nextLine();  // Lee el nombre ingresado por el usuario

System.out.println("Tu nombre es: " + userName);  // Muestra el nombre ingresado
    }
}
</code>
    </pre>
    <h3>Salida del Programa:</h3>
    <pre>
<code>
Por favor, ingresa tu nombre:
> José
Tu nombre es: José
</code>
    </pre>

 <p>Este ejemplo utiliza el método <code>nextLine()</code> para leer texto completo. También puedes usar otros métodos como <code>nextInt()</code> para leer números.</p>
 <h1>Tipos de Entrada con la Clase <code>Scanner</code> en Java</h1>
  
    
   <img src="https://keepcoding.io/wp-content/uploads/2024/08/system.out_.print_-1.jpg" alt="Logo de sout" width="500">   <table border="1" cellpadding="10">
     <p>La clase <code>Scanner</code> nos permite leer diferentes tipos de datos del usuario. Dependiendo del tipo de dato, usamos un método específico:</p>
        <thead>
            <tr>
                <th>Método</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><code>nextBoolean()</code></td>
                <td>Lee un valor booleano (<code>true</code> o <code>false</code>).</td>
            </tr>
            <tr>
                <td><code>nextByte()</code></td>
                <td>Lee un valor de tipo byte (número pequeño).</td>
            </tr>
            <tr>
                <td><code>nextDouble()</code></td>
                <td>Lee un número decimal grande (<code>double</code>).</td>
            </tr>
            <tr>
                <td><code>nextFloat()</code></td>
                <td>Lee un número decimal más pequeño (<code>float</code>).</td>
            </tr>
            <tr>
                <td><code>nextInt()</code></td>
                <td>Lee un número entero.</td>
            </tr>
            <tr>
                <td><code>nextLine()</code></td>
                <td>Lee una línea completa de texto.</td>
            </tr>
            <tr>
                <td><code>nextLong()</code></td>
                <td>Lee un número entero muy grande (<code>long</code>).</td>
            </tr>
            <tr>
                <td><code>nextShort()</code></td>
                <td>Lee un número entero pequeño (<code>short</code>).</td>
            </tr>
        </tbody>
    </table>

<p>Por ejemplo, si necesitas leer un número entero, usas <code>nextInt()</code>. Si necesitas leer texto, usas <code>nextLine()</code>. Cada método está diseñado para capturar un tipo de dato específico.</p>
<h1>Tipos de Variables en Java</h1>
 <img src="https://oregoom.com/wp-content/uploads/2024/03/tipos-de-variables-en-java.webp" alt="Logo de sout" width="500">
    <p>Una variable es un contenedor que guarda información en un programa, y su valor puede cambiar durante la ejecución. En Java, existen diferentes tipos de variables dependiendo del tipo de datos que almacenan. Aquí explicamos los principales tipos de variables y su uso.</p>
    
<h2>1. Variables de tipos primitivos</h2>
    <p>Son las variables más básicas. Cada una almacena un valor único como números, caracteres, o valores booleanos. Estas variables son de tamaño fijo y declaradas con su tipo explícito.</p>
    <pre>
<code>
int edad = 25;          // Entero
double precio = 9.99;   // Número con decimales
char letra = 'A';       // Carácter
boolean esMayor = true; // Valor verdadero o falso
</code>
    </pre>
    <h3>Tipos primitivos disponibles en Java:</h3>
    <table border="1">
        <thead>
            <tr>
                <th>Tipo</th>
                <th>Descripción</th>
                <th>Ejemplo</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>byte</td>
                <td>Entero pequeño (8 bits)</td>
                <td><code>byte b = 100;</code></td>
            </tr>
            <tr>
                <td>short</td>
                <td>Entero pequeño (16 bits)</td>
                <td><code>short s = 1000;</code></td>
            </tr>
            <tr>
                <td>int</td>
                <td>Entero estándar (32 bits)</td>
                <td><code>int i = 50000;</code></td>
            </tr>
            <tr>
                <td>long</td>
                <td>Entero grande (64 bits)</td>
                <td><code>long l = 100000L;</code></td>
            </tr>
            <tr>
                <td>float</td>
                <td>Número decimal simple (32 bits)</td>
                <td><code>float f = 3.14f;</code></td>
            </tr>
            <tr>
                <td>double</td>
                <td>Número decimal doble precisión</td>
                <td><code>double d = 3.14159;</code></td>
            </tr>
            <tr>
                <td>char</td>
                <td>Carácter único (16 bits)</td>
                <td><code>char c = 'A';</code></td>
            </tr>
            <tr>
                <td>boolean</td>
                <td>Verdadero o falso</td>
                <td><code>boolean b = true;</code></td>
            </tr>
        </tbody>
    </table>
    
<h2>2. Inferencia de tipos con <code>var</code></h2>
    <p>Java introdujo la palabra clave <code>var</code> en la versión 10 para simplificar la declaración de variables. Con <code>var</code>, Java deduce automáticamente el tipo de datos basado en el valor que se le asigna. Esto se llama inferencia de tipos.</p>
    <pre>
<code>
var numero = 100;         // Java infiere que es un int
var precio = 9.99;        // Java infiere que es un double
var mensaje = "Hola";     // Java infiere que es un String
var esValido = true;      // Java infiere que es un boolean
</code>
    </pre>
    <h3>Reglas para usar <code>var</code>:</h3>
    <ul>
        <li><strong>Debe inicializarse al declararla:</strong> Si no asignas un valor al declarar la variable, Java no podrá determinar el tipo.</li>
        <pre>
<code>
❌ var sinValor; // Error: no se puede inferir el tipo
✔ var valor = 10; // El tipo inferido es int
</code>
        </pre>
        <li><strong>Solo funciona dentro de métodos:</strong> <code>var</code> no se puede usar como una variable de clase o global (atributos de objetos).</li>
        <pre>
<code>
❌ var atributo; // Error: no se permite fuera de un método
</code>
        </pre>
        <li><strong>No se puede cambiar el tipo:</strong> Una vez que se infiere el tipo, no puede cambiar.</li>
        <pre>
<code>
❌ var texto = "Hola"; // Inferido como String
texto = 123;        // Error: no puedes asignar un int a un String
</code>
        </pre>
    </ul>
    <h3>Ejemplo completo usando <code>var</code>:</h3>
    <pre>
<code>
public class DemoVar {
    public static void main(String[] args) {
        // Inferencia de tipos
        var numero = 42;           // int
        var texto = "Hola Mundo";  // String
        var decimal = 3.14;        // double
        var caracter = 'A';        // char
        var logico = true;         // boolean

// Imprimir los valores
        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
        System.out.println("Decimal: " + decimal);
        System.out.println("Carácter: " + caracter);
        System.out.println("Lógico: " + logico);
    }
}
</code>
    </pre>
    <h1>Variables de Tipo Referencia en Java</h1>
    <p>
        En Java, las <strong>variables de tipo referencia</strong> no almacenan el valor directamente,
        sino que apuntan a un objeto en la memoria. Esto significa que la variable actúa como una 
        "dirección" hacia el objeto.
    </p>

 <h2>Ejemplo básico:</h2>
    <div class="example">
        <p>Código:</p>
        <code>
String cadena = "Hola, mundo"; // cadena apunta al texto en memoria
        </code>
        <p>Explicación:</p>
        <p>
            La variable <code>cadena</code> no guarda el texto directamente. En su lugar, apunta a 
            la ubicación en la memoria donde está almacenado el texto <code>"Hola, mundo"</code>.
        </p>
    </div>

 <h2>Características principales:</h2>
    <ul>
        <li>Apuntan a objetos como cadenas (<code>String</code>), arreglos (<code>int[]</code>) o clases personalizadas.</li>
        <li>Se pueden compartir referencias entre variables. Si dos variables apuntan al mismo objeto, ambas lo modifican.</li>
        <li>El objeto permanece en la memoria hasta que el recolector de basura lo elimine.</li>
    </ul>
    <h2>Ejemplo con dos referencias:</h2>
    <div class="example">
        <p>Código:</p>
        <code>
String mensaje1 = "Hola";
String mensaje2 = mensaje1; // Ambas apuntan al mismo objeto

System.out.println(mensaje1); // Muestra: Hola
System.out.println(mensaje2); // Muestra: Hola
        </code>
        <p>Explicación:</p>
        <p>
            Tanto <code>mensaje1</code> como <code>mensaje2</code> apuntan al mismo texto 
            <code>"Hola"</code>. Si el contenido cambia a través de una referencia, el otro también se verá afectado.
        </p>
	<h1>Palabras Reservadas en Java</h1>
    <p>
        En Java, las palabras reservadas son identificadores que tienen un significado especial en el lenguaje. 
        Estas no pueden ser utilizadas como nombres de variables, métodos, clases u otros identificadores. 
        Aquí tienes la lista organizada en varias columnas:
    </p>

<table border="1">
        <thead>
            <tr>
                <th>Columna 1</th>
                <th>Columna 2</th>
                <th>Columna 3</th>
                <th>Columna 4</th>
                <th>Columna 5</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>abstract</td>
                <td>assert</td>
                <td>boolean</td>
                <td>break</td>
                <td>byte</td>
            </tr>
        <tr>
                <td>case</td>
                <td>catch</td>
                <td>char</td>
                <td>class</td>
                <td>const</td>
            </tr>
            <tr>
                <td>continue</td>
                <td>default</td>
                <td>do</td>
                <td>double</td>
                <td>else</td>
            </tr>
            <tr>
                <td>enum</td>
                <td>extends</td>
                <td>final</td>
                <td>finally</td>
                <td>float</td>
            </tr>
            <tr>
                <td>for</td>
                <td>goto</td>
                <td>if</td>
                <td>implements</td>
                <td>import</td>
            </tr>
            <tr>
                <td>instanceof</td>
                <td>int</td>
                <td>interface</td>
                <td>long</td>
                <td>native</td>
            </tr>
            <tr>
                <td>new</td>
                <td>null</td>
                <td>package</td>
                <td>private</td>
                <td>protected</td>
            </tr>
            <tr>
                <td>public</td>
                <td>return</td>
                <td>short</td>
                <td>static</td>
                <td>strictfp</td>
            </tr>
            <tr>
                <td>super</td>
                <td>switch</td>
                <td>synchronized</td>
                <td>this</td>
                <td>throw</td>
            </tr>
            <tr>
                <td>throws</td>
                <td>transient</td>
                <td>try</td>
                <td>void</td>
                <td>volatile</td>
            </tr>
            <tr>
                <td>while</td>
                <td colspan="4"></td> <!-- Celdas vacías para equilibrar -->
            </tr>
        </tbody>
    </table>
     <h1>Concatenación de Cadenas en Java</h1>

<h2>1. Operador +</h2>
    <p>Es la forma más básica de unir dos o más cadenas utilizando el operador <code>+</code>.</p>
    <pre>
<code>
String nombre = "María";
String saludo = "Hola, " + nombre + "!";
System.out.println(saludo);
// Salida: Hola, María!
</code>
    </pre>

 <h2>2. Método concat()</h2>
    <p>Une dos cadenas y devuelve una nueva cadena como resultado.</p>
    <pre>
<code>
String parte1 = "Hola";
String parte2 = " Mundo";
String resultado = parte1.concat(parte2);
System.out.println(resultado);
// Salida: Hola Mundo
</code>
    </pre>

<h2>3. StringBuilder</h2>
    <p>Permite construir y modificar cadenas de forma eficiente, ideal para unir muchas cadenas.</p>
    <pre>
<code>
StringBuilder sb = new StringBuilder("Hola");
sb.append(" Mundo").append(" desde Java");
System.out.println(sb.toString());
// Salida: Hola Mundo desde Java
</code>
    </pre>

 <h2>4. String.format()</h2>
    <p>Une cadenas y variables usando un formato predefinido.</p>
    <pre>
<code>
String nombre = "Carlos";
int edad = 30;
String mensaje = String.format("Mi nombre es %s y tengo %d años.", nombre, edad);
System.out.println(mensaje);
// Salida: Mi nombre es Carlos y tengo 30 años.
</code>
    </pre>

<h2>5. Método join()</h2>
    <p>Une varias cadenas con un separador entre ellas.</p>
    <pre>
<code>
String frutas = String.join(", ", "Manzana", "Banana", "Cereza");
System.out.println(frutas);
// Salida: Manzana, Banana, Cereza
</code>
    </pre>

 <h2>6. Collectors.joining()</h2>
    <p>Se usa en flujos de datos para unir elementos en una cadena, con o sin separadores.</p>
    <pre>
<code>
import java.util.stream.Stream;

String resultado = Stream.of("Hola", "Mundo", "Java")
                         .collect(java.util.stream.Collectors.joining(" "));
System.out.println(resultado);
// Salida: Hola Mundo Java
</code>
    </pre>
    <h1>Operadores Aritméticos y de Asignación en Java</h1>

<h2>Operadores Aritméticos</h2>
    <p>Son operadores binarios que realizan operaciones matemáticas:</p>
    <ul>
        <li><strong>Suma (+):</strong> Realiza la suma de dos operandos.</li>
        <li><strong>Resta (-):</strong> Realiza la resta entre dos operandos.</li>
        <li><strong>Multiplicación (*):</strong> Multiplica dos operandos.</li>
        <li><strong>División (/):</strong> Divide el primer operando por el segundo. Si ambos operandos son enteros, el resultado es un número entero (truncado).</li>
        <li><strong>Modulo (%):</strong> Devuelve el residuo de la división entre dos operandos.</li>
    </ul>
    <p><strong>Ejemplo:</strong></p>
    <pre><code>int a = 9;
int b = 4;
int suma = a + b; // 9 + 4 = 13
int resta = a - b; // 9 - 4 = 5
int div = a / b; // 9 / 4 = 2 (parte entera)
int res = a % b; // 9 % 4 = 1 (residuo de la división)
    </code></pre>

<h2>Operadores de Asignación</h2>
    <p>Los operadores de asignación permiten asignar valores a variables. El operador principal es <code>=</code>, pero también existen versiones acumulativas como:</p>
    <ul>
        <li><strong>+=</strong>: Suma el valor de la derecha al de la izquierda y lo asigna.</li>
        <li><strong>-=</strong>: Resta el valor de la derecha al de la izquierda y lo asigna.</li>
        <li><strong>*=</strong>: Multiplica el valor de la derecha por el de la izquierda y lo asigna.</li>
        <li><strong>/=</strong>: Divide el valor de la izquierda por el de la derecha y lo asigna.</li>
        <li><strong>%=</strong>: Asigna el residuo de la división entre la izquierda y la derecha.</li>
    </ul>

<p><strong>Ejemplo:</strong></p>
    <pre><code>int a = 5;
a += 3; // a = a + 3; ahora a = 8
a -= 2; // a = a - 2; ahora a = 6
a *= 2; // a = a * 2; ahora a = 12
a /= 3; // a = a / 3; ahora a = 4
a %= 3; // a = a % 3; ahora a = 1
    </code></pre>

 <h2>Tabla de Operadores de Asignación</h2>
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

 <h2>Ejemplo Práctico</h2>
    <p>Considera el siguiente código en Java:</p>
    <pre>
<code>
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
</code>
    </pre>
<h1>Operadores Relacionales en Java</h1>
    <p>Los operadores relacionales sirven para realizar comparaciones de igualdad, desigualdad y relación de menor o mayor. El resultado de estos operadores es siempre un valor booleano (<code>true</code> o <code>false</code>) según se cumpla o no la relación considerada. Se utilizan con frecuencia en estructuras de decisión (<code>if</code>, <code>else</code>) y bucles (<code>while</code>, <code>for</code>).</p>

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

<h2>Ejemplo de Código en Java</h2>
    <pre>
<code>

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

   
</body>

 </main>
  <footer>
        <p>&copy; 2024 Fundamentos de Java. Todos los derechos reservados.</p>
    </footer>

  </body>
</html>
