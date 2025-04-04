package TerceraEvaluacion.Tema7Parte1.listas.ejemploCola;

import java.util.LinkedList;

public class Pila<E> {
    LinkedList<E> elementos;

    public Pila() {
        this.elementos = new LinkedList<>();
    }

    /**
     * Insertar por el principio
     * @param elemento
     * @return
     */
    public void insertar(E elemento) {
        this.elementos.push(elemento);
    }

    /**
     * Saca el primer elemento de la pila, lo muestra y lo elimina
     * @return
     */
    public E sacarElemento() {
        return this.elementos.pop();
    }

    /**
     * Muestra el primer elemento de la pila
     * @return
     */
    public E mostrarElemento() {
        return this.elementos.peek();
    }
}
