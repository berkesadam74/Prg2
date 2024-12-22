import java.util.Arrays;
import java.util.Random;

public class Pole {
    private int pole[];
    private int n;

    public Pole(int n) {
        pole = new int[n];
        this.n = n;
    }

    private void zorad() {
        Arrays.sort(pole);
    }

    public void napln() {
        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            pole[i] = rand.nextInt(n) + 1;
        }
        zorad();
    }

    public void vypis() {
        for(int i = 0; i < n - 1; i++) {
            System.out.print(pole[i] + ", ");
        }
        System.out.print(pole[n - 1]);
    }
}