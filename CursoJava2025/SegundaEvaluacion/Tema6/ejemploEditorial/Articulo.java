package SegundaEvaluacion.Tema6.ejemploEditorial;

public class Articulo {
    private String titulo;
    private Autor autor;
    private String texto;

    public Articulo(String titulo, Autor autor, String texto) {
        this.titulo = titulo;
        this.autor = autor;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Articulo{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", autor=").append(autor);
        sb.append(", texto='").append(texto).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
