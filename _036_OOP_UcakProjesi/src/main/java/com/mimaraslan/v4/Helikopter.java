package com.mimaraslan.v4;

public class Helikopter extends HavaAraci implements Kargo, Savas, Yolcu{

    float ustPervane;
    float arkaPervane;

    public void manevra(){
        System.out.println("Manevra yeteneği");
    }

    public Helikopter() {
        super();
    }

    @Override
    public String bilgiVer(String mesaj) {
        System.out.println(mesaj);
        return mesaj;
    }

    public Helikopter(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucmaDurumu,
                      float ustPervane, float arkaPervane) {
        super(uzunluk, yukseklik, hiz, agirlik, ucmaDurumu);
        this.ustPervane = ustPervane;
        this.arkaPervane = arkaPervane;
    }

    @Override
    public float agirlikDurumu(double yuk) {
        return (float) (yuk + 100)*2 ;
    }
}
