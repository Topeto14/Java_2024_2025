package SegundaEvaluacion.Tema5;

public class IncializadorStatic {
    static {
        System.out.println("Inicializador....");
        IncializadorStatic.aleatorio = generarNumeroAleatorio(1000,1);
    }

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    private String codigo;
    private static Integer aleatorio;

    public IncializadorStatic(String codigo) {
        this.codigo = codigo + IncializadorStatic.aleatorio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IncializadorStatic{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        IncializadorStatic in = new IncializadorStatic("Prueba");
        System.out.println(in);
        IncializadorStatic in2 = new IncializadorStatic("Prueba2");
        System.out.println(in2);
    }
}
