package Observer;

import java.util.ArrayList;
import java.util.List;

// Sujeto (sensor de temperatura) que mide la temperatura y notifica a los observadores
public class SensorTemperatura {
    public List<Observador> observadores = new ArrayList<>();
    public int temperatura;
    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }
    public void eliminarObservador(Observador observador){
        observadores.remove(observador);
    }
    public void medirTemperatura() {
        // Simulación de medición de temperatura
        temperatura = (int) (Math.random() * 50); // Temperatura aleatoria entre 0 y 50 grados Celsius

        // Notificar a todos los observadores
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
        }
    }
}
