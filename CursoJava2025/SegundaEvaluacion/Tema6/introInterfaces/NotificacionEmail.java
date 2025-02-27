package SegundaEvaluacion.Tema6.introInterfaces;

public class NotificacionEmail implements Notificador, Imprimible {
    private String tipoEmail;
    private String servidorEmail;
    private String puerto;
    private String mensaje;

    public NotificacionEmail(String tipoEmail, String servidorEmail, String puerto, String mensaje) {
        this.tipoEmail = tipoEmail;
        this.servidorEmail = servidorEmail;
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void enviarNotificacion(String destinatario) {
        System.out.println(this.mensaje + destinatario);
    }

    @Override
    public void enviarATodos() {
        System.out.println("Enviando email con " + this.mensaje + " a todo el mundo");
    }

    @Override
    public void imprimir(String mensaje) {
        System.out.println("Mandando a impresora " + mensaje);
    }
}
