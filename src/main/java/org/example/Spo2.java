package org.example;

import java.time.LocalDate;

public class Spo2 {

    double morgen, middag, aften;

    LocalDate dato;


    public Spo2(double morgen, double middag, double aften, LocalDate dato) {
        this.morgen = morgen;
        this.middag = middag;
        this.aften = aften;
        this.dato = dato;
    }

    public double getMorgen() {
        return morgen;
    }

    public void setMorgen(double morgen) {
        this.morgen = morgen;
    }

    public double getMiddag() {
        return middag;
    }

    public void setMiddag(double middag) {
        this.middag = middag;
    }

    public double getAften() {
        return aften;
    }

    public void setAften(double aften) {
        this.aften = aften;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }
}
