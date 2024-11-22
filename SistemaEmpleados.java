package logica;
import java.util.Scanner;
public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("***Systemas Empleados***");
        var datosEmpleados = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        var nombreEmpleado = datosEmpleados.nextLine();
        System.out.println("Edad del empleado:");
        var edadEmpleado = Integer.parseInt(datosEmpleados.nextLine());

        //salario
        System.out.println("Salario del empleado:");
        var salarioEmpleado = Double.parseDouble(datosEmpleados.nextLine());

        //jefe de programa
        System.out.println("Es jefe de programa?");
        var jefePrograma = Boolean.parseBoolean(datosEmpleados.nextLine());

        //imprimir valores proporcionados

        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre del empleado: "+nombreEmpleado);
        System.out.println("\tEdad: "+ edadEmpleado + "años");
        //System.out.println("\tSalario:"+ salarioEmpleado);
        System.out.println("\tSalario: %.3f".formatted(salarioEmpleado));
        System.out.println("\t Es jefe de departamento?"+ jefePrograma);
    }
    //printf esa f es de formato
}
