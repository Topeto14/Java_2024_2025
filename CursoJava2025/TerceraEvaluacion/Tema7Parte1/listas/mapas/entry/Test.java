package TerceraEvaluacion.Tema7Parte1.listas.mapas.entry;

public class Test {
    public static void main(String[] args) {
        AgendaGamer ag = new AgendaGamer();

        ag.addJuego("LoL");
        ag.addJugador("LoL",new ContactGamer("RF3","raulfer@gmail.com"));
        ag.addJugador("LoL",new ContactGamer("skinnyW98","soniagar@gmail.com"));

        ag.addJuego("AoE-II");
        ag.addJugador("AoE-II",new ContactGamer("Pedri88","pedrito@gmail.com"));
        ag.addJugador("AoE-II",new ContactGamer("Luisito","luis99@gmail.com"));

        ag.addJuego("Fifa");
        ag.addJugador("Fifa",new ContactGamer("Pedri88","pedrito@gmail.com"));
        ag.addJugador("Fifa",new ContactGamer("ManoloCabezabolo","manueldiaz@gmail.com"));


        //ag.listarJugadores("LoL");
        //ag.listarJugadores("Fifa");

        ag.listarTodosV1();
        ag.listarTodosV2();

    }
}
