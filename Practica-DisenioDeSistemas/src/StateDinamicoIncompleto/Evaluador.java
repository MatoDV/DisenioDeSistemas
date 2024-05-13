package StateDinamicoIncompleto;

import java.util.ArrayList;

public class Evaluador {
    private ArrayList<Humor> humores;

    public Evaluador() {
        this.humores = new ArrayList<Humor>();
        this.humores.add(new BuenHumor());
        this.humores.add(new MalHumor());
        this.humores.add(new PesimoHumor());
    }

    public Humor evaluar(Morty unMorty) {
        //Iterar la lista de estados (humor)
        for (Humor unHumor : this.humores) {
            if (unHumor.cumple(unMorty)) {
                return unHumor;
            }
        }
        return null;
    }
}
