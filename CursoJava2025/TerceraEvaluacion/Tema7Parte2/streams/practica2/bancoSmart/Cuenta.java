package TerceraEvaluacion.Tema7Parte2.streams.practica2.bancoSmart;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {
    //Atributos
    private UUID id;
    private Cliente propietario;
    private Double saldo;
    private List<Transaccion> transacciones;

    //Constructores

    public Cuenta(Cliente propietario) {
        this.propietario = propietario;
        this.saldo = 0.0;  // el saldo se inicia a cero
        this.transacciones = new ArrayList<>(); // la lista vacia
        this.id = UUID.randomUUID();
    }

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    // To Strings

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuenta{");
        sb.append("id=").append(id);
        sb.append(", propietario=").append(propietario + " - " + getPropietario().getDni());
        sb.append(", saldo=").append(saldo + " € ");
        sb.append('}');
        return sb.toString();
    }

    // Metodos

    public void addTransaccion(Transaccion t) {
        transacciones.add(t);
        if (t.getTipo()== TipoTransaccion.INGRESO) {   // Si se ingresa dinero se le suma al importe
            saldo += t.getImporte();
        }else {                                        // De lo contrario se le resta al importe
            saldo -= t.getImporte();
        }

    }
}
