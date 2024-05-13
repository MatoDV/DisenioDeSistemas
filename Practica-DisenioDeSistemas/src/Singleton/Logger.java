package Singleton;

public class Logger {
    // Paso 2: Variable estática privada para almacenar la única instancia de la clase
    private static Logger instancia;
    // Paso 1: Constructor privado para evitar que otras clases instancien esta clase directamente
    private Logger(){
        // Constructor privado para evitar la instanciación directa
    }
    // Paso 3: Método estático para obtener la instancia única de la clase Logger
    public static Logger getInstance(){
        // Comprueba si la instancia ya ha sido creada
        if (instancia == null) {
            // Si no, crea una nueva instancia
            instancia = new Logger();
        }
        // Devuelve la instancia existente
        return instancia;
    }
    public void registrarEvento(String evento) {
        System.out.println("[EVENTO] " + evento);
    }

    public void registrarError(String error) {
        System.err.println("[ERROR] " + error);
    }

    public void registrarInformacion(String informacion) {
        System.out.println("[INFO] " + informacion);
    }

}
