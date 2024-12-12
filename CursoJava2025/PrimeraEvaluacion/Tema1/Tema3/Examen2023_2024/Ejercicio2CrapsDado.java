package PrimeraEvaluacion.Tema1.Tema3.Examen2023_2024;
/*
  2. [2 puntos] Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
  y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier
  otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta
  volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores
  simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas
  gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que
  gana cada uno.
*/
public class Ejercicio2CrapsDado {
    // Funcion para tirar un dado
    public static int tirarDado () {
        return (int) Math.ceil(Math.random() * 6);
    }

    public static void main(String[] args) {

        int primeraTiradaJ1 = 0, sumaTiradaJ1, primeraTiradaJ2 = 0, sumaTiradaJ2, VJugador1 = 0, VJugador2 = 0, partidas = 10, tiradas = 0;
        boolean haGanadoOPerdidoAlguien = false;

        for (int i = 0; i < partidas; i++) {
            do {
                // Sumar la tirada de los dados
                sumaTiradaJ1 = tirarDado() + tirarDado();
                sumaTiradaJ2 = tirarDado() + tirarDado();

                // Comprobar si ha ganado alguien y añadir los puntos pertinentes y en caso de derrota se le resta un punto al que haya perdido o si los dos han perdido se les resta a los dos
                if (tiradas == 0 && (sumaTiradaJ1 == 7 || sumaTiradaJ1 == 11)) {
                    VJugador1++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas == 0 && (sumaTiradaJ1 == 2 || sumaTiradaJ1 == 3 || sumaTiradaJ1 == 12)) {
                    VJugador1--;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ1 == primeraTiradaJ1)) {
                    VJugador1++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ1 == 7)) {
                    VJugador1--;
                    haGanadoOPerdidoAlguien = true;
                }
                if (tiradas == 0 && (sumaTiradaJ2 == 7 || sumaTiradaJ2 == 11)) {
                    VJugador2++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas == 0 && (sumaTiradaJ2 == 2 || sumaTiradaJ2 == 3 || sumaTiradaJ2 == 12)) {
                    VJugador2--;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ2 == primeraTiradaJ2)) {
                    VJugador2++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ2 == 7)) {
                    VJugador2--;
                    haGanadoOPerdidoAlguien = true;
                }

                if (tiradas == 0) {
                    primeraTiradaJ1 = sumaTiradaJ1;
                    primeraTiradaJ2 = sumaTiradaJ2;
                }

                tiradas++;

            } while (!haGanadoOPerdidoAlguien);

            tiradas = 0;
            primeraTiradaJ1 = 0;
            primeraTiradaJ2 = 0;

        }

        System.out.println("El jugador 1 en 10 partidas ha ganado " + VJugador1 + " veces");
        System.out.println("El jugador 2 en 10 partidas ha ganado " + VJugador2 + " veces");

        // Reiniciar victorias y poner partidas a 1000
        partidas = 1000;
        VJugador1 = 0;
        VJugador2 = 0;

        for (int i = 0; i < partidas; i++) {
            do {
                // Sumar la tirada de los dados
                sumaTiradaJ1 = tirarDado() + tirarDado();
                sumaTiradaJ2 = tirarDado() + tirarDado();

                // Comprobar si ha ganado alguien y añadir los puntos pertinentes y en caso de derrota se le resta un punto al que haya perdido o si los dos han perdido se les resta a los dos
                if (tiradas == 0 && (sumaTiradaJ1 == 7 || sumaTiradaJ1 == 11)) {
                    VJugador1++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas == 0 && (sumaTiradaJ1 == 2 || sumaTiradaJ1 == 3 || sumaTiradaJ1 == 12)) {
                    VJugador1--;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ1 == primeraTiradaJ1)) {
                    VJugador1++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ1 == 7)) {
                    VJugador1--;
                    haGanadoOPerdidoAlguien = true;
                }
                if (tiradas == 0 && (sumaTiradaJ2 == 7 || sumaTiradaJ2 == 11)) {
                    VJugador2++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas == 0 && (sumaTiradaJ2 == 2 || sumaTiradaJ2 == 3 || sumaTiradaJ2 == 12)) {
                    VJugador2--;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ2 == primeraTiradaJ2)) {
                    VJugador2++;
                    haGanadoOPerdidoAlguien = true;
                } else if (tiradas != 0 && (sumaTiradaJ2 == 7)) {
                    VJugador2--;
                    haGanadoOPerdidoAlguien = true;
                }

                if (tiradas == 0) {
                    primeraTiradaJ1 = sumaTiradaJ1;
                    primeraTiradaJ2 = sumaTiradaJ2;
                }

                tiradas++;

            } while (!haGanadoOPerdidoAlguien);

            tiradas = 0;
            primeraTiradaJ1 = 0;
            primeraTiradaJ2 = 0;

        }

        System.out.println("El jugador 1 en 1000 partidas ha ganado " + VJugador1 + " veces");
        System.out.println("El jugador 2 en 1000 partidas ha ganado " + VJugador2 + " veces");

    }
}
