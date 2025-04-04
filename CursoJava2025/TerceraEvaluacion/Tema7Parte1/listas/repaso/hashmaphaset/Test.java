package TerceraEvaluacion.Tema7Parte1.listas.repaso.hashmaphaset;

public class Test {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"EMP1","e1@emp.es",Department.DIRECCION);
        Employee e2 = new Employee(2,"EMP2","e2@emp.es",Department.DESARROLLO);
        Employee e3 = new Employee(3,"EMP3","e3@emp.es",Department.DESARROLLO);
        Employee e4 = new Employee(4,"EMP4","e4@emp.es",Department.DESARROLLO);

        Project pr1 = new Project("Página web de ventas de la empresa");
        pr1.addTeamMember(e1);
        pr1.addTeamMember(e2);
        pr1.addTeamMember(e3);
        pr1.addTeamMember(e4);
        pr1.assignTask(e1, new Task("t1-e1"));
        pr1.assignTask(e1, new Task("t2-e1"));
        pr1.assignTask(e2, new Task("t1-e2"));
        pr1.assignTask(e3, new Task("t1-e3"));
        pr1.assignTask(e3, new Task("t2-e3"));
        pr1.assignTask(e3, new Task("t3-e3"));
        pr1.assignTask(e4, new Task("t1-e4"));
        pr1.assignTask(e4, new Task("t2-e4"));
        pr1.assignTask(e4, new Task("t3-e4"));

        pr1.showInfoProject();



    }
}
