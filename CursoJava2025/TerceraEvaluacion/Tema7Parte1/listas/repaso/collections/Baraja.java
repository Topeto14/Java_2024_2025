package TerceraEvaluacion.Tema7Parte1.listas.repaso.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baraja {
    //Números: 1(A),2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K)
    //Palos: Diamantes, Corazones, Tréboles, Picas

    private ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();

        //Añadir cartas
        for(int i=1; i<=13; i++) {
            this.cartas.add(new Carta(i,"Diamantes"));
            this.cartas.add(new Carta(i,"Corazones"));
            this.cartas.add(new Carta(i,"Tréboles"));
            this.cartas.add(new Carta(i,"Picas"));
        }

        //Barajar las cartas
        Collections.shuffle(cartas);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Baraja{\n");
        for(Carta c: cartas) {
            sb.append(Baraja.pintarCarta(c));
        }
        sb.append('}');
        return sb.toString();
    }

    public static StringBuilder pintarCarta(Carta c) {
        StringBuilder sb = new StringBuilder();
        switch (c.getNumero()) {
            case 2,3,4,5,6,7,8,9,10:
                sb.append(c.getNumero() + " de " + c.getPalo()).append("\n");
                break;
            case 1:
                sb.append("As de " + c.getPalo()).append("\n");
                break;
            case 11:
                sb.append("Jota de " + c.getPalo()).append("\n");
                break;
            case 12:
                sb.append("Dama de " + c.getPalo()).append("\n");
                break;
            case 13:
                sb.append("Rey de " + c.getPalo()).append("\n");
                break;
        }
        return sb;
    }

    public Carta sacarArriba() {
        return cartas.removeFirst();
    }

    public Carta sacarAbajo() {
        return cartas.removeLast();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public void ordenarPorPalo() {
        //Collections.sort(cartas, Comparator.comparing(Carta::getPalo));
        cartas.sort(Comparator.comparing(Carta::getPalo));
    }

    public void ordenarPorNumero() {
        cartas.sort(Comparator.comparing(Carta::getNumero));
    }
}
