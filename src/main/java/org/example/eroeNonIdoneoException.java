package org.example;

public class eroeNonIdoneoException extends Exception {

    String nomeEroe;
    Integer livello;

    public eroeNonIdoneoException(String nomeEroe, Integer livello) {
        super("Eroe non idoneo, livello troppo basso!");
        this.nomeEroe = nomeEroe;
        this.livello = livello;
    }
}
