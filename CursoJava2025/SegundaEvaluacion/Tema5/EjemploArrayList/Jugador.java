package SegundaEvaluacion.Tema5.EjemploArrayList;

import java.util.Objects;

public class Jugador {
    enum Nivel { INICIADO, AMATEUR, INTERMEDIO, PROFESIONAL }
    private String nickname;
    private Nivel level;
    private String country;

    public Jugador(String nickname, Nivel level, String country) {
        this.nickname = nickname;
        this.level = level;
        this.country = country;
    }

    public Jugador(Jugador otro) {
        this.nickname = otro.nickname;
        this.level = otro.level;
        this.country = otro.country;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Nivel getLevel() {
        return level;
    }

    public void setLevel(Nivel level) {
        this.level = level;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nickname='").append(nickname).append('\'');
        sb.append(", level=").append(level);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;
        return Objects.equals(nickname, jugador.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nickname);
    }
}
