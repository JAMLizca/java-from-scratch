<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    Formas de Ejecutar Código Java
</head>
<body>
    <h1>Formas de Ejecutar Código Java</h1>
    <p>
        Java es un lenguaje de programación versátil y ampliamente utilizado en el desarrollo de aplicaciones móviles, de escritorio y sistemas empresariales. En esta guía, te mostramos las formas más comunes de ejecutar código Java, cómo instalar el entorno de desarrollo adecuado y configurarlo en tu sistema.<br><br>
    </p>

<h2>1. Instalación de Java</h2>
<p>
    <img src="https://www.codtronic.com/wp-content/uploads/2022/10/jdk.png" width="450"><br>
    Para comenzar a programar en Java, primero debes instalar el Java Development Kit (JDK). Aquí están los pasos para hacerlo:<br><br>
    <strong>Paso 1:</strong> Dirígete a la página oficial de Oracle para descargar la última versión de Java.<br>
    <a href="https://www.oracle.com/java/technologies/javase-downloads.html" target="_blank">Descargar JDK desde Oracle</a><br><br>
    <strong>Paso 2:</strong> Selecciona la versión adecuada para tu sistema operativo (Windows, macOS, Linux) y descarga el instalador.<br><br>
    <strong>Paso 3:</strong> Ejecuta el instalador y sigue las instrucciones para completar la instalación.<br><br>
    <strong>Paso 4:</strong> Configura la variable de entorno <code>JAVA_HOME</code> para que puedas ejecutar comandos Java desde la línea de comandos.<br><br>
    <strong>Nota:</strong> La versión más reciente es la <strong>JDK 21</strong>, y puedes verificar la última versión en el siguiente enlace: 
    <a href="https://www.oracle.com/java/technologies/javase-downloads.html" target="_blank">Última versión de Java JDK</a>
</p>

<h2>2. Configuración de las Variables de Entorno</h2>
<p>
    Configurar las variables de entorno permite que puedas ejecutar los comandos de Java en cualquier directorio de tu sistema.
</p>
<table>
    <tr>
        <th>Sistema Operativo</th>
        <th>Pasos</th>
    </tr>
    <tr>
        <td><strong>Windows</strong></td>
        <td>
            <ol>
                <li>Accede al Panel de Control y busca "Variables de Entorno".</li>
                <li>Añade una nueva variable llamada <code>JAVA_HOME</code> con la ruta de instalación de Java (por ejemplo, <code>C:\Program Files\Java\jdk-XX.X.X</code>).</li>
                <li>Modifica la variable <code>PATH</code> para incluir <code>%JAVA_HOME%\bin</code>.</li>
            </ol>
        </td>
    </tr>
    <tr>
        <td><strong>macOS/Linux</strong></td>
        <td>
            <ol>
                <li>Edita el archivo de configuración <code>.bashrc</code> o <code>.zshrc</code> y agrega las siguientes líneas:</li>
                <ul>
                    <li><code>export JAVA_HOME=/ruta/a/jdk</code></li>
                    <li><code>export PATH=$JAVA_HOME/bin:$PATH</code></li>
                </ul>
                <li>Ejecuta <code>source ~/.bashrc</code> o <code>source ~/.zshrc</code> para que los cambios tomen efecto.</li>
            </ol>
        </td>
    </tr>
</table>



<h2>Formas de Ejecutar Código Java</h2>
<img src="https://desarrolloweb.com/storage/collection_images/actual/0wLchbKtPUumIKGjaGAVPYQT2ADz20xQMkjyTUBY.jpg" alt="Logo de java" width="500">
<p>
    Una vez que Java esté instalado y configurado, existen diversas formas de ejecutar tus programas. Aquí te mostramos las más comunes:
</p>
<table>
    <tr>
        <th>Método</th>
        <th>Descripción</th>
    </tr>
    <tr>
        <td><strong>Usar un IDE</strong></td>
        <td>Herramientas como IntelliJ IDEA, Eclipse, NetBeans y VS Code ofrecen un entorno completo para escribir, compilar y ejecutar programas Java.</td>
    </tr>
    <tr>
        <td><strong>Desde la línea de comandos</strong></td>
        <td>Compila y ejecuta tu código Java utilizando los comandos de la terminal:<br>
            <code>javac MiPrograma.java</code><br>
            <code>java MiPrograma</code>
        </td>
    </tr>
    <tr>
        <td><strong>Con herramientas online</strong></td>
        <td>Puedes ejecutar código Java en plataformas online como JDoodle, Replit, o Compiler Explorer.</td>
    </tr>
    <tr>
        <td><strong>Usando un editor de texto y terminal</strong></td>
        <td>Escribe el código en un editor como VS Code o Sublime Text, compílalo y ejecútalo desde la terminal.</td>
    </tr>
