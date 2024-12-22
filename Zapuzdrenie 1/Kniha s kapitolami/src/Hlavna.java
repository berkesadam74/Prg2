public class Hlavna {
    public static void main(String[] args) {
        Kniznica kniznica1 = new Kniznica("Mestská knižnica", "Hlavná 123, Bratislava");

        Kniha kniha1 = new Kniha("Programovanie v Jave", "Adam Berkes", 2024, 3); kniha1.nastavNazovObsah(0, "Uvod", "Toto je uvodna kapitola.");
        kniha1.nastavNazovObsah(1, "Zaklady", "V tejto kapitole sa naucite zaklady.");
        kniha1.nastavNazovObsah(2, "Pokrocile temy", "V tejto kapitole sa pozrieme na pokrocile temy.");

        Kniha kniha2 = new Kniha("História sveta", "Jožo Novák", 1998, 2);
        kniha2.nastavNazovObsah(0, "Stredovek", "Toto je obsah o stredoveku.");
        kniha2.nastavNazovObsah(1, "Renesancia", "Toto je obsah o renesancii.");

        kniznica1.pridajKnihu(kniha1);
        kniznica1.pridajKnihu(kniha2);


        kniha1.zobraz();
        System.out.println("Celkovy pocet znakov v knihe: " + kniha1.spocitajPismena());

        kniha2.zobraz();

        kniznica1.vypisKnihy();
    }
}
