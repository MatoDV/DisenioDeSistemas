package Adapter;

public class PrinterAdapter implements Impresora {
    private Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void imprimirDocumento(String documento) {
        printer.imprimir(documento);
    }
}
