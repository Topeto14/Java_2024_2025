package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
       /* Atrapame atrap = new Atrapame();
        for(int i=0; i < 1000; i++) {
            Vuelo vuelo = new Vuelo("Almería", "Dublín",
                    LocalDate.of(2025,4, 26),
                    LocalTime.of(10, 0), 120.0,
                    100,) ;
            atrap.addVuelo(vuelo);
        }

        Vuelo vuelo = atrap.getVuelos().get(400);

        Pasajero ps1 = new Pasajero(1l,"ps1","aps1","11223344-A","ps1@gmail.com",
                "sucasa","Vera","España","234242424",
                "Vegano","Ninguna", null);

        Pasajero ps2 = new Pasajero(2l,"ps2","aps2","11223344-B","ps2@gmail.com",
                "sucasa","Vera","España","234242424",
                "Vegetariano","Ninguna", null);

        Pasajero ps3 = new Pasajero(3l,"ps3","aps3","11223344-C","ps3@gmail.com",
                "sucasa","Vera","España","234242424",
                "Ninguna","Ninguna", null);

        Pasajero ps4 = new Pasajero(4l,"ps4","aps4","11223344-D","ps4@gmail.com",
                "sucasa","Vera","España","234242424",
                "Ninguna","Ninguna", null);

        Pasajero ps5 = new Pasajero(5l,"ps5","aps5","11223344-E","ps5@gmail.com",
                "sucasa","Vera","España","234242424",
                "Ninguna","Ninguna", null);

        atrap.crearReserva(vuelo, new ArrayList<Pasajero>(List.of(ps1,ps2)),
                TipoTarifa.Optima,TipoAsiento.Business);
        atrap.crearReserva(vuelo, new ArrayList<Pasajero>(List.of(ps3)),
                TipoTarifa.Confort,TipoAsiento.Turista);
        atrap.crearReserva(vuelo, new ArrayList<Pasajero>(List.of(ps4,ps5)),
                TipoTarifa.Confort,TipoAsiento.Turista);

        System.out.println(vuelo);
        System.out.println(atrap.getReservas());


    }

    /*
    Para mejorar el manejo de los pasajeros de un vuelo,
     podrías usar una hashmap o set para almacenar los pasajeros por su ID,
     lo que permitiría consultas más rápidas.
     Si aumentas la cantidad de vuelos a 100000 o un millón,
     se incrementaría notablemente la memoria,
     principalmente por los objetos de tipo Asiento y Pasajero.
     Cada vuelo tendría muchos asientos y cada pasajero se asociaría con uno de esos asientos.
     Para optimizarlo, podrías considerar el uso de colecciones más eficientes o bases de datos si la memoria comienza a ser un problema.


        */



/*
         System.out.println("RESERVAS VUELOS");

        //Crear 5 pasajeros
        Pasajero p1 = new Pasajero(1L, "Javier", "Guillén", "48484848F", "jj@gmail.com" ,
                "Micasa", "Mojacar", "España", "77899987", "Alérgico gluten",
                "ninguna");
        Pasajero p2 = new Pasajero(2l, "Ana", "Gómez", "41340440A", "ana@gmail.com" ,
                "Micasa", "Vera", "España", "77899981", "Alérgico gluten",
                "ninguna");
        Pasajero p3 = new Pasajero(3l, "Andrés", "Valero", "51999393B", "andres@gmail.com" ,
                "Micasa", "Garrucha", "España", "66899987", "Alérgico gluten",
                "ninguna");
        Pasajero p4 = new Pasajero(4l, "Verónica", "García", "22334455C", "vero@gmail.com" ,
                "Micasa", "Palomares", "España", "77899666", "Alérgico gluten",
                "ninguna");
        Pasajero p5 = new Pasajero(5l, "Juan", "Martínez", "33445599D", "juan@gmail.com" ,
                "Micasa", "Carboneras", "España", "55899987", "Alérgico gluten",
                "ninguna");
        Pasajero p6 = new Pasajero(6L,"Robert","Levis","2525255F","rlh@gmail.com","Calle","Ibiza","12345678","Alergico gluten","Migraña","CASAS");

        //Crear 100 vuelos
        Atrapame atr = new Atrapame();
        for(int i=0; i<1000; i++) {
            atr.addVuelo( new Vuelo("RG56Z-"+i, "Madrid", "Los Ángeles",
                    LocalDate.of(2024,i%12 + 1,i%27 + 1), LocalTime.of(16,00),
                    500.0 + i*10, 150) );
        }

        Vuelo vueloAtr = atr.getVuelos().get(0);

        //Reserva 1
        ArrayList<Pasajero> pasajeros1 = new ArrayList<>();
        pasajeros1.add(p1);
        pasajeros1.add(p2);
        atr.crearReserva(vueloAtr, pasajeros1, TipoTarifa.Optima, TipoAsiento.Business);

        //Reserva 2
        ArrayList<Pasajero> pasajeros2 = new ArrayList<>();
        pasajeros2.add(p3);
        pasajeros2.add(p4);
        atr.crearReserva(vueloAtr, pasajeros2, TipoTarifa.Flexible, TipoAsiento.Turista);

        //Reserva 3
        ArrayList<Pasajero> pasajeros3 = new ArrayList<>();
        pasajeros3.add(p1);
        pasajeros3.add(p5);
        atr.crearReserva(vueloAtr, pasajeros3, TipoTarifa.Confort, TipoAsiento.Turista);

        //Reserva 4
        ArrayList<Pasajero> pasajeros4 = new ArrayList<>();
        pasajeros4.add(p1);
        pasajeros4.add(p2);
        pasajeros4.add(p3);
        atr.crearReserva(vueloAtr, pasajeros4, TipoTarifa.Optima, TipoAsiento.Business);

        //Reserva 5
        ArrayList<Pasajero> pasajeros5 = new ArrayList<>();
        pasajeros5.add(p3);
        pasajeros5.add(p4);
        pasajeros5.add(p5);
        atr.crearReserva(vueloAtr, pasajeros4, TipoTarifa.Optima, TipoAsiento.Turista);

        //Reserva 6
        ArrayList<Pasajero> pasajeros6 = new ArrayList<>();
        pasajeros1.add(p6);
        pasajeros1.add(p6);
        atr.crearReserva(vueloAtr, pasajeros1, TipoTarifa.Optima, TipoAsiento.Business);
        //System.out.println(vueloAtr);

        System.out.println(atr.getReservas());
        System.out.println(atr.buscarReservas("48484848F"));

        atr.buscarVuelos(LocalDate.of(2024,2,2), "Los Ángeles").stream()
                .forEach(v -> System.out.println(v.getCodigo()));
    */
    }


}

