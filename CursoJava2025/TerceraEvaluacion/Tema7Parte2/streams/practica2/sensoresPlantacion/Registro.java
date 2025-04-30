package TerceraEvaluacion.Tema7Parte2.streams.practica2.sensoresPlantacion;

import java.time.LocalDateTime;
import java.util.Objects;

public class Registro {

    //Atributos

    LocalDateTime fechaHora;
    Double temperatura;
    Double Humedad;

    // Constructor

    public Registro(LocalDateTime fechaHora, Double temperatura, Double humedad) {
        this.fechaHora = fechaHora;
        this.temperatura = temperatura;
        this.Humedad = humedad;
    }

    // Getters ands Setters

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getHumedad() {
        return Humedad;
    }

    public void setHumedad(Double humedad) {
        Humedad = humedad;
    }

    // To Strings

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Registro{");
        sb.append("fechaHora=").append(fechaHora);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", Humedad=").append(Humedad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Objects.equals(fechaHora, registro.fechaHora);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fechaHora);
    }
}
