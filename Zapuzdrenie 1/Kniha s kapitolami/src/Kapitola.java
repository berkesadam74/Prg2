public class Kapitola {
    private String nazov;
    private String obsah;

    public Kapitola(String nazov, String obsah) {
        this.nazov = nazov;
        this.obsah = obsah;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getObsah() {
        return obsah;
    }

    public void setObsah(String obsah) {
        this.obsah = obsah;
    }
}
