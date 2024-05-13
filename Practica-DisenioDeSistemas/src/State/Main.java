package State;

public class Main {
    public static void main(String[] args) {
        Morty morty = new Morty();

        // Realizar una acción en el estado actual
        morty.ejecutarCambio();

        // Cambiar el estado y realizar otra acción
        morty.cambiarHumor(new MalHumor());
        morty.ejecutarCambio();
    }
}
