package TerceraEvaluacion.Tema7Parte1.listas.ejemploCola;

import java.util.ArrayList;

public class ColaAL<E> {
    ArrayList<E> elementos;

    public ColaAL() {
        this.elementos = new ArrayList<>();
    }

    /**
     * Insertar por el principio
     * @param elemento
     * @return
     */
    public boolean insertar(E elemento) {
        return this.elementos.add(elemento); //Inserta al final
    }

    /**
     * Saca el último elemento de la cola, lo muestra y lo elimina
     * @return
     */
    public E sacarElemento() {
        E elemento = this.elementos.getFirst();
        this.elementos.remove(elemento);
        return elemento;
    }

    /**
     * Muestra el último elemento de la cola
     * @return
     */
    public E mostrarElemento() {
        return this.elementos.getFirst();
    }

}
