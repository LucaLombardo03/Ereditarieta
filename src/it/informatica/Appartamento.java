package it.informatica;

public class Appartamento extends Abitazione{
    private int piano;
    private int numeroTerrazzi;
    private boolean ascensore;

    public Appartamento(int numeroStanze, int superficie, String indirizzo, String citta, int piano, int numeroTerrazzi, boolean ascensore){
        super(numeroStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.numeroTerrazzi = numeroTerrazzi;
        this.ascensore = ascensore;
    }

    @Override
    public String toString(){
        String finale = "Appartamento = [" + "indirizzo: " + super.getIndirizzo() + ", citta: " + super.getCitta() + ", numero stanze: " + super.getNumeroStanze() +
                ", superficie: " + super.getSuperficie() + ", piano: " + piano + ", numero terrazzi: " + numeroTerrazzi + ", ascensore: " + ascensore + "]";
        return finale;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Appartamento){
            Appartamento a = (Appartamento) obj;
            return this.numeroTerrazzi == a.numeroTerrazzi && this.ascensore == a.ascensore && this.piano == a.piano && super.equals(obj);
        }
        return false;
    }
}
