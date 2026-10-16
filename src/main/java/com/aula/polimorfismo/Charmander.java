package com.aula.polimorfismo;

public class Charmander extends Pokemon{
    public Charmander (String nome){
        super(nome);
    }
    @Override
    public void atacar() {
        System.out.println("Usou brasas!");
    }
}
