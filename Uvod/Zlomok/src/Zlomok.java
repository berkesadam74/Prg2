public class Zlomok {
    private int citatel;
    private int menovatel;

    public Zlomok (int citatel, int menovatel) {
        if (menovatel == 0) {
            throw new IllegalArgumentException("Menovatel nemoze byt 0!");
        }
        this.citatel = citatel;
        this.menovatel = menovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getMenovatel() {
        return menovatel;
    }

    public void vypis() {
        System.out.println(citatel);
        System.out.println("-");
        System.out.println(menovatel);
    }

    public Zlomok scitaj (Zlomok b) {
        int novyCitatel;
        int novyMenovatel;
        if (b.getMenovatel() == menovatel) {
            novyCitatel = b.getCitatel() + citatel;
            novyMenovatel = menovatel;
        } else {
            novyMenovatel = b.getMenovatel() * menovatel;
            novyCitatel = (menovatel * b.getCitatel()) + (b.getMenovatel() * citatel);
        }
        Zlomok vysledok = new Zlomok(novyCitatel, novyMenovatel);
        vysledok.zjednodusenie();
        return vysledok;
    }

    public void zjednodusenie() {
        int gcd = gcd(citatel, menovatel);
        citatel /= gcd;
        menovatel /= gcd;
    }

    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
