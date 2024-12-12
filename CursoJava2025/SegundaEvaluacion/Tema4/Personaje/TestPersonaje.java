package SegundaEvaluacion.Tema4.Personaje;
//Crear una clase Personaje
//    -nombre de tipo String
//    -clase de tipo String (elfo,barbaro...)
//    -sexo de tipo String (hombre,mujer, nodefinido)
//    -vida de tipo Integer (0-100)
//
//    Constructor
//    -Todas las propiedades -> new Personaje ("Aragorn", "Guerrero", "hombre",50 )
//    -Vacio-> new Personaje() -> que ponga por defecto ("SinNombre", " Humano", "nodefinido",10)
//
//    Metodos
//    -Getter
//    -Setter
//    -ToString
//   2. Crear una clase TestPersonaje
//    -Crear un objeto jugador1 con los valores que queráis.
//    -Crear un objeto jugador2 con los valores por defecto.
//    -Cambiar la clase de jugador1 a "Enano"
//    -Cambiar la vida de jugador2 a 75
//    -Pintar jugador1 y jugador2

public class TestPersonaje {

    public static void main(String[] args) {
        Personaje jugador1 = new Personaje ("Pepin", "barbaro", "hombre",50);
        Personaje jugador2 = new Personaje ("Pepina", "elfo", "mujer",70);

        jugador1.setClase("Enano");
        jugador2.setVida(75);

        System.out.println(jugador1);
        System.out.println(jugador2);
    }
}
