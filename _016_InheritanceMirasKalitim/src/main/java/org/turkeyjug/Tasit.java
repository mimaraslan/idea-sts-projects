package org.turkeyjug;

public class Tasit {
    
    private int tekerSayisi;

    public Tasit() {
    }

    public Tasit(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }

    void yazdir(){
        System.out.println("Taşıt sınıfı");
    }



}
