package io.lolo.v1;

public class Muhendis  extends Personel {

    private String temelBeceri;
    private String calismaSekli;
    private long gorevTazminati;

    public String getTemelBeceri() {
        return temelBeceri;
    }

    public void setTemelBeceri(String temelBeceri) {
        this.temelBeceri = temelBeceri;
    }

    public String getCalismaSekli() {
        return calismaSekli;
    }

    public void setCalismaSekli(String calismaSekli) {
        this.calismaSekli = calismaSekli;
    }

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }
}