</table>


<h2>4. Descarga y Uso de IDEs</h2>
    <p>
        Aquí te presentamos algunos de los IDEs más populares para programar en Java:<br><br>
        - NetBeans: Un IDE gratuito y de código abierto que incluye todo lo necesario para desarrollar, depurar y ejecutar aplicaciones Java. Descárgalo desde: 
        <a href="https://netbeans.apache.org/download/index.html" target="_blank">Descargar NetBeans</a><br>
        
-VS Code (Visual Studio Code): Un editor ligero y altamente personalizable, que se puede configurar para trabajar con Java mediante extensiones. Descárgalo desde:
        <a href="https://code.visualstudio.com/" target="_blank">Descargar VS Code</a><br>
        Luego, instala la extensión "Java Extension Pack" desde el Marketplace dentro de VS Code para comenzar a programar en Java.<br><br>
    </p>
    <h2>5. Te recomiendo que instales IntelliJ IDEA</h2>
<img src="https://www.bestnetsoft.com/wp-content/uploads/2024/04/IntelliJ_IDEA-1024x260.png" alt="Logo de IntelliJ IDEA" width="500"><br>
    <p>IntelliJ IDEA es un IDE potente y fácil de usar, recomendado para mejorar la productividad al programar en Java. Es popular entre los desarrolladores de Java por sus características avanzadas:
        <br><br>
        -Refactorización de código: Permite reestructurar el código sin perder funcionalidad.<br>
        - Integración con herramientas de control de versiones: Como Git y SVN, facilitando el trabajo en equipo y el manejo de versiones.<br>
        -Integración con control de versiones: Compatible con herramientas como Git y SVN, facilitando el trabajo en equipo..<br> 
        - Asistente de depuración: Ayuda a detectar y corregir errores eficientemente. Puedes descargar la versión gratuita desde su página oficial:
        <a href="https://www.jetbrains.com/idea/download/" target="_blank">Descargar IntelliJ IDEA</a><br><br>
    </p>

 <h2>5. Tutorial Guía: Aprende a Ejecutar Código Java</h2>
    <p>El video está diseñado para principiantes, explicando de forma clara y detallada cómo configurar tu entorno y ejecutar tu código. Haz clic en el siguiente enlace para verlo:
        <a href="https://www.youtube.com/watch?v=4WKo13f2Qpc" target="_blank">Tutorial: Cómo ejecutar código Java</a><br><br>
        <hr width="36%" >
<p align = "center">
	<img src = "https://github.com/7oSkaaa/7oSkaaa/blob/output/github-contribution-grid-snake.svg?" alt = "Snake Game"/>
</p>
    </p>
<h1><p><strong><em style="font-size: 250px;">🚀✨ ¡Daremos inicio con <span style="color: #007bff;">Java desde cero</span>! 🖥️💡 #AprendamosJuntos 🎓</em></strong></p></h1>
 <h1>Fundamentos de Java</h1>
        <p>Guía básica para comenzar con el lenguaje de programación Java.</p>
    </header>

<main>
        <section>
            <h2>¿Qué es Java?</h2>
           <img src="https://docpath.com/wp-content/uploads/benefits-of-using-java-programming-language.jpg" alt="Logo de Java" width="500">
            <p>Java es un lenguaje de programación orientado a objetos desarrollado por Sun Microsystems (ahora parte de Oracle). Es conocido por su portabilidad, ya que permite ejecutar el mismo código en diferentes plataformas gracias a la máquina virtual de Java (JVM).</p>
        </section>

   <section>
            <h2>Hola Mundo en Java</h2>
            <p>El programa más básico para empezar a programar en Java es "Hola Mundo". A continuación, se muestra cómo se escribe:</p>
            <pre>
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
            </pre>
        </section>

   <section>
            <h2>Características principales de Java</h2>
            <ul>
                <li><strong>Orientado a objetos:</strong> Todo en Java se organiza en clases y objetos.</li>
                <li><strong>Portabilidad:</strong> Gracias a la JVM, el código se puede ejecutar en cualquier plataforma.</li>
                <li><strong>Seguro:</strong> Java tiene características integradas como el manejo de memoria automática para evitar errores comunes.</li>
                <li><strong>Multihilo:</strong> Permite ejecutar múltiples tareas al mismo tiempo dentro de un programa.</li>
            </ul>
        </section>

   <section>
            <h2>Tipos de datos en Java</h2>
