package org.example;

import net.datafaker.Faker;

import java.util.Random;

public class reclutatore {
    Faker dataFaker = new Faker();
    Random rnd = new Random();

    String nomeSupereroe;
    Integer potereSupereroe;

    public reclutatore(){
        this.nomeSupereroe = dataFaker.superhero().name();
        this.potereSupereroe = rnd.nextInt(0, 100);
    }

    public void affrontaMissione(Integer livelloMissione) throws eroeNonIdoneoException{
        if (potereSupereroe < livelloMissione){
            throw new eroeNonIdoneoException(nomeSupereroe, potereSupereroe);
        }
    }
}
