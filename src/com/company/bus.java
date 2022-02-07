package com.company;

public class bus extends koeretoj{
    private int antalPassagerer;
    private int antalDoerer;

    public bus(double vaegtafgift, String registreringsnummer, int antalPassagerer, int antalDoerer) {
        super(vaegtafgift, registreringsnummer);
        this.antalPassagerer = antalPassagerer;
        this.antalDoerer = antalDoerer;
    }

    @Override
    public void udskrivAlleData() {
        System.out.println("Bus:");
        super.udskrivAlleData();
        String tekst = "Antal passagerer: " + antalPassagerer + "\nAntal dører: " + antalDoerer + "\n";
        System.out.println(tekst);
    }


}
