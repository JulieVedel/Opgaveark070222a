package com.company;

public class koeretoj {
    protected double vaegtafgift;
    protected String registreringsnummer;

    public koeretoj(){

    }

    public koeretoj(double vaegtafgift, String registreringsnummer) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsnummer = registreringsnummer;
    }

    public void udskrivAlleData() {
        String tekst;
        tekst = "Vægtafgift: " + vaegtafgift + "\nRegistreringsnummer: " + registreringsnummer;
        System.out.println(tekst);
    }
}
