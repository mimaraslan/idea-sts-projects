package com.mimaraslan.v3;

public class Helikopter extends HavaAraci {

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
}
