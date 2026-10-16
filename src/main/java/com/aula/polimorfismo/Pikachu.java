package com.aula.polimorfismo;

public class Pikachu extends Pokemon{

    public Pikachu(String nome){
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("Usou choque do trovão!!");
    }
}
