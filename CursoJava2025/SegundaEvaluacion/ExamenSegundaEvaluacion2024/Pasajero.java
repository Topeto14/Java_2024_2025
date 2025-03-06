package SegundaEvaluacion.ExamenSegundaEvaluacion2024;

public class Pasajero extends Persona {

    private String preferenciaComida;
    private String restriccionesMedicas;
    private TipoAsiento asiento;

    //Constructor con todos los parametros

    public Pasajero(Long id, String nombre, String apellidos, String email, String dniPasaporte, String direccion, String ciudad, Integer telefono, String pais, String preferenciaComida, String restriccionesMedicas, TipoAsiento asiento) {
        super(id, nombre, apellidos, email, dniPasaporte, direccion, ciudad, telefono, pais);
        this.preferenciaComida = preferenciaComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    //Constructor copia
    public Pasajero(Pasajero copia) {
        Id = copia.Id;
        this.nombre =copia.nombre;
        this.apellidos = copia.apellidos;
        this.email = copia.email;
        this.dniPasaporte = copia.dniPasaporte;
        this.direccion = copia.direccion;
        this.ciudad = copia.ciudad;
        this.telefono = copia.telefono;
        this.pais = copia.pais;
        this.preferenciaComida = copia.preferenciaComida;
        this.restriccionesMedicas = copia.restriccionesMedicas;
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
        sb.append(", Id=").append(Id);
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
