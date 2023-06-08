package com.mimaraslan.ornek06.app;

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
    }


    private static void ogrenciListesiGoster() {
    }

}
