package StateDinamicoIncompleto;

import State.MalHumor;
import State.Morty;

public class Main {
    public static void main(String[] args) {
        State.Morty morty = new Morty();

        // Realizar una acción en el estado actual
        morty.ejecutarCambio();

        // Cambiar el estado y realizar otra acción
        morty.cambiarHumor(new MalHumor());
        morty.ejecutarCambio();
    }
}
