package TerceraEvaluacion.Tema7Parte2.streams.practica2.bancoSmart;

import java.time.LocalDate;
import java.util.UUID;

public class Transaccion {
    //Atributos
    private static long contador = 0; // Se pone el valor 0 para luego en el constructor
                                      // hacerlo que añada cada vez que entre uno nuevo.
    private Long id;
    private Cuenta cuenta;
    private Double importe;
    private LocalDate fecha;
    private TipoTransaccion tipo;
    private String descripcion;

    //Constructor


    public Transaccion(Cuenta cuenta, Double importe, LocalDate fecha, TipoTransaccion tipo, String descripcion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.id = contador++; // Aqui se pone el contador al id.
    }

    // Getters and Setters


    public static long getContador() {
        return contador;
    }

    public static void setContador(long contador) {
        Transaccion.contador = contador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Transaccion{");
        sb.append("id=").append(id);
        sb.append(", cuenta=").append(cuenta);
        sb.append(", tipo=").append(tipo);
        sb.append(", fecha=").append(fecha);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", importe=").append(importe + "€");
        sb.append('}');
        return sb.toString();
    }
}
