package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase.citasmedicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class CitasConsultaMedica {
    //Mejora: hacer esto un HashSet, implemente Equals por Fecha y Hora
    //Los métodos de búsqueda, hay que pasar el HashSet a un ArrayList temporal
    //y ordenar ese ArrayList en cada método

    private ArrayList<Cita> citas;

    public CitasConsultaMedica() {
        this.citas = new ArrayList<>();
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }


    public void addCita(Cita cita) {
        //Buscar que no haya una cita en esa fecha y esa hora

        this.citas.add(cita);
    }

    public void removeCita(Cita cita) {
        this.citas.remove(cita);
    }

    /**
     * Ordena por nombre. Puede hacerlo porque Persona implementa Comparable por "nombre"
     */
    public void listarCitasPorNombre() {
        this.citas.sort(Comparator.comparing(Cita::getPaciente));
        for(Cita cita: citas) {
            System.out.println(cita);
        }
    }

    public void listarCitasPorApellidos() {
        this.citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPaciente().getApellidos().compareTo(o2.getPaciente().getApellidos());
            }
        });

        for(Cita cita: citas) {
            System.out.println(cita);
        }
    }

    public void listarCitasPorFechaYApellidos() {
        this.citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
                if (o1.getFecha().equals(o2.getFecha())) {
                    return o1.getPaciente().getApellidos().compareTo(o2.getPaciente().getApellidos());
                } else {
                    return o1.getFecha().compareTo(o2.getFecha()); //Ordenar por fecha
                }
            }
        });
        for(Cita cita: citas) {
            System.out.println(cita);
        }
    }

    public void listarCitasPorHora(LocalDate fecha) {
        //En un ArrayList auxiliar meto las citas de esa fecha
        ArrayList<Cita> citasEnFecha = new ArrayList<>();
        for(Cita cita: citas) {
            if (cita.getFecha().equals(fecha)) {
                citasEnFecha.add(cita);
            }
        }

        //Una vez tengo el ArrayList con las fechas del día, lo ordeno por hora
        citasEnFecha.sort(Comparator.comparing(Cita::getHora));
        for(Cita cita: citasEnFecha) {
            System.out.println(cita);
        }
    }

    public void buscarCitasFuturas(String email) {
        for(Cita cita: citas) {
            if (cita.getPaciente().getEmail().equals(email) &&
                    cita.getFecha().isAfter(LocalDate.now())) {
                System.out.println(cita);
            }
        }
    }
}
