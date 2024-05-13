package State;

public class Morty {
    private Humor humor;
    public Morty(){
        this.humor = new BuenHumor();
    }
    public void cambiarHumor(Humor nuevoHumor){
        this.humor=nuevoHumor;
    }
    public void ejecutarCambio(){
        humor.hablar();
    }
}
