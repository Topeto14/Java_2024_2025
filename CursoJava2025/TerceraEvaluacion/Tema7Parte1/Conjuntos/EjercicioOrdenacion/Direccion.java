package TerceraEvaluacion.Tema7Parte1.Conjuntos.EjercicioOrdenacion;

public class Direccion implements Comparable<Direccion> {
    @Override
    public int compareTo(Direccion o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    enum Tipo {CALLE, AVENIDA, PLAZA}

    private Tipo tipo;
    private String nombre;
    private Integer numero;
    private String planta;
    private String puerta;
    private String ciudad;

    public Direccion(Tipo tipo, String nombre, Integer numero, String planta, String puerta, String ciudad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.numero = numero;
        this.planta = planta;
        this.puerta = puerta;
        this.ciudad = ciudad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Direccion{");
        sb.append("tipo=").append(tipo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", numero=").append(numero);
        sb.append(", planta='").append(planta).append('\'');
        sb.append(", puerta='").append(puerta).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Direccion direccion = (Direccion) o;
        return getTipo() == direccion.getTipo() && getNombre().equals(direccion.getNombre()) && getNumero().equals(direccion.getNumero()) && getPlanta().equals(direccion.getPlanta()) && getPuerta().equals(direccion.getPuerta());
    }

    @Override
    public int hashCode() {
        int result = getTipo().hashCode();
        result = 31 * result + getNombre().hashCode();
        result = 31 * result + getNumero().hashCode();
        result = 31 * result + getPlanta().hashCode();
        result = 31 * result + getPuerta().hashCode();
        return result;
    }
}
