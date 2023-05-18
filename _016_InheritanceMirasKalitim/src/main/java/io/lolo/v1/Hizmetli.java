package io.lolo.v1;

import java.util.Arrays;

public class Hizmetli extends Personel {

    private int [] katGorevAlani;
    private long gorevTazminati;

    public int[] getKatGorevAlani() {
        return katGorevAlani;
    }

    public void setKatGorevAlani(int[] katGorevAlani) {
        this.katGorevAlani = katGorevAlani;
    }

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }


    @Override
    public String toString() {
        return "Hizmetli{" +
                "katGorevAlani=" + Arrays.toString(katGorevAlani) +
                '}';
    }
}
