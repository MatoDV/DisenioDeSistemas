package StateDinamicoIncompleto;

public class Morty {
    public void hablar() {
        Evaluador eval = new Evaluador();
        eval.evaluar(this).hablar();
    }
}
