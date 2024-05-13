package Observer;

// Observador (usuario) que recibe notificaciones de temperatura
public class Usuario implements Observador{
    private String nombre;
    private int temperaturaMinima;
    private int temperaturaMaxima;
    public Usuario(String nombres,int temperaturasMinimas,int temperaturasMaximas){
        this.nombre=nombres;
        this.temperaturaMinima=temperaturasMinimas;
        this.temperaturaMaxima=temperaturasMaximas;
    }
    @Override
    public void actualizar(int temperatura) {
        if (temperatura < temperaturaMinima) {
            System.out.println(nombre + ": La temperatura es demasiado baja (" + temperatura + "°C).");
        } else if (temperatura > temperaturaMaxima) {
            System.out.println(nombre + ": La temperatura es demasiado alta (" + temperatura + "°C).");
        } else {
            System.out.println(nombre + ": La temperatura es normal (" + temperatura + "°C).");
        }
    }
}
