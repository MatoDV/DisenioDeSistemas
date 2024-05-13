package Decorator;

public class CorreoElectronico extends NotificacionDecorator{
    public CorreoElectronico(Notificacion notificacion) {
        super(notificacion);
    }
    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje("Enviado desde un correo electrónico: " + mensaje);
    }
}
