public class Hora {
    private int hores;
    private int minuts;
    private int segons;

    public Hora() {
        this.hores = 0;
        this.minuts = 0;
        this.segons = 0;
    }

    public Hora(int hores, int minuts, int segons) {
        this.hores = hores;
        this.minuts = minuts;
        this.segons = segons;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public void setSegons(int segons) {
        this.segons = segons;
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
        segons++;
        if (segons > 59) {
            segons = 0;
            minuts++;
            if (minuts > 59) {
                minuts = 0;
                hores++;
                if (hores > 23) {
                    hores = 0;
                }
            }
        }
    }

    // Fa que l’hora s’incrementi en el nombre de segons indicats
    void incrementa(int segons) {
        int contador = 0;
        if (segons < 0) {
            segons = abs(segons);
            decrementa(segons);
        } else {
            while (contador < segons) {
                this.segons++;
                if (this.segons > 59) {
                    this.segons = 0;
                    minuts++;
                    if (minuts > 59) {
                        minuts = 0;
                        hores++;
                        if (hores > 23) {
                            hores = 0;
                        }
                    }
                }
                contador++;
            }
        }
    }

    // Fa que l’hora tingui un segon menys
    void decrementa() {
        segons--;
        if (segons < 0) {
            segons = 59;
            minuts--;
            if (minuts < 0) {
                minuts = 59;
                hores--;
                if (hores < 0) {
                    hores = 23;
                }
            }
        }
    }

    // Fa que l’hora es decrementi en el nombre de segons indicats
    void decrementa(int segons) {
        if (segons < 0) {
            segons = abs(segons);
            incrementa(segons);
        } else {
            while (segons > 0) {
                this.segons--;
                if (this.segons < 0) {
                    this.segons = 59;
                    minuts--;
                    if (minuts < 0) {
                        minuts = 59;
                        hores--;
                        if (hores < 0) {
                            hores = 23;
                        }
                    }
                }
                segons--;
            }
        }
    }

    // Compara amb l’hora indicada i retorna <0 si és menor que la indicada, 0 si
    // són iguals i >0 si és més gran que la indicada
    int compareTo(Hora hora) {
        if (hores > hora.hores) {
            return 1;
        } else if (hores < hora.hores) {
            return -1;
        } else {
            if (minuts > hora.minuts) {
                return 1;
            } else if (minuts < hora.minuts) {
                return -1;
            } else {
                if (segons > hora.segons) {
                    return 1;
                } else if (segons < hora.segons) {
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
        Hora hora1 = new Hora(0,1,0);
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
        //hora1.decrementa(-1);
        //System.out.printf("hora: %s", hora1);
    }

    int abs(int numero) {
        return numero > 0 ? numero : -numero;
    }
}
