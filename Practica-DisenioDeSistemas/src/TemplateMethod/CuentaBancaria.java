package TemplateMethod;

//siempre una clase abstracta
abstract public class CuentaBancaria {
    private final int ID;
    private double Saldo;

    public CuentaBancaria(int id){
        this.ID = id;
        this.Saldo = 0;
    }

    //metodo de plantilla es donde interaccionan los metodos hooks
    public void realizarOperacion(double monto){
        if(validarOperacion(monto)){
            ejecutarOperacion(monto);
            System.out.println("Operacion realizada correctamente");
        } else {
            System.out.println("Saldo insuficiente para hacer la extraccion");
        }
    }

    //hooks metodos que usan las subclases y las pueden sobrescribir
    protected abstract boolean validarOperacion(double monto);
    protected abstract void ejecutarOperacion(double monto);

    public void depositar(double cantidad) {
        Saldo += cantidad;
        System.out.println("Depósito de " + cantidad + " realizado. Saldo actual: " + Saldo);
    }

    public void extraer(double cantidad) {
        Saldo -= cantidad;
        System.out.println("Extraccion de " + cantidad + " realizado. Saldo actual: " + Saldo);
    }

    public int getID() {
        return ID;
    }

    public double getSaldo() {
        return Saldo;
    }
}
