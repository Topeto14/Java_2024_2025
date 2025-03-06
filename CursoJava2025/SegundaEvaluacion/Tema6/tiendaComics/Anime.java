package SegundaEvaluacion.Tema6.tiendaComics;

import java.time.LocalDate;

public class Anime extends Comic {
    private Integer numEpisodio;
    private String serie; //Modelar con series, ...


    public Anime(String titulo, LocalDate fecha, Double precio, Integer numPaginas,
                 Integer numEpisodio, String serie) {
        super(titulo, fecha, precio, numPaginas);
        this.numEpisodio = numEpisodio;
        this.serie  = serie;
    }

    public Integer getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(Integer numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Anime{");
        sb.append(super.toString());
        sb.append(", numEpisodio=").append(numEpisodio);
        sb.append(", serie='").append(serie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
