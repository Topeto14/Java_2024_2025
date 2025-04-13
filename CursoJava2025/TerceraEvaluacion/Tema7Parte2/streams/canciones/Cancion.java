package TerceraEvaluacion.Tema7Parte2.streams.canciones;

public class Cancion {
    private String titulo;
    private Artista artista;
    private Integer anio;
    private Integer duracionSegs;
    private Double popularidad;
    private Genero genero;

    public Cancion(String titulo, Artista artista, Integer anio, Integer duracionSegs, Double popularidad, Genero genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.anio = anio;
        this.duracionSegs = duracionSegs;
        this.popularidad = popularidad;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDuracionSegs() {
        return duracionSegs;
    }

    public void setDuracionSegs(Integer duracionSegs) {
        this.duracionSegs = duracionSegs;
    }

    public Double getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Double popularidad) {
        this.popularidad = popularidad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cancion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", artista=").append(artista);
        sb.append(", anio=").append(anio);
        sb.append(", duracionSegs=").append(duracionSegs);
        sb.append(", popularidad=").append(popularidad);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
}
