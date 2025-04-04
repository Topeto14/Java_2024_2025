package TerceraEvaluacion.Tema7Parte1.listas.mapas.entry;

public class ContactGamer {
    private String nick;
    private String email;

    public ContactGamer(String nick, String email) {
        this.nick = nick;
        this.email = email;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContactGamer{");
        sb.append("nick='").append(nick).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
