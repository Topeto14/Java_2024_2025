package SegundaEvaluacion.Tema4.Incidencias;
//** Implementa una clase Incidencia. Queremos resolver el problema de una comunidad de propietarios que quiere
//gestionar las incidencias que se producen en la comunidad. Tendremos como propiedades: código, estado
//(abierta, en proceso, resuelta), problema (la descripción de la incidencia), solución (la descripción de la solución),
//pendientes (será una propiedad estática, cada vez que se crea un objeto se incrementa y cada vez que se
//resuelve una se decrementa). Los métodos a implementar son:
//- resuelve(): método estático que decrementa el contador de pendientes
//- toString(): pasa un objeto a string, código, estado, problema y solución.
//- getters y setters
//- getPendientes(): método estático que devuelva el número de incidencias pendientes de resolver.
//Realiza una clase TestIncidencia en la que crees 5 incidencias, resuelvas algunas y veas las que quedan
//pendientes.**//

public class Incidencia {
    private Integer codigo;
    private Estado estado;
    private String problema;
    private String solucion;

    public static int pendientes = 0 ; // Cada vez que se forme un objeto el contador sumara

    public Incidencia(Integer codigo, Estado estado, String problema, String solucion) {
        this.codigo = codigo;
        this.estado = estado;
        this.problema = problema;
        this.solucion = solucion;
        Incidencia.pendientes++; // Esto hace que sume el contador
    }
    //Methods
    public static void resuelve(Incidencia estado){
        if (!estado.equals(Estado.resuelto)) {
            pendientes--;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", estado=").append(estado);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }


}
