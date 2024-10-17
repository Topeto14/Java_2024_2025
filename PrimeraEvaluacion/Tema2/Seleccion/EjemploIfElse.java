package Tema2.Seleccion;

public class EjemploIfElse {
    public static void main(String[] args) {

        int edad = 64;
        char sexo = 'm';

        if (sexo == 'h') {
            if (edad >= 1 && edad <= 11) {
                System.out.println("Hola niño");
            }
            else if (edad >= 12 && edad <= 17) {
                System.out.println("Hola chaval");
            }
            else if (edad >= 18 && edad <= 29) {
                System.out.println("Hola tío");
            }
            else if (edad >= 30 && edad <= 60) {
                System.out.println("Hola hombre");
            }
            else if (edad > 60) {
                System.out.println("Hola abuelo");
            }
        }
        if (sexo == 'm') {
            if (edad >= 1 && edad <= 11) {
                System.out.println("Hola niña");
            }
            else if (edad >= 12 && edad <= 17) {
                System.out.println("Hola chavala");
            }
            else if (edad >= 18 && edad <= 29) {
                System.out.println("Hola tía");
            }
            else if (edad >= 30 && edad <= 60) {
                System.out.println("Hola mujer");
            }
            else if (edad > 60) {
                System.out.println("Hola abuela");
            }
        }
////////////////////////////////////////////////////////////////////
        if (edad >= 1 && edad <= 11) {
            if (sexo == 'h') {
                System.out.println("Hola niño");
            } else {
                System.out.println("Hola niña");
            }
        }
        if (edad >= 12 && edad <= 17) {
            if (sexo == 'h') {
                System.out.println("Hola chaval");
            } else {
                System.out.println("Hola chavala");
            }
        }
        if (edad >= 18 && edad <= 29) {
            if (sexo == 'h') {
                System.out.println("Hola tío");
            } else {
                System.out.println("Hola tía");
            }
        }
        if (edad >= 30 && edad <= 60) {
            if (sexo == 'h') {
                System.out.println("Hola hombre");
            } else {
                System.out.println("Hola mujer");
            }
        }
        if (edad > 60) {
            if (sexo == 'h') {
                System.out.println("Hola abuelo");
            } else {
                System.out.println("Hola abuela");
            }
        }
////////////////////////////////////////////////////////////////

        if (edad >= 1 && edad <= 11 && sexo == 'h') {
            System.out.println("Hola niño");
        }
        else if (edad >= 1 && edad <= 11 && sexo == 'm') {
            System.out.println("Hola niña");
        }
        else if (edad >= 12 && edad <= 17 && sexo == 'h') {
            System.out.println("Hola chaval");
        }
        else if (edad >= 12 && edad <= 17 && sexo == 'm') {
            System.out.println("Hola chavala");
        }
        else if (edad >= 18 && edad <= 29 && sexo == 'h') {
            System.out.println("Hola tío");
        }
        else if (edad >= 18 && edad <= 29 && sexo == 'm') {
            System.out.println("Hola tía");
        }
        else if (edad >= 30 && edad <= 60 && sexo == 'h') {
            System.out.println("Hola hombre");
        }
        else if (edad >= 30 && edad <= 60 && sexo == 'm') {
            System.out.println("Hola mujer");
        }
        else if (edad > 60 && sexo == 'h') {
            System.out.println("Hola abuelo");
        }
        else if (edad > 60 && sexo == 'm') {
            System.out.println("Hola abuela");
        }

    }
}
