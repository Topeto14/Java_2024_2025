package SegundaEvaluacion.Tema6.poliformismoInterfaces;

import java.util.ArrayList;

public class Envios {
    private ArrayList<Validator> elementos;

    public Envios() {
        this.elementos = new ArrayList<>();
    }

    public ArrayList<Validator> getElementos() {
        return elementos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Envios{");
        sb.append("elementos=").append(elementos);
        sb.append('}');
        return sb.toString();
    }

    public void addElemento(Validator ele) {
        this.elementos.add(ele);
    }
}
