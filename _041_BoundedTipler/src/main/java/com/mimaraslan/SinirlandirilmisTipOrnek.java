package com.mimaraslan;

public class SinirlandirilmisTipOrnek
        <
                GelenTip1 extends Number,
                GelenTip2 extends String
                >
{

    GelenTip1 bilgi;

    public SinirlandirilmisTipOrnek(GelenTip1 bilgi) {
        this.bilgi = bilgi;
    }

    void yazdir(){
        System.out.println("Sınırlandırılmış Tip: "+ bilgi.getClass().getName());
      //  System.out.println("Sınırlandırılmış Tip");
    }

}
