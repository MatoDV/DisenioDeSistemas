package Decorator;

public class SMS extends NotificacionDecorator{
    public SMS(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje("Enviado desde un Celular: " + mensaje);
    }
}
