package com.mimaraslan;

import com.mimaraslan.okul.Ders;
import com.mimaraslan.okul.Ogrenci;
import com.mimaraslan.okul.Ogretmen;
import com.mimaraslan.okul.Sinif;
import com.mimaraslan.utils.Branslar;
import com.mimaraslan.utils.Dersler;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAd("Aminenur");
        ogretmen.setSoyad("Göynük");
        ogretmen.setAdres("Ankara");
        ogretmen.setBrans(Branslar.Matematik);
        ogretmen.setTelefon("0123456789");

        Ogretmen ogretmen2 = new Ogretmen("Aysu", "Çağışlar",
                "0987654321", "İzmir", Branslar.Ingilizce);

        List<Ogretmen> ogretmenList = new ArrayList<>();
        ogretmenList.add(ogretmen); // 0
        ogretmenList.add(ogretmen2); // 1
        //----------------------------------------------

        List <Ders> dersList = new ArrayList<>();
        dersList.add(new Ders(Dersler.Geometri,  ogretmenList.get(0), 0,  0)); // 0
        dersList.add(new Ders(Dersler.Matematik, ogretmen, 0,  0)); // 1
        dersList.add(new Ders(Dersler.Ingilizce, ogretmen2, 0,  0)); // 2
        //----------------------------------------------

        List <Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(new Ogrenci("Mehmet", "Caner", "Çanakkale", "123",
                dersList)); // 0
        ogrenciList.add(new Ogrenci("Orhun", "Bayırdır", "Adana", "101",
                dersList.subList(1,2))); // 1
        //----------------------------------------------

        Sinif sinif = new Sinif(20, true, false, "101-Aziz Sancar",
                ogrenciList, ogretmenList);
        System.out.println(sinif.getSubeNo());
        System.out.println(sinif.getOgrenciListesi().get(0).getAd());
        System.out.println(sinif.getOgrenciListesi().get(0).getSoyad());
        System.out.println(sinif
                .getOgrenciListesi().get(0)
                .getDersListesi().get(0)
                .getOgretmen().getBrans());

        System.out.println(sinif.getOgretmenListesi().get(0).getAd());
        System.out.println(sinif.getOgretmenListesi().get(0).getSoyad());



    }
}
