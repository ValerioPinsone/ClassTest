package com.company;

public interface Veicolo {
    //Ritorna il numero di ruote
    public int getNumRuote();

    //Ritorna il tipo di carbutante
    public String getTipoCarburante();

    //Setta il tipo di carburante
    public void setCarburante(String c);
}
