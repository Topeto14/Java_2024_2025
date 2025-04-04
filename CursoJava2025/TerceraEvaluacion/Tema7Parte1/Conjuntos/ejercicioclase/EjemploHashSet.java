package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase;

import TerceraEvaluacion.Tema7Parte1.listas.ejemploCola.Proceso;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet <Proceso> conjunto = new HashSet<>();

        conjunto.add(new Proceso(1,"p1","/",3));
        //Repetido porque el equals de Proceso utiliza el pid, y tiene el mismo
        conjunto.add(new Proceso(1,"p4","/",3)); //Repetido
        conjunto.add(new Proceso(2,"p2","/",3));
        conjunto.add(new Proceso(4,"p3","/",3));
        conjunto.add(new Proceso(3,"p4","/",3));

        for(Proceso pr: conjunto) {
            System.out.println(pr);
        }

        Set<Proceso> nuevos = Set.of(new Proceso(3,"p3","/",2),
                new Proceso(4, "p44","/",4),
                new Proceso(5, "p22","/",4));
        //nuevos.add(new Proceso(5,"p55","/",3)); Set.of y List.of generar Set y List INMUTABLES
        //System.out.println(nuevos);

        //1. UNIÓN
        conjunto.addAll(nuevos);
        System.out.println(conjunto);

        //2. DIFERENCIA
        //conjunto.removeAll(nuevos);
        //System.out.println(conjunto); //Quedaría el 1

        //3. INTERSECCIÓN
        conjunto.retainAll(nuevos);
        System.out.println(conjunto);

        //Eliminar un elemento
        conjunto.remove(new Proceso(5, "","",0));
        System.out.println(conjunto);

    }
}
