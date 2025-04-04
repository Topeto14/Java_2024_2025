package TerceraEvaluacion.Tema7Parte1.listas.ejemploCola;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedListvsArrayList {
    public static void main(String[] args) {
        long milis=0;

        ArrayList<Proceso> procesos = new ArrayList<>(100000);
        for(int i=0; i < 1000000; i++) {
            procesos.add(new Proceso(i,"proceso-"+i,"path",2));
        }

        milis = System.currentTimeMillis();
        //1. Consultar un elemento intermedio
        System.out.println(procesos.get(500000));
        System.out.println("1 " + (System.currentTimeMillis() - milis));


        milis = System.currentTimeMillis();
        //2. Insertar un elemento
        procesos.add(new Proceso(2000000,"proceso-xx","path",2));
        System.out.println("2 " + (System.currentTimeMillis() - milis));

        milis = System.currentTimeMillis();
        //3. Eliminar un elemento
        procesos.remove(500000);
        System.out.println("3 " + (System.currentTimeMillis() - milis));


        LinkedList<Proceso> procesosLL = new LinkedList<>();
        for(int i=0; i < 1000000; i++) {
            procesosLL.add(new Proceso(i,"proceso-"+i,"path",2));
        }

        milis = System.currentTimeMillis();
        //1. Consultar un elemento intermedio
        System.out.println(procesosLL.get(500000));
        System.out.println("1 " + (System.currentTimeMillis() - milis));


        milis = System.currentTimeMillis();
        //2. Insertar un elemento
        procesosLL.add(new Proceso(2000000,"proceso-xx","path",2));
        System.out.println("2 " + (System.currentTimeMillis() - milis));

        milis = System.currentTimeMillis();
        //3. Eliminar un elemento
        procesosLL.remove(500000);
        System.out.println("3 " + (System.currentTimeMillis() - milis));

    }
}
