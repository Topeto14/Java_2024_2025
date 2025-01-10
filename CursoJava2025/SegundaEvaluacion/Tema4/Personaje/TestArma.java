package SegundaEvaluacion.Tema4.Personaje;

//2. Crear una clase TestArma, creando una espada y un martillo
//   Crear un personaje como en el ejercicio anterior
//   Golpear con la espada a ese personaje
//   Pintar la espada, el martillo y el personaje

public class TestArma {
    public static void main(String[] args) {
        Personaje soldado = new Personaje("luis","barbaro","hombre",80, Arma.TipoArma.ESPADA);

        Arma espada = new Arma("Espadon", Arma.TipoArma.ESPADA,10);
        Arma martillo = new Arma("Thor", Arma.TipoArma.MARTILLO,7);

        System.out.println(soldado);
        espada.golpear(soldado);
        System.out.println(espada);
        System.out.println(martillo);
        System.out.println(soldado);


    }
}
