package SegundaEvaluacion.Tema5;

public class EjemploConstructor {
    private String nombre;
    private String apellidos;
    private Integer numero;

    public EjemploConstructor(String nombre, String apellidos, Integer numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public EjemploConstructor(String apellidos) {
        this.apellidos = apellidos;
        this.numero = -5;
    }

    public EjemploConstructor(Integer numero) {}

    public EjemploConstructor() {
        this.nombre = "no tiene";
        this.numero = 77;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EjemploConstructor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        EjemploConstructor ec = new EjemploConstructor("Jose", "García", 5);
        System.out.println(ec);
    }
}
