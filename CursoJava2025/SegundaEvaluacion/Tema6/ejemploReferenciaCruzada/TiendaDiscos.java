package SegundaEvaluacion.Tema6.ejemploReferenciaCruzada;

import java.util.ArrayList;

public class TiendaDiscos {

    private ArrayList<Disco> discos;
    private ArrayList<GrupoMusica> grupos;

    public TiendaDiscos() {
        this.discos = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    public ArrayList<GrupoMusica> getGrupos() {
        return grupos;
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
    }

    public void addGrupoMusica(GrupoMusica gm) {
        grupos.add(gm);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DISCOS EN LA TIENDA \n");
        for(Disco d: discos) {
            sb.append(d.getTitulo());
            sb.append("\n");
        }

        return sb.toString();
    }


    /**
     * Buscar a qué grupo pertenece un disco
     * Nos recorremos todos los grupos, y buscamos el disco en cada grupo
     */
    public GrupoMusica buscarDisco(Disco d) {
        for(GrupoMusica gp: grupos) {
            if (gp.getDiscos().contains(d)) {
                return gp;
            }
        }

        return null;
    }
}
