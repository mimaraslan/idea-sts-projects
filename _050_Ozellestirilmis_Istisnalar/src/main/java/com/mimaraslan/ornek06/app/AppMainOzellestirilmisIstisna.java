package com.mimaraslan.ornek06.app;

import com.mimaraslan.ornek06.model.Ogrenci;
import com.mimaraslan.ornek06.repository.OgrenciRepository;

public class AppMainOzellestirilmisIstisna {

    static OgrenciRepository ogrenciRepository =  new OgrenciRepository();
    public static void main(String[] args) {


        //v1
/*        OgrenciRepository ogrenciRepository =  new OgrenciRepository();
        ogrenciRepository.ogrenciEkle("Ünal", "Gani");
        ogrenciRepository.ogrenciEkle("Ahmet", "Akkoyun");
        ogrenciRepository.ogrenciEkle("Orhun", "Bayındır");
        ogrenciRepository.ogrenciEkle("Engin", "Ertikmen");
        ogrenciRepository.ogrenciEkle("Mehmet", "Caner");
        ogrenciRepository.ogrenciEkle("Burak", "Delice");
        ogrenciRepository.ogrenciEkle("Salih", "Polat");
        ogrenciRepository.ogrenciEkle("Osman", "Onur");
        ogrenciRepository.ogrenciEkle("Ali", "Güneş");
*/
        System.out.println("---------------------------");

        //v2
        ogrenciOlustur();

        ogrenciListesiGoster();

        System.out.println("---------------------------");

       // ogrenciRepository.ogrenciAra(8L) ;

        Ogrenci ogrenci = ogrenciRepository.ogrenciAraId(8L).get();
        System.out.println(ogrenci.getId() + " " + ogrenci.getAd() + " " + ogrenci.getSoyad());
        System.out.println("---------------------------");

        System.out.println(ogrenciRepository.ogrenciAraId(8L));

        System.out.println(ogrenciRepository.ogrenciAraId(8L).toString());

        System.out.println(ogrenciRepository.ogrenciAraId(8L).get());
        System.out.println("---------------------------");

        ogrenciRepository.ogrenciGuncelle(new Ogrenci(8L,"Gizem", "Kuşcuoğlu"));

        System.out.println("---------------------------");

        ogrenciListesiGoster();

        System.out.println("---------------------------");

    }



    private static void ogrenciOlustur() {
        ogrenciRepository.ogrenciEkle("Ünal", "Gani");
        ogrenciRepository.ogrenciEkle("Ahmet", "Akkoyun");
        ogrenciRepository.ogrenciEkle("Orhun", "Bayındır");
        ogrenciRepository.ogrenciEkle("Engin", "Ertikmen");
        ogrenciRepository.ogrenciEkle("Mehmet", "Caner");
        ogrenciRepository.ogrenciEkle("Burak", "Delice");
        ogrenciRepository.ogrenciEkle("Salih", "Polat");
        ogrenciRepository.ogrenciEkle("Osman", "Onur");
        ogrenciRepository.ogrenciEkle("Ali", "Güneş");
        ogrenciRepository.ogrenciEkle("Serkan", "Zorlu") ;
    }


    private static void ogrenciListesiGoster() {
     //   ogrenciRepository.getOgrenciListesi()
     //           .forEach(System.out::println);

        ogrenciRepository.getOgrenciListesi()
                .forEach(ogr -> System.out.println(
                        ogr.getId()+  " " +
                                ogr.getAd() + " " +
                                ogr.getSoyad() ));
    }

}
