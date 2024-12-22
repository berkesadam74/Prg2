public class Hlavna {
    public static void main(String[] args) {
        Zlomok a = new Zlomok(3, 4);
        Zlomok b = new Zlomok(5, 8);

//        a.vypis();
//        b.vypis();

        Zlomok c = a.scitaj(b);
        c.vypis();
    }
}
