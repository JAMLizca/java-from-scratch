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

## 1. Descarga e instala el JDK  
Para programar en Java, necesitas el **Java Development Kit (JDK)**. Descárgalo desde su sitio oficial:  
[Descargar JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

---

## 2. Configura las variables de entorno  
Después de instalar el JDK, configura las variables de entorno para que tu sistema reconozca los comandos de Java. Consulta esta guía paso a paso para hacerlo:  
[Configuración de variables de entorno](https://www.oracle.com/java/technologies/javase-jdk-installation-guide.html)

---

## 3. Elige un editor o IDE  
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

## 4. Tutorial guía: Aprende a ejecutar código Java  
Consulta este video diseñado para principiantes que explica cómo configurar tu entorno y ejecutar tu código:  
[Tutorial: Cómo ejecutar código Java](https://www.youtube.com/watch?v=4WKo13f2Qpc)

---

