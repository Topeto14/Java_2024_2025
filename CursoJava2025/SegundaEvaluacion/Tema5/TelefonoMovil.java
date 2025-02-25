package SegundaEvaluacion.Tema5;

import java.util.Objects;

public class TelefonoMovil {
    enum CodigoPais { ES, UK, US, FR, GR }
    private String numero;
    private String modelo;
    private CodigoPais codigo;
    private Double peso;

    public TelefonoMovil(String numero, String modelo, CodigoPais codigo, Double peso) {
        this.numero = numero;
        this.modelo = modelo;
        this.codigo = codigo;
        this.peso = peso;
    }

    public TelefonoMovil(TelefonoMovil tm) {
        this.numero = tm.numero;
        this.modelo = tm.modelo;
        this.codigo = tm.codigo;
        this.peso = tm.peso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CodigoPais getCodigo() {
        return codigo;
    }

    public void setCodigo(CodigoPais codigo) {
        this.codigo = codigo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TelefonoMovil{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", codigo=").append(codigo);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        TelefonoMovil that = (TelefonoMovil) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(numero);
        result = 31 * result + Objects.hashCode(modelo);
        result = 31 * result + Objects.hashCode(codigo);
        result = 31 * result + Objects.hashCode(peso);
        return result;
    }
}
