package TerceraEvaluacion.Tema7Parte1.listas.ejemploCola;

public class Test {
    public static void main(String[] args) {

        //Cola de procesos
        Cola<Proceso> procesos = new Cola<>();

        procesos.insertar(new Proceso(12, "htop", "/usr/bin/htop", 3));
        procesos.insertar(new Proceso(13, "firefox", "/usr/local/firefox/bin/firefox", 2));
        procesos.insertar(new Proceso(14, "intellij", "/usr/local/intellij/bin/ij", 3));

        System.out.println(procesos.mostrarElemento());

        //Pila
        Pila<Caja> cajas = new Pila<>();
        cajas.insertar(new Caja(2d,2d,4d, "Libros"));
        cajas.insertar(new Caja(1.5,1.5,4d, "Juegos"));
        cajas.insertar(new Caja(1d,1d,4d, "Juguetes"));

        System.out.println(cajas.mostrarElemento());

        //Cola de procesos
        ColaAL<Proceso> procesosAL = new ColaAL<>();

        procesosAL.insertar(new Proceso(12, "htop", "/usr/bin/htop", 3));
        procesosAL.insertar(new Proceso(13, "firefox", "/usr/local/firefox/bin/firefox", 2));
        procesosAL.insertar(new Proceso(14, "intellij", "/usr/local/intellij/bin/ij", 3));

        System.out.println(procesosAL.mostrarElemento());


    }
}
