package logica.Tema_Avanzados.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        System.out.println("Ejemplo de lectura de un archivo de texto");

        //Leer el archivo
        var nombreArchivo = "Mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del archivo: ");
            //Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leer el archivo línea por línea
            var linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
            //Cerrar el archivo
            //llamar el metodo close() del BufferedReader
            entrada.close();
        }catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
