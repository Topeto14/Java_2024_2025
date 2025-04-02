package TerceraEvaluacion.Tema7Parte1.ClaseGenerica.TorneosGenerica;

public class Test {
    public static void main(String[] args) {

        EquipoMoba eq1 = new EquipoMoba("EquipoMOBA1", 2, 1);
        EquipoMoba eq2 = new EquipoMoba("EquipoMOBA2", 2, 1);
        EquipoMoba eq3 = new EquipoMoba("EquipoMOBA3", 3, 2);
        EquipoMoba eq4 = new EquipoMoba("EquipoMOBA4", 4, 3);

        EquipoFPS eq5 = new EquipoFPS("EquipoFPS1", 2, 6);
        EquipoFPS eq6 = new EquipoFPS("EquipoFPS2", 5, 10);
        EquipoFPS eq7 = new EquipoFPS("EquipoFPS3", 5, 11);
        EquipoFPS eq8 = new EquipoFPS("EquipoFPS4", 4, 8);

        EquipoFIFA eq9 = new EquipoFIFA("Fifa1", 2, true);
        EquipoFIFA eq10 = new EquipoFIFA("Fifa2", 2, false);

        Torneo<EquipoMoba> t1 = new Torneo<>("Torneo Moba1");
        t1.inscribirEquipo(eq1);
        t1.inscribirEquipo(eq2);
        t1.inscribirEquipo(eq3);

        Torneo<EquipoFPS> t2 = new Torneo<>("Torneo FPS1");
        t2.inscribirEquipo(eq6);
        t2.inscribirEquipo(eq7);
        t2.inscribirEquipo(eq8);

        Torneo<EquipoFIFA> t3 = new Torneo<>("Torneo de Fifa");
        t3.inscribirEquipo(eq9);
        t3.inscribirEquipo(eq10);

        System.out.println(t1.jugarTorneo());
        System.out.println(t2.jugarTorneo());
        System.out.println(t3.jugarTorneo());


    }

}
