package logica.Tema_Avanzados.Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "Mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                // Se crea el archivo y se cierra inmediatamente
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
