package it.informatica;

public class Tester {
    public static void main (String [] args){
        Abitazione abitazione1 = new Abitazione(5,150,"Via Corsica", "Brescia");
        Abitazione abitazione2 = new Abitazione(5,150,"Via Corsica", "Brescia");
        Abitazione villa1 = new Villa(5,150,"Via Corsica", "Brescia", 5, 200, true);
        Abitazione villa2 = new Villa(5,150,"Via Corsica", "Brescia", 5, 200, true);
        Abitazione appartamento1 = new Appartamento(5,150,"Via Corsica", "Brescia", 3, 1, true);
        Abitazione appartamento2 = new Appartamento(5,150,"Via Corsica", "Brescia", 3, 1, true);

        Paese paese = new Paese("Brescia", "Italia", 100);
        paese.aggiungiAbitazione(appartamento1);
        paese.aggiungiAbitazione(appartamento2);

        System.out.println(paese.toString());

        System.out.println(abitazione1.toString());
        System.out.println(abitazione2.toString());

        System.out.println(villa1.toString());
        System.out.println(villa2.toString());

        System.out.println(appartamento1.toString());
        System.out.println(appartamento2.toString());

        System.out.println(abitazione1.equals(abitazione2));
        System.out.println(villa1.equals(villa2));
        System.out.println(appartamento1.equals(appartamento2));

        System.out.println(abitazione1.equals(villa2));
        System.out.println(abitazione2.equals(appartamento1));
        System.out.println(appartamento2.equals(villa1));
    }
}