<p>Java cuenta con varios tipos de datos básicos:</p>
	   <table border="1">
        <thead>
            <tr>
                <th>TIPO</th>
                <th>NOMBRE</th>
                <th>OCUPA</th>
                <th>RANGO APROXIMADO</th>
            </tr>
        </thead>
        <tbody>
          <!-- Tipos primitivos -->
            <tr>
                <td rowspan="8">TIPOS PRIMITIVOS</td>
                <td>byte</td>
                <td>1 byte</td>
                <td>-128 a 127</td>
            </tr>
            <tr>
                <td>short</td>
                <td>2 bytes</td>
                <td>-32768 a 32767</td>
            </tr>
            <tr>
                <td>int</td>
                <td>4 bytes</td>
                <td>2¹⁰</td>
            </tr>
            <tr>
                <td>long</td>
                <td>8 bytes</td>
                <td>Muy grande</td>
            </tr>
            <tr>
                <td>float</td>
                <td>4 bytes</td>
                <td>Muy grande</td>
            </tr>
            <tr>
                <td>double</td>
                <td>8 bytes</td>
                <td>Muy grande</td>
            </tr>
            <tr>
                <td>char</td>
                <td>2 bytes</td>
                <td>Carácter simple</td>
            </tr>
            <tr>
                <td>boolean</td>
                <td>1 byte</td>
                <td>Valor true o false</td>
            </tr>
            <!-- Tipos objeto -->
            <tr>
                <td rowspan="4">TIPOS OBJETO</td>
                <td>String</td>
                <td colspan="2">Cadenas de texto</td>
            </tr>
            <tr>
                <td>Arrays</td>
                <td colspan="2">Series de elementos tipo vector o matriz</td>
            </tr>
            <tr>
                <td>Definidos por el usuario</td>
                <td colspan="2">Ejemplo: Taxi, Autobús</td>
            </tr>
            <tr>
                <td>Tipos envoltorio</td>
                <td colspan="2">Byte, Short, Integer, etc.</td>
            </tr>
        </tbody>
    </table>
        </section>

  <section>
            <h2>Comentarios en Java</h2>
            <p>Los comentarios son útiles para documentar el código y no son ejecutados por el programa. Hay dos tipos:</p>
            <pre>
// Comentario de una línea
/* comentarios para varias lineas de codigo */
            </pre>
        </section>
	<h1>Salida de Datos en Java</h1>
 <img src="https://files.codingninjas.in/article_images/custom-upload-1687513940-1c85bc57.webp" alt="Logo de sout" width="500"> 
    <p>En Java, para mostrar mensajes en pantalla, usamos la clase <strong>System</strong>, que tiene el atributo <strong>out</strong> (salida). Este atributo nos permite acceder a dos métodos principales:</p>
    <ul>
        <li><strong>print()</strong>: Imprime texto sin salto de línea.</li>
        <li><strong>println()</strong>: Imprime texto con salto de línea al final.</li>
    </ul>
    <p>No es necesario importar nada, ya que la clase <strong>System</strong> forma parte de la biblioteca estándar de Java.</p>
    <h1>Métodos <code>System.out.print()</code> y <code>System.out.println()</code></h1>
    
<h2>1. <code>System.out.print()</code></h2>
    <p>Este método imprime el texto en la pantalla y el cursor queda en la misma línea. Es decir, si después de este método escribes otro mensaje, se mostrará seguido del anterior, sin saltar a una nueva línea.</p>
    
 <h3>Ejemplo:</h3>
    <pre>
<code>
System.out.print("Hola");
System.out.print(" mundo");
</code>
    </pre>
    
<h3>Salida:</h3>
    <pre>
<code>
Hola mundo
</code>
    </pre>
    
<h2>2. <code>System.out.println()</code></h2>
    <p>Este método también imprime el texto, pero agrega un salto de línea automáticamente al final. Es decir, cualquier mensaje que imprimas después se mostrará en una nueva línea.</p>
    
 <h3>Ejemplo:</h3>
    <pre>
<code>
System.out.println("Hola");
System.out.println("mundo");
</code>
    </pre>
    
  <h3>Salida:</h3>
    <pre>
<code>
Hola
mundo
</code>
    </pre>
     <h1>Entrada de Datos en Java</h1>
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
  </div>
    
 </main>
  <footer>
        <p>&copy; 2024 Fundamentos de Java. Todos los derechos reservados.</p>
    </footer>

  </body>
</html>
