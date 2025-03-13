package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

public class Pasajero extends Persona {

    private String preferenciasComida;
    private String restriccionesMedicas;
    private Asiento asiento;

    public Pasajero() {
    }

    public Pasajero(Long id, String nombre, String apellidos, String dniPass, String email,
                    String direccion, String ciudad, String pais, String telefono,
                    String preferenciasComida, String restriccionesMedicas, Asiento asiento) {
        super(id, nombre, apellidos, dniPass, email, direccion, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    public Pasajero(String preferenciasComida, String restriccionesMedicas, Asiento asiento) {
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    public Pasajero(Pasajero copia) {
        this.Id = copia.Id;
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.dniPasaporte = copia.dniPasaporte;
        this.email = copia.email;
        this.direccion = copia.direccion;
        this.ciudad = copia.ciudad;
        this.pais = copia.pais;
        this.telefono = copia.telefono;
        this.preferenciasComida = copia.preferenciasComida;
        this.restriccionesMedicas = copia.restriccionesMedicas;
        this.asiento = copia.asiento;
    }

    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public void setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public void setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("id=").append(Id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dniPass='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", preferenciasComida='").append(preferenciasComida).append('\'');
        sb.append(", restriccionesMedicas='").append(restriccionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append('}');
        return sb.toString();
    }
}
