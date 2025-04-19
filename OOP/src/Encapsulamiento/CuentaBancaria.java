package logica.OOP.src.Encapsulamiento;

        /*
        Ejercicio:
            Crear una clase CuentaBancaria que tenga los siguientes atributos privados:
                Número de cuenta
                Titular
                Saldo

            El constructor debe inicializar todos estos valores.
            Además, implementar:
                Getters y Setters
                Un método para depositar dinero
                Un método para retirar dinero validando que haya suficiente saldo
           Mostrar en consola un ejemplo de uso.
         */
public class CuentaBancaria {

        //  Atributos privados
        private String numeroCuenta;
        private String titular;
        private double saldo;

        // 🏗 Constructor que inicializa los atributos
        public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        //  Getter para número de cuenta
        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        //  Setter para número de cuenta
        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        //  Getter para titular
        public String getTitular() {
            return titular;
        }

        //  Setter para titular
        public void setTitular(String titular) {
            this.titular = titular;
        }

        // Getter para saldo (no hay setter porque solo se modifica con depositar/retirar)
        public double getSaldo() {
            return saldo;
        }

        //  Método para depositar dinero
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Cantidad inválida. Intenta nuevamente.");
            }
        }

        // Método para retirar dinero
        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
            } else {
                System.out.println("Fondos insuficientes o cantidad inválida.");
            }
        }

        //  Método main para probar la clase
        public static void main(String[] args) {
            System.out.println("📄 Creando cuenta bancaria...");

            // Crear objeto de la clase CuentaBancaria usando el constructor
            CuentaBancaria cuenta1 = new CuentaBancaria("12345678", "José Montenegro", 500.0);

            // Mostrar datos de la cuenta
            System.out.println("Titular: " + cuenta1.getTitular());
            System.out.println("N° Cuenta: " + cuenta1.getNumeroCuenta());
            System.out.println("Saldo: $" + cuenta1.getSaldo());

            // Depositar dinero
            cuenta1.depositar(200.0);

            // Intentar retirar más de lo disponible
            cuenta1.retirar(800.0);

            // Retirar una cantidad válida
            cuenta1.retirar(100.0);
        }
    }


