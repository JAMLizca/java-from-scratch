package logica.OOP.src.Constructores;

public class Aritmetica {
    /**
     * Clase Aritmetica
     * Ejemplo de uso de constructores en Java para inicializar atributos y realizar operaciones básicas.
     */
        // Atributos de la clase
        int operandoUno;
        int operandoDos;

        /**
         * Constructor sin parámetros (por defecto).
         * Inicializa un objeto sin valores iniciales y muestra un mensaje.
         */
        public Aritmetica() {
            System.out.println("Ejecutando constructor vacío");
        }

        /**
         * Constructor con parámetros.
         * Permite inicializar los atributos operandoUno y operandoDos al momento de crear el objeto.
         *
         * @param operandoUno Primer número entero para operar.
         * @param operandoDos Segundo número entero para operar.
         */
        public Aritmetica(int operandoUno, int operandoDos) {
            this.operandoUno = operandoUno; // "this" se refiere al atributo de la clase
            this.operandoDos = operandoDos;
            System.out.println("Constructor con parámetros ejecutado");
        }

        /**
         * Método para sumar los operandos y mostrar el resultado.
         */
        void sumar() {
            int resultado = operandoUno + operandoDos;
            System.out.println("El resultado de la suma es: " + resultado);
        }

        /**
         * Método para restar los operandos y mostrar el resultado.
         */
        void restar() {
            int resultadoResta = operandoUno - operandoDos;
            System.out.println("El resultado de la resta es: " + resultadoResta);
        }

        /**
         * Método principal para probar la clase Aritmetica.
         * Se crean objetos con y sin constructor parametrizado y se llaman a los métodos.
         */
        public static void main(String[] args) {
            System.out.println("*** Ejemplo Aritmetica con Constructores ***\n");

            // Crear primer objeto usando constructor vacío
            System.out.println("Objeto Uno (constructor vacío)");
            Aritmetica aritmeticaUno = new Aritmetica();
            aritmeticaUno.operandoUno = 12;
            aritmeticaUno.operandoDos = 5;
            aritmeticaUno.sumar();
            aritmeticaUno.restar();

            System.out.println();

            // Crear segundo objeto usando constructor con parámetros
            System.out.println("Objeto Dos (constructor con parámetros)");
            Aritmetica aritmeticaDos = new Aritmetica(12, 16);
            aritmeticaDos.sumar();
            aritmeticaDos.restar();
        }
    }


