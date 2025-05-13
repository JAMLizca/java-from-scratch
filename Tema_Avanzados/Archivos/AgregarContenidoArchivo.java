package logica.Tema_Avanzados.Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "Mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
        //Revisar si existe el archivo
           anexar = archivo.exists();
           var salida = new PrintWriter(new FileWriter(archivo, anexar));
           var nuevoContenido = "Hola, este es un nuevo contenido del archivo\n";
           salida.println(nuevoContenido);
           salida.close();
            System.out.println("El contenido se ha agregado correctamente");
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
