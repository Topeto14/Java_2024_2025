package SegundaEvaluacion.ExamenSegundaEvaluacion2024;

public class Pasajero extends Persona {

    private String preferenciaComida;
    private String restriccionesMedicas;
    private TipoAsiento asiento;

    //Constructor con todos los parametros
    public Pasajero(String nombre, String apellidos, String dniPasaporte, String email, String direccion, String ciudad, String pais, Integer telefono, String preferenciaComida, String restriccionesMedicas, TipoAsiento asiento) {
        super(nombre, apellidos, dniPasaporte, email, direccion, ciudad, pais, telefono);
        this.preferenciaComida = preferenciaComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }
    //Constructor copia
    public Pasajero(Pasajero copia) {
        super(copia.nombre, copia.apellidos, copia.dniPasaporte, copia.email, copia.direccion, copia.ciudad, copia.pais, copia.telefono);
        this.preferenciaComida = preferenciaComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = copia.asiento;
    }
    //Getters and Setters

    public String getPreferenciaComida() {
        return preferenciaComida;
    }

    public void setPreferenciaComida(String preferenciaComida) {
        this.preferenciaComida = preferenciaComida;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public void setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public TipoAsiento getAsiento() {
        return asiento;
    }

    public void setAsiento(TipoAsiento asiento) {
        this.asiento = asiento;
    }

    //To String
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("preferenciaComida='").append(preferenciaComida).append('\'');
        sb.append(", restriccionesMedicas='").append(restriccionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dniPasaporte='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
}
