package SegundaEvaluacion.Tema6.ejercicioClase;

public class Password {
    private Integer longitud;
    private String password;

    public Password() {
        this.longitud = 8;
        this.password = this.generarPassword();
        /*
        while (!this.esFuerte()) {
            this.password = this.generarPassword();
        }
         */
    }

    public Password(Integer longitud) {
        this.longitud = longitud;
        this.password = this.generarPassword();
        /*
        while (!this.esFuerte()) {
            this.password = this.generarPassword();
        }
         */
    }

    /**
     * Constructor copia
     * @param unPassword
     */
    public Password(Password unPassword) {
        this.longitud = unPassword.longitud;
        this.password = unPassword.password;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
        this.password = this.generarPassword();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Password{");
        sb.append("longitud=").append(longitud);
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    /**
     * Generar password con longitud igual a la propiedad correspondiente
     * Generar aleatoriamente cada caracter sea: mayúscula, minúscula, número, símbolo
     * @return
     */
    private String generarPassword() {
        StringBuffer pass = new StringBuffer(this.longitud);
        int tipo,valor;

        //Para cada caracter decidimos aleatoriamente si es mayúscula, minúscula, número o símbolo
        for(int i=0; i<this.longitud; i++) {
            tipo = Password.generarNumeroAleatorio(4, 1);
            switch (tipo) {
                case 1:
                    //Códigos ASCII de las mayúsculas
                    valor = generarNumeroAleatorio(90,65);
                    pass.append((char) valor);
                    break;
                case 2:
                    //Códigos ASCII de las minúsculas
                    valor = generarNumeroAleatorio(122,97);
                    pass.append((char) valor);
                    break;
                case 3:
                    //Códigos ASCII de los dígitos del 0 al 9
                    valor = generarNumeroAleatorio(57,48);
                    pass.append((char) valor);
                    break;
                case 4:
                    //Códigos ASCII de algunos símbolos
                    valor = generarNumeroAleatorio(47,33);
                    pass.append((char) valor);
                    break;
            }
        }

        return pass.toString();
    }

    /**
     * Comprueba que la password generada es "fuerte"
     * Para que sea fuerte, la contraseña debe tener al menos 8 caracteres
     * y contar con una mayúscula mínimo, más de 2 minúsculas y más de
     * 2 números y un símbolo
     * @return
     */
    public boolean esFuerte() {
        int contaMay=0, contaMin=0, contaNum=0, contaSim=0;
        char caracter;
        int valorAscii;

        if (this.password.length() < 8) {
            return false;
        } else {
            for(int i=0; i < this.password.length(); i++) {
                caracter = this.password.charAt(i);
                valorAscii = (int) caracter;
                if ( valorAscii >= 65 && valorAscii <= 90) {
                    contaMay++;
                } else if (valorAscii >= 97 && valorAscii <= 122) {
                    contaMin++;
                } else if (valorAscii >= 48 && valorAscii <= 57) {
                    contaNum++;
                } else if (valorAscii >= 33 && valorAscii <= 47) {
                    contaSim++;
                }
            }
        }

        //Comprobamos la condición de si es fuerte
        if (contaMay >= 1 && contaMin > 2 && contaNum > 2 && contaSim >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
