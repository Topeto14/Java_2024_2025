package SegundaEvaluacion.Tema6.ejemploReferenciaCruzada;


import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
            TiendaDiscos td = new TiendaDiscos();

            GrupoMusica acdc = new GrupoMusica("ACDC", Genero.METAL,
                    LocalDate.of(1975,5,5), 4);

            Disco d1 = new Disco("RazorEdge", LocalDate.of(1977,1,1));
            Disco d2 = new Disco("Thunderstruck", LocalDate.of(1982,3,1));

            acdc.addDisco(d1);
            acdc.addDisco(d2);

            td.addDisco(d1);
            td.addDisco(d2);
            td.addGrupoMusica(acdc);

            System.out.println(td);

            System.out.println(td.buscarDisco(d1));

        }
}
