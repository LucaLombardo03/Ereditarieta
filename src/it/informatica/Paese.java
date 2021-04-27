package it.informatica;

import java.util.Arrays;

public class Paese {
    private String nome;
    private String stato;
    private int nCase;
    private Appartamento [] appartamento;
    private Abitazione [] abitazione;
    private Villa [] villa;
    private int cont = 0;

    public Paese(String nome, String stato, int nCase){
        this.nome = nome;
        this.stato = stato;
        this.nCase = nCase;
        this.appartamento = new Appartamento[nCase];
        this.abitazione = new Abitazione[nCase];
        this.villa = new Villa[nCase];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public int getnCase() {
        return nCase;
    }

    public void setnCase(int nCase) {
        this.nCase = nCase;
    }

    public Appartamento[] getAppartamento() {
        return appartamento;
    }

    public void setAppartamento(Appartamento[] appartamento) {
        this.appartamento = appartamento;
    }

    public Abitazione[] getAbitazione() {
        return abitazione;
    }

    public void setAbitazione(Abitazione[] abitazione) {
        this.abitazione = abitazione;
    }

    public Villa[] getVilla() {
        return villa;
    }

    public void setVilla(Villa[] villa) {
        this.villa = villa;
    }

    @Override
    public String toString() {
        return "Paese{" +
                "nome='" + nome + '\'' +
                ", stato='" + stato + '\'' +
                ", nCase=" + nCase +
                ", appartamento=" + Arrays.toString(appartamento) +
                ", abitazione=" + Arrays.toString(abitazione) +
                ", villa=" + Arrays.toString(villa) +
                '}';
    }

    public void aggiungiAbitazione(Abitazione abitazione){
        if(cont < this.abitazione.length){
            this.abitazione[cont] = abitazione;
            cont++;
        }
    }
}
