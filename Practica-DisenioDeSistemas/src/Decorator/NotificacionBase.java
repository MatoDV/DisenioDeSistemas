package Decorator;

public class NotificacionBase implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado: "+ mensaje);
    }
}
