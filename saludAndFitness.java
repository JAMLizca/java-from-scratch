package logica;

import java.util.Scanner;

public class saludAndFitness {
    public static void main(String[] args) {

        //constantes

        final var METAS_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var consola = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        var nombre = consola.nextLine();

        System.out.println("Cuantos pasas has caminado?");
        var pasos = Integer.parseInt(consola.nextLine());

        var metaAlcanzda = (pasos>=METAS_PASOS_DIARIOS)?true:false;

        //calcular calorias quemadas
        var caloriasQuemadas = pasos*CALORIAS_POR_PASO;

        System.out.printf("""
                Hola %s
                Has caminado %d pasos y has conseguido %s calorias quemadas.
                
                """,nombre,pasos,metaAlcanzada? "la meta": caloriasQuemadas);


    }
}
