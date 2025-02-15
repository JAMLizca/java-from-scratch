public class PrecedenciaOperadores {
    public static void main(String[] args) {
        //1. parentesis y corchetes
        //2. operadores unarios -,++,--
        //3. operadores aritmeticos *,/,%
        //4. operadores aritmeticos +,-
        //5. relaciones <,<=,>,>=
        //6. equivalencia == y !=
        //7. logicos &&, ||
        //8. asignacion =, +=, -=, *=,etc

        //la precedencia = a la importancia deoperadores

        //1. primero se hace la / (12/3)
        //2. segundo la * (2*34)
        //3. la suma (resultado de la / y *)
        //4  la resta (resultado de suma -12)
        var a = 12/3+2*34-12;
        System.out.println("a = " + a);

        //Aclaracion: una operacion dentro de un parentesis significa que es prioridad.
        /*
        var b = (12/3)+2*34-12;
        System out println ("El total es:"+" "+ b);

        La primer operacion a realizar es la que esta dentro de parentesis ()
         */



    }

}
