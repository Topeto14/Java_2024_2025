package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.time.LocalDate;
import java.util.UUID;

public class Pedido {
    private UUID id;
    private Double total;
    private LocalDate fecha;

    public Pedido(Double total, LocalDate fecha) {
        this.id = UUID.randomUUID();
        this.total = total;
        this.fecha = fecha;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pedido{");
        sb.append("id=").append(id);
        sb.append(", total=").append(total);
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }
}
