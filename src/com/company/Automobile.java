package com.company;

public class Automobile implements Veicolo{
    private String carburante;
    private String marca;
    private String modello;


    public Automobile(String marca, String modello){
        this.setMarca(marca);
        this.setModello(modello);
        this.setCarburante("Benzina");
    }



    public String getCarburante() {
        return carburante;
    }

    @Override
    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public int getNumRuote() {
        return 4;
    }

    @Override
    public String getTipoCarburante() {
        return "";
    }


}
