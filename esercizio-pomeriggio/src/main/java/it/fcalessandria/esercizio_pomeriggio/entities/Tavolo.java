package it.fcalessandria.esercizio_pomeriggio.entities;

public class Tavolo {
    private int numeroTavolo;
    private int coperti;
    private boolean prenotato;

    public Tavolo(int numeroTavolo, int coperti, boolean prenotato) {
        this.numeroTavolo = numeroTavolo;
        this.coperti = coperti;
        this.prenotato = prenotato;
    }
}
