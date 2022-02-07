package com.company;

public class Main {

    public static void main(String[] args) {
    bus bus1 = new bus(130, "DS29100", 30, 6);
    personvogn personvogn1 = new personvogn(90, "SO18443",
            230, "1.1V", 30);
    lastbil lastbil1 = new lastbil(890, "BD20693", 1100, 5000);
    bus1.udskrivAlleData();
    personvogn1.udskrivAlleData();
    lastbil1.udskrivAlleData();
    }
}
