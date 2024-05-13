package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(123);
        cajaDeAhorro.depositar(1000);
        cajaDeAhorro.realizarOperacion(500);
        cajaDeAhorro.realizarOperacion(1000);
        System.out.println("Saldo final de la caja de ahorro: " + cajaDeAhorro.getSaldo());

        CuentaCorriente cuentaCorriente = new CuentaCorriente(456, 1000);
        cuentaCorriente.depositar(2000);
        cuentaCorriente.realizarOperacion(2500);
        System.out.println("Saldo final de la cuenta corriente: " + cuentaCorriente.getSaldo());
    }
}
