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
        if (minuts > 0) {
            this.minuts = minuts;
        }
    }

    public void setMinuts(int minuts) {
        if (minuts > 0) {
            this.minuts = minuts;
        }
    }

    public void setSegons(int segons) {
        if (segons > 0) {
            this.segons = segons;
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

    // Fa que l’hora s’incrementi en el nombre de segons indicats
    void incrementa(int segons) {
        if (segons < 0) {
            segons = abs(segons);
            decrementa(segons);
        } else {
            segons += hores * 3600 + minuts * 60 + this.segons;
            hores = segons / 3600;
            while (hores > 24) {
                hores -= 24;
            }
            segons %= 3600;
            minuts = segons / 60;
            while (minuts > 60) {
                minuts -= 60;
            }
            this.segons = segons % 60;
        }
    }

    // Fa que l’hora es decrementi en el nombre de segons indicats
    void decrementa(int segons) {
        if (segons < 0) {
            segons = abs(segons);
            incrementa(segons);
        } else {
            int segInicials = hores * 3600 + minuts * 60 + this.segons;
            segons = segInicials - segons;
            if (segons >= 0) {
                hores = segons / 3600;
                while (hores > 24) {
                    hores -= 24;
                }
                segons %= 3600;
                minuts = segons / 60;
                while (minuts > 60) {
                    minuts -= 60;
                }
                this.segons = segons % 60;
            } else {
                if (segons > -1000) {
                    while (segons < 0) {
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
                        segons++;
                    }
                } else {
                    hores = segons / 3600;
                    float resto = segons % 3600;
                    while (hores <= -24) {
                        hores += 24;
                    }
                    if (hores < 0 && resto == 0) {
                        hores = 24 + hores;
                    }
                    if (hores < 0 && resto != 0) {
                        hores = 23 + hores;
                    }
                    segons %= 3600;
                    minuts = segons / 60;
                    while (minuts < 0) {
                        minuts += 60;
                    }
                    segons %= 60;
                    while (segons < 0) {
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
                        segons++;
                    }
                    // while (segons > 60) {
                    //     this.segons -= 60;
                    //     minuts--;
                    //     if (this.segons < 0) {
                    //         this.segons = 0;
                    //     }
                    //     segons--;
                    // }
                    // while (segons > 0) {
                    //     this.segons--;
                    //     segons--;
                    // }
                }
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
        // Hora hora1 = new Hora(0, 0, 1);
        // hora1.decrementa(1);
        // System.out.printf("Finalment hora1: %s ", hora1);
        // System.out.println();
    }

    int abs(int numero) {
        return numero > 0 ? numero : -numero;
    }

}