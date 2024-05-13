package Decorator;

public abstract class NotificacionDecorator implements Notificacion{
    protected Notificacion notificacionDecorada;
    public NotificacionDecorator(Notificacion notificacion){
        this.notificacionDecorada = notificacion;
    }
    @Override
    public void enviarMensaje(String mensaje) {
        notificacionDecorada.enviarMensaje(mensaje);
    }
}
