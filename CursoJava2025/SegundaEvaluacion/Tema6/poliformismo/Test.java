package SegundaEvaluacion.Tema6.poliformismo;

public class Test {
    public static void main(String[] args) {
        Persona pr1 = new Empleado("Jose", 1000.0);
        pr1.setNombre("Ana");
        ((Empleado) pr1).setSueldoBase(1000.0);

        Empleado em1 = new Encargado("Juan", 2000.0);
        em1.trabajar();
        System.out.println(em1.getSueldoBase());

        Empresa cosentino = new Empresa();
        cosentino.addEmpleado(new Empleado("Manuel", 1100.0));
        cosentino.addEmpleado(new Empleado("Luis", 1300.0));
        cosentino.addEmpleado(new Encargado("Ana", 1800.0));

        //System.out.println(cosentino);

        for(Empleado e : cosentino.getEmpleados()) {
            //Este truco no se debería usar en POO pura
            if ( e instanceof Encargado) { //En verdad e es un Encargado???
                ((Encargado) e).supervisar();
            }

            e.trabajar();
        }

        Empleado emp1 = new Empleado("Emp1", 1100.0);
        Encargado enc1 = new Encargado("Enc1", 1500.0);

        //emp1 = enc1; //El hijo se puede convertir al padre
        //enc1 = (Encargado) emp1; //El padre no se puede convertir al hijo

    }
}
