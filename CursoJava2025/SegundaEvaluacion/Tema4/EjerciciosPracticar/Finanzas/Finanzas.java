package SegundaEvaluacion.Tema4.EjerciciosPracticar.Finanzas;

public class Finanzas {
    private Double cambioDolar_Euro;

    public Finanzas() {
        this.cambioDolar_Euro = 1.36;
    }
    public Finanzas(Double cambioDolarEuro) {
        this.cambioDolar_Euro = cambioDolarEuro;
    }

    public Double getCambioDolar_Euro() {
        return cambioDolar_Euro;
    }

    public void setCambioDolar_Euro(Double cambioDolar_Euro) {
        this.cambioDolar_Euro = cambioDolar_Euro;
    }

    //Methods
    public Double dolaresToEuros(Double dolares){
        return dolares * cambioDolar_Euro ;
    }

    public Double eurosToDolares(Double euros){
        return euros / cambioDolar_Euro;

    }
}
