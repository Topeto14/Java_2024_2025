package TerceraEvaluacion.Tema7Parte1.Conjuntos.EjercicioOrdenacion;

public class Test {
    public static void main(String[] args) {
        EnvioPublicidad miEmpresa = new EnvioPublicidad();
        Direccion d1 = new Direccion(Direccion.Tipo.CALLE, "Picaso",1,
                "0","0","Mojácar");

        Direccion d2 = new Direccion(Direccion.Tipo.CALLE, "Picaso",1,
                "0","0","Mojácar");

        Direccion d3 = new Direccion(Direccion.Tipo.AVENIDA, "Sevilla",43,
                "0","0","Cuevas");

        Direccion d4 = new Direccion(Direccion.Tipo.CALLE, "Jáen",2,
                "0","0","Mojácar");

        Direccion d5 = new Direccion(Direccion.Tipo.PLAZA, "Príncipe Felipe",2,
                "0","0","Garrucha");

        Direccion d6 = new Direccion(Direccion.Tipo.CALLE, "Picaso",10,
                "4","5E","Vera");

        //Usa el Comparator para ordenar, pero también para no añadir repetidos
        miEmpresa.addDireccion(d1);
        miEmpresa.addDireccion(d2);
        miEmpresa.addDireccion(d3);
        miEmpresa.addDireccion(d4);
        miEmpresa.addDireccion(d5);
        miEmpresa.addDireccion(d6);

        System.out.println(miEmpresa);

        System.out.println("-----------------");
        miEmpresa.pintarDireccionesOrdenadasPorNombreReves();
        System.out.println("-----------------");
        miEmpresa.pintarDireccionesOrdenadasPorCiudad();
        System.out.println("------------------");
        miEmpresa.pintarDireccionesOrdenadasPorNombreYNumero();

    }
}
