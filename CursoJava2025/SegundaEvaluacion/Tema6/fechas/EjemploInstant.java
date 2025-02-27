package SegundaEvaluacion.Tema6.fechas;

import java.time.Duration;
import java.time.Instant;

public class EjemploInstant {
    public static void main(String[] args) {

        Instant ins = Instant.now();
        System.out.println(ins);

        long seconds = ins.getEpochSecond();


        for(int i=0; i < 10000000; i++) {
            System.out.println(i);
        }

        Instant ins2 = Instant.now();
        System.out.println(seconds);
        System.out.println(ins2.getEpochSecond());

        System.out.println( Duration.between(ins, ins2).getSeconds() + "."
                +  Duration.between(ins, ins2).getNano());

    }
}
