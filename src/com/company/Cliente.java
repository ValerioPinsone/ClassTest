package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Persona{
    private String nome;
    private String cognome;
    private List<Automobile> auto = new ArrayList<>();


    public Cliente(String n, String c){
        this.setNome(n);
        this.setCognome(c);
    }


    public List<Automobile> getAuto() {
        return auto;
    }

    public void addAuto(Automobile auto) {
        this.auto.add(auto);
    }

    @Override
    public void setNome(String n) {
        this.nome = n;
    }

    @Override
    public void setCognome(String c) {
        this.cognome = c;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCognome() {
        return this.cognome;
    }

    public void stampaInfo(){
        System.out.println("\n\n----------------------------");
        System.out.print("Nome: "+this.getNome()+" "+this.getCognome()+"\n");
        System.out.print("Auto possedute: "+ this.auto.size());
        if(this.auto.size()>0) {
            System.out.print("\nLista: -->\n");

            for (Automobile ac : this.auto) {
                System.out.println("          ------------------");
                System.out.print("          | Marca: " + ac.getMarca() + "\n");
                System.out.print("          | Modello: " + ac.getModello() + "\n");
                System.out.println("          ------------------");
            }
        }
        System.out.println("----------------------------");
    }
}
