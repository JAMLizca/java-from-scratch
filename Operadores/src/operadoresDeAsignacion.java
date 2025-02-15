public class operadoresDeAsignacion {
    public static void main(String[] args) {
        System.out.println("Operadores de asignacion");
        var miNumero= 18;
        int numero2= 10;
        miNumero= 15;

        //asignacion compuesta

        //+=
        miNumero += 5;
        System.out.println("miNumero = " + miNumero);

        //para losdemas operadores es igual
        // -= ; *= ; /= ; %=

        miNumero *= 2; //miNumero = miNumero *2 ->30
        System.out.println("miNumero"+ miNumero);

        //Asignacion de variables multiples

        int a=10 , b=12, c=234;
        System.out.printf("a= %d, b=%d, c=%d",a,b,c);
    }
}
