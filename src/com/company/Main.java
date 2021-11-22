package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mario","Rossi");
        c1.addAuto(new Automobile("Mercedes", "E350"));
        c1.addAuto(new Automobile("Opel", "Astra"));
        c1.stampaInfo();

        Cliente c2 = new Cliente("Marco","Blu");
        c2.addAuto(new Automobile("Ferrari","Modena"));
        c2.stampaInfo();

    }
}
