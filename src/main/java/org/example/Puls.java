package org.example;

import java.time.LocalDate;

public class Puls {

int morgen,middag, aften;
LocalDate dato;

    int minpuls;
    int maxspuls;


    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public Puls(int morgen, int middag, int aften, LocalDate dato){
        this.morgen = morgen;
        this.middag = middag;
        this.aften = aften;
        this.dato = dato;

    }

    public int getMorgen() {
        return morgen;
    }

    public void setMorgen(int morgen) {
        this.morgen = morgen;
    }

    public int getMiddag() {
        return middag;
    }

    public void setMiddag(int middag) {
        this.middag = middag;
    }

    public int getAften() {
        return aften;
    }

    public void setAften(int aften) {
        this.aften = aften;
    }

    public String[] setRandomPuls(int minpuls, int maxpuls) {

            int puls[]=new int [10];
            for (int i = 0; i < 10; i++) {
                 puls[i] = (int) ((Math.random() * (maxpuls - minpuls)) + minpuls);
                System.out.println(puls[i]);



            }


        return new String[0];
    }
}

