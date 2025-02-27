package SegundaEvaluacion.Tema6.introInterfaces;

public class NotificacionSMS implements Notificador{
    private String mensaje;

    public NotificacionSMS(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviarNotificacion(String destinatario) {
        System.out.println(this.mensaje + " " + destinatario);
    }

    @Override
    public void enviarATodos() {
        System.out.println("Enviando SMS " + this.mensaje + " a todo el mundo");
    }
}
