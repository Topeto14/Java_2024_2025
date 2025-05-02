package TerceraEvaluacion.Tema7Parte3.ejercicioGamers;

import java.util.Objects;

public class Gamer {
    private String nick;
    private String email;
    private String juego;
    private Nivel nivel;

    public Gamer(String nick, String email, String juego, Nivel nivel) {
        this.nick = nick;
        this.email = email;
        this.juego = juego;
        this.nivel = nivel;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(nick).append(';');
        sb.append(email).append(';');
        sb.append(juego).append(';');
        sb.append(nivel);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Gamer gamer = (Gamer) o;
        return Objects.equals(getNick(), gamer.getNick());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNick());
    }
}
