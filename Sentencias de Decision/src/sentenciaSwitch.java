import java.util.Scanner;

public class sentenciaSwitch {
    public static void main(String[] args) {
        /*
         La sentencia switch en Java es una forma más limpia y organizada de manejar múltiples condiciones
         en base al valor de una variable. Piensa en switch como un conmutador que te permite elegir entre
         diferentes caminos según el valor de esa variable.

         int day = 3;

    switch (day) {
        case 1:
            System.out.println("Es Lunes");
            break;
        case 2:
            System.out.println("Es Martes");
            break;
        case 3:
            System.out.println("Es Miércoles");
            break;
        case 4:
            System.out.println("Es Jueves");
            break;
        case 5:
            System.out.println("Es Viernes");
            break;
        case 6:
            System.out.println("Es Sábado");
            break;
        case 7:
            System.out.println("Es Domingo");
            break;
        default:
            System.out.println("Día inválido");
            break;
    }

         *Variable a evaluar: En este caso, day es la variable que queremos evaluar.

        *Casos (cases): Cada caso representa un posible valor de la variable day. Por ejemplo, case 1 corresponde a day == 1.

        *Acciones: Cada caso tiene una acción asociada, que se ejecuta si el valor de la variable coincide con ese caso. Por ejemplo,
        si day es 3, se ejecutará System.out.println("Es Miércoles");.

        *break: Después de ejecutar la acción para un caso, usamos break para salir del switch. Si olvidamos el break, el programa
        continuará ejecutando los siguientes casos.

        *default: Este es el camino por defecto que se sigue si ningún caso coincide con el valor de la variable. Es como una red de seguridad.
             */

        var consola = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana:"+ " ");
        int dias = Integer.parseInt(consola.nextLine());
        switch (dias){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es miercoles");
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
             default:
                 System.out.println("Dia invalido");
                 break;


        }

        }
}
