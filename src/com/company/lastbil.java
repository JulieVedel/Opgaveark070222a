package com.company;

public class lastbil extends koeretoj{
    private int hestekraefter;
    private int lastkapacitet;

    public lastbil(double vaegtafgift, String registreringsnummer, int hestekraefter, int lastkapacitet) {
        super(vaegtafgift, registreringsnummer);
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }

    @Override
    public void udskrivAlleData() {
        System.out.println("Lastbil");
        super.udskrivAlleData();
        String tekst = "Hestekræfter: " + hestekraefter + "\nLastkapacitet: " + lastkapacitet + "\n";
        System.out.println(tekst);
    }
}
