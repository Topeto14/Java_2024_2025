package PrimeraEvaluacion.Tema1.Tema2.Seleccion;

public class EjemploIf3 {
    public static void main(String[] args) {

        //vidaP, magiaP, escudoEspecial (boolean)
        //Si vidaP es menor que 50 y no tiene escudo pinta Toma Poción Vida
        //Si magiaP es menor que 50 y no tiene escudo Toma Poción Magia
        //Si vidaP es menor que 50 y magiaP es menor que 50 -> Tómate algo y corre

        int vidaP = 60;
        int magiaP = 30;
        boolean escudoEspecial = true;

        if (vidaP < 50 && escudoEspecial==false) {
            System.out.println("Toma poción vida");
        }
        if (magiaP < 50 && escudoEspecial==false) {
            System.out.println("Toma poción de magia");
        }
        if (vidaP < 50 && magiaP < 50) {
            System.out.println("Tómate algo y corre");
        }

    }
}
