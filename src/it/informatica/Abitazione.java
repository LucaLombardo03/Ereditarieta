package it.informatica;

import java.util.Objects;

public class Abitazione {
    private int numeroStanze;
    private int superficie;
    private String indirizzo;
    private String citta;

    public Abitazione(int numeroStanze, int superficie, String indirizzo, String citta){
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public int getNumeroStanze(){
        return numeroStanze;
    }

    public int getSuperficie(){
        return superficie;
    }

    public String getIndirizzo(){
        return indirizzo;
    }

    public String getCitta(){
        return citta;
    }

    @Override
    public String toString(){
        String finale = "Abitazione = [" + "indirizzo: " + indirizzo + ", città: " + citta + ", numero stanze: " + numeroStanze + ", superficie: " + superficie +"]";
        return finale;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Abitazione){
            Abitazione a = (Abitazione) obj;
            return this.superficie == a.superficie && this.numeroStanze == a.numeroStanze && this.citta == a.citta && this.indirizzo == indirizzo;
        }
        return false;
    }
}
