package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

import java.util.Objects;

public abstract class  Persona {

    protected Long Id ;
    protected String nombre;
    protected String apellidos;
    protected String dniPasaporte ;
    protected String email;
    protected String direccion;
    protected String ciudad;
    protected String pais ;
    protected String telefono;
    //Constructor Vacio
    public Persona() {
    }
    //Constructor con todos los paremetros

    public Persona(Long id, String nombre, String apellidos, String email, String dniPasaporte, String direccion, String ciudad, String telefono, String pais) {
        this.Id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dniPasaporte = dniPasaporte;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.pais = pais;
    }


    //Getters Ands Setters


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDniPasaporte() {
        return dniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        this.dniPasaporte = dniPasaporte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // To String


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("Id=").append(Id);
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

    // Equals Ands hashCode por Dni

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dniPasaporte, persona.dniPasaporte);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dniPasaporte);
    }
}
