package com.aula.polimorfismo;

public abstract class Pokemon {

    protected String nome;

    public Pokemon (String nome){
        this.nome = nome;
    }
    public Pokemon(){}

    public abstract void atacar();

}
