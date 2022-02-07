package com.company;

public class personvogn extends koeretoj{
    private int hastighed;
    private String motorstorrelse;
    private int hestekraefter;

    public personvogn(double vaegtafgift, String registreringsnummer, int hastighed, String motorstorrelse, int hestekraefter) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.motorstorrelse = motorstorrelse;
        this.hestekraefter = hestekraefter;
    }

    @Override
    public void udskrivAlleData() {
        System.out.println("Personvogn:");
        super.udskrivAlleData();
        String tekst = "Hastighed: " + hastighed + "\nMotorstørrelse: " + motorstorrelse + "\nHestekræfter: " + hestekraefter + "\n";
        System.out.println(tekst);
    }
}
