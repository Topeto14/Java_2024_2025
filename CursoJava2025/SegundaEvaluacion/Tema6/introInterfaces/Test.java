package SegundaEvaluacion.Tema6.introInterfaces;

public class Test {
    public static void main(String[] args) {

        NotificacionEmail ne = new NotificacionEmail("SMTP",
                "smt.google.com","8654", "Hola a todos");
        ne.enviarATodos();
        ne.imprimir("---------------");

        NotificacionSMS nss = new NotificacionSMS("SMS a todos");
        nss.enviarATodos();
    }
}
