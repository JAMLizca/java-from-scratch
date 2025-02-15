public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("***Operadores Aritmeticos***");
        int a= 56, b= 2, resultado=0;
        //suma
        resultado= a+b;
        System.out.println("resultado suma" +" "+ resultado);

        //resta
        resultado= a-b;
        System.out.println("Resultado resta"+" "+resultado);

        //multiplicacion
        resultado= a*b;
        System.out.println("Resultado multiplicacio"+ " "+ resultado);

        //division
        resultado= a/b;
        System.out.println("Resultado division"+ " "+resultado);

        //modulo (residuo de la division) %
        resultado= a%b;
        System.out.println("Modulo = " + resultado);

        //operador unario -
        resultado= -a;
        System.out.println("resultado -a = " + resultado);

        //operadores unarios de incremento y decremento

        //pre-incremento
        a = 3;
        resultado = ++a; //primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);

        //Post-incremento
        a = 3;
        resultado = a++;//primero se usa el valor y despues se incrementa
        System.out.println("Resultado:"+ resultado);
        System.out.println("a++ = " + a);

        //Pre-decremto}
        b= -2;
        resultado= --b;//primero se incrementa y despues se usa el valor
        System.out.println(" resulotado --b= " + resultado);
        System.out.println("--b = " + b);

        //Post-decremento
        b=-2;
        resultado= b--;//primero se usa el valor y despues se incrementa
        System.out.println("resultado b--= " + resultado);
        System.out.println("b-- = " + b);






    }
}
