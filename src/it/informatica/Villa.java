package it.informatica;

public class Villa extends Abitazione{
    private int numeroPiani;
    private double superficieGiardino;
    private boolean piscina;

    public Villa(int numeroStanze, int superficie, String indirizzo, String citta, int numeroPiani, double superficieGiardino, boolean piscina){
        super(numeroStanze, superficie, indirizzo, citta);
        this.numeroPiani = numeroPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    @Override
    public String toString(){
        String finale = "Villa = [" + "indirizzo: " + super.getIndirizzo() + ", città: " + super.getCitta() + ", numero stanze: " + super.getNumeroStanze() + "," +
                " superficie: " + super.getSuperficie() + ", numero piani: " + numeroPiani + ", superficie giardni: " + superficieGiardino + ", piscina: " + piscina +
                "]";
        return finale;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Villa){
            Villa v = (Villa) obj;
            return this.numeroPiani == v.numeroPiani && this.superficieGiardino == superficieGiardino && this.piscina == piscina && super.equals(obj);
        }
        return false;
    }
}
