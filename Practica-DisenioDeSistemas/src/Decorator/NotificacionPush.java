package Decorator;

public class NotificacionPush extends NotificacionDecorator{
    public NotificacionPush(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje("Notificacion en rojo: " + mensaje);
    }
}
