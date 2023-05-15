package com.mimaraslan.tekrar;

public class _02_Operatorler {

    public static void main(String[] args) {
       /*

        int s1;
        s1=10;

        int s2;
        s2=4;

        */

        int s1 = 10,  s2 = 4;
        float sonuc;
        sonuc = s1 + s2;
        System.out.println(sonuc);

        sonuc = s1 - s2;
        System.out.println(sonuc);

        sonuc = s1 * s2;
        System.out.println(sonuc);

        sonuc = (float) s1 / s2;
        System.out.println(sonuc);

                // 2.5  + 10.0
        //sonuc = sonuc + s1;
         sonuc += s1;
        System.out.println(sonuc); // 12.5


        //sonuc = sonuc + 1;
        sonuc++;
        System.out.println(sonuc); // 13.5

        ++sonuc;
        System.out.println(sonuc); // 14.5


        String kullanici = "Mehmet";
        String parola = "123";

        boolean onay = (kullanici == "Mehmet");
        System.out.println(onay);

                        //    true              ve   true
        boolean onay2 = ((kullanici == "Mehmet") && (parola == "123"));
        System.out.println(onay2);






    }
}
