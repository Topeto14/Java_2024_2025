package TerceraEvaluacion.Tema7Parte3.Wallapop;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private String id;
    private String nombre;
    private String apellidos;
    private Genero genero;
    private LocalDate fechaNacimiento;
    private String dni;
    private String login;
    private String password;

    public Usuario(String id, String nombre, String apellidos, Genero genero, LocalDate fechaNacimiento, String dni, String login, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.login = login;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;
        return Objects.equals(getId(), usuario.getId()) && Objects.equals(getDni(), usuario.getDni());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getId());
        result = 31 * result + Objects.hashCode(getDni());
        return result;
    }
}
