package SegundaEvaluacion.Tema4.Incidencias;

public class TestIncidencia {
    public static void main(String[] args) {
        Incidencia incidencia1 = new Incidencia(1,Estado.abierto,"Atasco en las tuberias","llamar fontanero");
        Incidencia incidencia2 = new Incidencia(2,Estado.en_proceso,"Ascensor sucio","limpiarlo");
        Incidencia incidencia3 = new Incidencia(3,Estado.abierto,"Cambiar foco del pasillo","comprar foco y ponerlo");
        Incidencia incidencia4 = new Incidencia(4,Estado.abierto,"Buzon roto","cambiar buzon");
        Incidencia incidencia5 = new Incidencia(5,Estado.abierto,"Timbre silenciado","llamar tecnico.csv");

        System.out.println("Incidencias");
        System.out.println(incidencia1);
        System.out.println(incidencia2);
        System.out.println(incidencia3);
        System.out.println(incidencia4);
        System.out.println(incidencia5);
        System.out.println("Incidencias pendientes:" + Incidencia.getPendientes());;

        Incidencia.resuelve(incidencia1);
        incidencia1.setEstado(Estado.resuelto);
        incidencia1.setSolucion(" solucionado por el fontanero");
        Incidencia.resuelve(incidencia5);
        incidencia5.setSolucion("ya esta solucionado");
        incidencia5.setEstado(Estado.resuelto);
        Incidencia.resuelve(incidencia2);
        incidencia2.setEstado(Estado.resuelto);
        incidencia2.setSolucion("Ya esta limpio");

        System.out.println("Incidencias despues de resolver algunas");
        System.out.println(incidencia1);
        System.out.println(incidencia2);
        System.out.println(incidencia3);
        System.out.println(incidencia4);
        System.out.println(incidencia5);

        System.out.println("Incidencias pendientes:" + Incidencia.getPendientes());;

    }
}
