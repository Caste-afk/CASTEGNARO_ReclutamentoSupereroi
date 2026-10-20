package org.example;

import net.datafaker.Faker;

import java.util.Random;

public class superEroe {
    Faker dataFaker = new Faker();
    Random rnd = new Random();

    String nome;
    Integer livello;

    public superEroe(){
        this.nome = dataFaker.superhero().name();
        this.livello = rnd.nextInt(0, 100);
    }

    public String getNome(){return nome;}
    public Integer getlivello(){return livello;}
}
