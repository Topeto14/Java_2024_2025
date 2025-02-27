package SegundaEvaluacion.Tema6.poliformismoInterfaces;

public class Video implements Validator{
    private String url;
    private Integer duracion;

    public Video(String url, Integer duracion) {
        this.url = url;
        this.duracion = duracion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Video{");
        sb.append("url='").append(url).append('\'');
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean validate() {
        if (this.duracion > 300) { //Si dura más de 5 mins no es válido
            return false;
        } else return true;
    }
}
