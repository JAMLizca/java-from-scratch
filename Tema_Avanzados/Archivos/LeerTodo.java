package logica.Tema_Avanzados.Archivos;

import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "Mi_Archivo.txt";
        try {
            //leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            //imprimir el contenido del archivo
            for (String linea : lineas) {
                System.out.println(linea);
            }
        }catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
