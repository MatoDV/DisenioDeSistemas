package TemplateMethod;

public class CajaDeAhorro extends CuentaBancaria{
    public CajaDeAhorro(int id){
        super(id);
    }

    @Override
    protected boolean validarOperacion(double monto) {
        return(getSaldo()-monto) >= 0;
    }

    @Override
    protected void ejecutarOperacion(double monto) {
        extraer(monto);
    }

}
