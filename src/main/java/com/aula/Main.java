package com.aula;
import com.aula.polimorfismo.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pokemon[] equipe = {
          new Pikachu("Pikachu"),
          new Charmander("Charmander"),
          new Squirtle("Squirtle")
        };

        Pokemon a = new Pikachu("A");

        for(Pokemon p : equipe){
            p.atacar();
        }



        int vetor[] = {1,2,3,4,5};

        for(int val : vetor){
            System.out.println("Valor: "+val);
        }

        List<String> lista = new ArrayList<>();
        lista.add("Abóbora");
        lista.add("Couve");
        lista.add("Brócolis");
        lista.add("Alface");
        lista.sort(Comparator.reverseOrder());
        for (String nome : lista){
            System.out.println(nome);
        }

    }
}