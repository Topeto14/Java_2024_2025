package SegundaEvaluacion.Tema6.poliformismoInterfaces;

public class Documento implements Validator {
    protected String nombre;
    protected Integer size; //Size in KB
    protected String autor;

    public Documento(String nombre, Integer size, String autor) {
        this.nombre = nombre;
        this.size = size;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Documento{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", size=").append(size);
        sb.append(", autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean validate() {
        if (this.size > 4096) { //Si es mayor de 4MB no es válido
            return false;
        } else return true;
    }
}
