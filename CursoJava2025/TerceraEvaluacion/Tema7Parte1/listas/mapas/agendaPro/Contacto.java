package TerceraEvaluacion.Tema7Parte1.listas.mapas.agendaPro;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String email;
    private String movil;

    public Contacto(String nombre, String apellidos, String email, String movil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.movil = movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", movil='").append(movil).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
