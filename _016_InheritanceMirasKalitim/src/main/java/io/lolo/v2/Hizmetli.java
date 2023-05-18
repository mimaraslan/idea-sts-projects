package io.lolo.v2;

import java.util.Arrays;

public class Hizmetli extends Personel{

    private int [] katGorevAlani;


    public int[] getKatGorevAlani() {
        return katGorevAlani;
    }

    public void setKatGorevAlani(int[] katGorevAlani) {
        this.katGorevAlani = katGorevAlani;
    }


    @Override
    public String toString() {
        return "Hizmetli{" +
                "katGorevAlani=" + Arrays.toString(katGorevAlani) +
                '}';
    }
}
