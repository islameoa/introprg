/*Classe hora en la que tindrem com a propietats hores, minuts i segons i podrem afegir o restar temps amb diversos mòduls*/
public class Hora {
    private int hores = 0;
    private int minuts = 0;
    private int segons = 0;

    public Hora() {
    }

    public Hora(int hores, int minuts, int segons) {
        if (hores < 0 || hores > 23 || minuts < 0 || minuts > 59 || segons < 0 || segons > 59) {
            this.hores = 0;
            this.minuts = 0;
            this.segons = 0;
        } else {
            this.hores = hores;
            this.minuts = minuts;
            this.segons = segons;
        }
    }

    public void setHores(int hores) {
        if (hores >= 0 && hores < 24) {
            this.hores = hores;
        } else {
            this.hores = 0;
        }
    }

    public void setMinuts(int minuts) {
        if (minuts >= 0 && minuts < 60) {
            this.minuts = minuts;
        } else {
            this.minuts = 0;
        }
    }

    public void setSegons(int segons) {
        if (segons >= 0 && segons < 60) {
            this.segons = segons;
        } else {
            this.segons = 0;
        }
    }

    public int getHores() {
        return hores;
    }

    public int getMinuts() {
        return minuts;
    }

    public int getSegons() {
        return segons;
    }

    /**
     * Compara dues hores i retorna l'operador corresponent
     * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
     * altres dos valors possibles són ">" i "=="
     * 
     * @param hora1: primera hora a comparar
     * @param hora2: segona hora a comparar
     * @return operador resultant
     */
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }

    // Fa que l’hora tingui un segon més
    void incrementa() {
        incrementa(1);
    }

    // Fa que l’hora tingui un segon menys
    void decrementa() {
        decrementa(1);
    }

    // Fa que l’hora s’incrementi en el nombre de segons indicats
    void incrementa(int segons) {
        if (segons < 0) {
            segons = abs(segons);
            decrementa(segons);
        } else {
            segons += getHores() * 3600 + getMinuts() * 60 + getSegons();
            setHores(segons / 3600);
            while (getHores() > 23) {
                setHores(getHores() - 24);
            }
            segons %= 3600;
            setMinuts(segons / 60);
            while (getMinuts() > 60) {
                setMinuts(getMinuts() - 60);
            }
            setSegons(segons % 60);
        }
    }

    // Módulo que hace que la hora decremente en el número de segundos indicados
    void decrementa(int segons) {
        int segonsInicials = getHores() * 3600 + getMinuts() * 60 + getSegons();
        if (segonsInicials < segons) {
            segons -= segonsInicials;
            while (segons > 86400) {
                segons -= 86400;
            }
            int segonsFinals = 86400 - segons;
            setHores(segonsFinals / 3600);
            while (getHores() > 23) {
                setHores(getHores() - 24);
            }
            segonsFinals %= 3600;
            setMinuts(segonsFinals / 60);
            while (getMinuts() > 60) {
                setMinuts(getMinuts() - 60);
            }
            setSegons(segonsFinals % 60);
        } else {
            segonsInicials -= segons;
            setHores(segonsInicials / 3600);
            while (getHores() > 23) {
                setHores(getHores() - 24);
            }
            segonsInicials %= 3600;
            setMinuts(segonsInicials / 60);
            while (getMinuts() > 60) {
                setMinuts(getMinuts() - 60);
            }
            setSegons(segonsInicials % 60);
        }
    }

    // Compara amb l’hora indicada i retorna <0 si és menor que la indicada, 0 si
    // són iguals i >0 si és més gran que la indicada
    int compareTo(Hora hora) {
        if (getHores() > hora.hores) {
            return 1;
        } else if (getHores() < hora.hores) {
            return -1;
        } else {
            if (getMinuts() > hora.minuts) {
                return 1;
            } else if (getMinuts() < hora.minuts) {
                return -1;
            } else {
                if (getSegons() > hora.segons) {
                    return 1;
                } else if (getSegons() < hora.segons) {
                    return -1;
                }
            }
        }
        return 0;
    }

    // Retorna un String amb l’hora en format h:mm:ss

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", getHores(), getMinuts(), getSegons());
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
    }

    int abs(int numero) {
        return numero > 0 ? numero : -numero;
    }

}
