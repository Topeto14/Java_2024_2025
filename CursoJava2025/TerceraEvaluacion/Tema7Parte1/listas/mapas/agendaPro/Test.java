package TerceraEvaluacion.Tema7Parte1.listas.mapas.agendaPro;

public class Test {

    public static void main(String[] args) {

        Agenda miAgenda = new Agenda();
        miAgenda.addContacto("Pepe García", new Contacto("Pepe","García",
                "pepeg@gmail.com","645223331"));
        miAgenda.addContacto("Ana García", new Contacto("Ana","García",
                "anag@gmail.com","645223322"));
        miAgenda.addContacto("Luis Gómez", new Contacto("Luis","Gómez",
                "luisg@gmail.com","645223399"));
        miAgenda.addContacto("Bea García, la del barrio", new Contacto("Bea","García",
                "beas@gmail.com","645226666"));
        miAgenda.addContacto("Pepe el chusco", new Contacto("Pepe","Gonzalez",
                "pepeg@gmail.com","645227799"));


        System.out.println(miAgenda.haveContacto("Pepe García"));
        miAgenda.listarAgenda();
        System.out.println("-----------------------");
        miAgenda.listarAgendaOrdenado();
        System.out.println("-----------------------");
        System.out.println(miAgenda.getContacto("GARCÍA"));







    }
}
