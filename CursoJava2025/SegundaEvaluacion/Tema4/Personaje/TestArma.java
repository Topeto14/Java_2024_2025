package SegundaEvaluacion.Tema4.Personaje;

public class TestArma {
    public static void main(String[] args) {
        Personaje soldado = new Personaje("luis","barbaro","hombre",80);
        Arma espada = new Arma("Espadon", Arma.TipoArma.ESPADA,10);
        Arma martillo = new Arma("Thor", Arma.TipoArma.MARTILLO,7);

        System.out.println(soldado);
        espada.golpear(soldado);
        System.out.println(espada);
        System.out.println(martillo);
        System.out.println(soldado);


    }
}
