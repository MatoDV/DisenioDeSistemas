package Decorator;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la notificación base
        Notificacion notificacion = new NotificacionBase();

        // Decorar la notificación con correo electrónico y enviar un mensaje
        Notificacion correoElectronico = new CorreoElectronico(notificacion);
        correoElectronico.enviarMensaje("¡Hola desde el correo electrónico!");

        // Decorar la notificación con SMS y enviar un mensaje
        Notificacion sms = new SMS(notificacion);
        sms.enviarMensaje("¡Hola desde el SMS!");

        // Decorar la notificación con notificación push y enviar un mensaje
        Notificacion notificacionPush = new NotificacionPush(notificacion);
        notificacionPush.enviarMensaje("¡Hola desde la notificación push!");
    }
}
