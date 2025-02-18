package SegundaEvaluacion.Tema5.EjercicioPractica.Persona;

public class Persona {

    private String nombre;
    private Integer edad;
    private String dni;
    private Sexo sexo;
    private Double peso;
    private Double altura;

    // Constructor por defecto

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = Sexo.H;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    //Constructor por nombre, edad ,dni , sexo resto defecto
    public Persona(String nombre, Integer edad, String dni, Sexo sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }
    //Constructor con todos los parametros
    public Persona(String nombre, String dni, Integer edad, Sexo sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    // Constructor copia
    public Persona(Persona copia) {
        this.nombre = copia.nombre;
        this.dni = copia.dni;
        this.edad = copia.edad;
        this.sexo = copia.sexo;
        this.peso = copia.peso;
        this.altura = copia.altura;
    }

}
