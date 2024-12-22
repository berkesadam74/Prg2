import java.util.ArrayList;

public class Kniha {
    private String nazov;
    private String autor;
    private int rokVydania;
    private ArrayList<Kapitola> kapitoly;

    public Kniha (String nazov, String autor, int rokVydania, int pocetKapitol) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
        this.kapitoly = new ArrayList<>();

        for(int i = 1; i <= pocetKapitol; i++) {
            kapitoly.add(new Kapitola("Kapitola " + i, ""));
        }
    }

    public void nastavNazovObsah(int index, String nazov, String obsah) {
        if (index >= 0 && index < kapitoly.size()) {
            kapitoly.get(index).setNazov(nazov);
            kapitoly.get(index).setObsah(obsah);
        } else {
            System.out.println("Neplatny index kapitoly.");
        }
    }

    public int spocitajPismena() {
        System.out.println();
        System.out.println("***************************");
        int pocetZnakov = 0;
        for (Kapitola kapitola : kapitoly) {
            pocetZnakov += kapitola.getObsah().length();
        }
        return pocetZnakov;
    }

    public void zobraz() {
        System.out.println();
        System.out.println("***************************");
        System.out.println("Kniha: " + nazov);
        System.out.println("Autor: " + autor);
        System.out.println("Rok vydania: " + rokVydania);
        System.out.println("Kapitoly:");
        for (Kapitola kapitola: kapitoly) {
            System.out.println("- " + kapitola.getNazov());
            System.out.println(kapitola.getObsah());
        }
    }

    public String getNazov() {
        return nazov;
    }

    public String getAutor() {
        return autor;
    }
}
