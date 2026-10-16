package com.aula.polimorfismo;

public class Squirtle extends Pokemon {
    public Squirtle(String nome){
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("Usou jato d'água");
    }


}
