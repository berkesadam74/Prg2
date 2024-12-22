import java.util.ArrayList;

public class Kniznica {
    private String nazov;
    private String adresa;
    private ArrayList<Kniha> knihy;

    public Kniznica(String nazov, String adresa) {
        this.nazov = nazov;
        this.adresa = adresa;
        knihy = new ArrayList<>();
    }

    public void pridajKnihu(Kniha kniha) {
        knihy.add(kniha);
    }

    public void vypisKnihy() {
        System.out.println();
        System.out.println("***************************");
        System.out.println("Aktualne knihy v kniznici");
        for (Kniha kniha: knihy) {
            System.out.println("Kniha: " + kniha.getNazov() + " od autora: " + kniha.getAutor());
        }
    }
}
