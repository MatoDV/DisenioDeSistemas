package Adapter;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de Printer y PrinterAdapter
        Printer printer = new Printer();
        Impresora adapter = new PrinterAdapter(printer);

        // Usamos el adapter para imprimir desde la computadora
        Computer computer = new Computer();
        computer.enviarImpresion("Mi Documento");
    }
}
