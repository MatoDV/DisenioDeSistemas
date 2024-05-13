package TemplateMethod;

public class CuentaCorriente extends CuentaBancaria {
    private final double descubierto;
    public CuentaCorriente(int id,double descubierto){
        super(id);
        this.descubierto = descubierto;
    }

    @Override
    protected boolean validarOperacion(double monto) {
        return(getSaldo()-monto) >= -descubierto;
    }

    @Override
    protected void ejecutarOperacion(double monto) {
        extraer(monto);
    }
}
