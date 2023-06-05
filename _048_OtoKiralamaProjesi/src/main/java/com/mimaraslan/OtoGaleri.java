package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoGaleri implements IOtoGaleri {


    private  static final String FIRMA_ADI = "LOLO";

    private static List<Araba> arabalar = new ArrayList<>();
    private static List<Musteri> musteriler = new ArrayList<>();
    private static List<Kasiyer> karsiyerler = new ArrayList<>();
    private static List<Kiralama> kiralamalar = new ArrayList<>();


    public static void main(String[] args) throws OtoGaleriException {
        System.out.println(FIRMA_ADI + " Oto Galeri");

/*
        Musteri musteri1 = new Musteri(1, "Serkan");
        Musteri musteri2 = new Musteri(2, "Burak");
        Musteri musteri3 = new Musteri(3, "Osman");
        Musteri musteri4 = new Musteri(4, "Gizem");
*/

        OtoGaleri otoGaleri = new OtoGaleri();
        otoGaleri.arabaOlustur();
        otoGaleri.kasiyerOlustur();
        otoGaleri.musteriOlustur();

        listeyeEkle(musteriler, new Musteri(5, "Aminenur"));
        listeyeEkle(karsiyerler, new Kasiyer(4, "Abdullah", 33_000.0));
        listeyeEkle(arabalar, new Araba(11, "Toyota"));

        otoGaleri.kiralamaOlustur();



        otoGaleri.arabaAra();
        otoGaleri.kiralamaYap();
        otoGaleri.kiralananArabaListesi();
        otoGaleri.musteriAra();




    }



    private static <T> void listeyeEkle(List<T> gelenListe, T gelenNesne) {
        gelenListe.add(gelenNesne);
    }

    private void musteriOlustur() {
        Musteri musteri1 = new Musteri(1, "Serkan");
        Musteri musteri2 = new Musteri(2, "Burak");
        Musteri musteri3 = new Musteri(3, "Osman");
        Musteri musteri4 = new Musteri(4, "Gizem");
        listeyeEkle(musteriler, musteri1);
        listeyeEkle(musteriler, musteri2);
        listeyeEkle(musteriler, musteri3);
        listeyeEkle(musteriler, musteri4);
    }

    private void kasiyerOlustur(){
        Kasiyer kasiyer1 = new Kasiyer(1,"Salih", 30000.0);
        Kasiyer kasiyer2 = new Kasiyer(2,"Aysu", 40000.0);
        Kasiyer kasiyer3 = new Kasiyer(3,"Orhun", 35000.0);
        listeyeEkle(karsiyerler, kasiyer1);
        listeyeEkle(karsiyerler, kasiyer2);
        listeyeEkle(karsiyerler, kasiyer3);
    }

    private void arabaOlustur() {
/*
        Araba araba1 = new Araba(1, "Mercedes");
        Araba araba2 = new Araba(2, "BMW");
        Araba araba3 = new Araba(3, "Kartal");
        Araba araba4 = new Araba(4, "Doğan");
        Araba araba5 = new Araba(5, "Şahin");
        Araba araba6 = new Araba(6, "Passat");
        Araba araba7 = new Araba(7, "Volvo");
        Araba araba8 = new Araba(8, "Jaguar");
        Araba araba9 = new Araba(9, "Mazda");
        Araba araba10 = new Araba(10, "Togg");

        listeyeEkle(arabalar, araba1);
        listeyeEkle(arabalar, araba2);
        listeyeEkle(arabalar, araba3);
        listeyeEkle(arabalar, araba4);
        listeyeEkle(arabalar, araba5);
        listeyeEkle(arabalar, araba6);
        listeyeEkle(arabalar, araba7);
        listeyeEkle(arabalar, araba8);
        listeyeEkle(arabalar, araba9);
        listeyeEkle(arabalar, araba10);
*/

        listeyeEkle(arabalar, new Araba(1, "Mercedes"));
        listeyeEkle(arabalar, new Araba(2, "BMW"));
        listeyeEkle(arabalar, new Araba(3, "Kartal"));
        listeyeEkle(arabalar, new Araba(4, "Doğan"));
        listeyeEkle(arabalar, new Araba(5, "Şahin"));
        listeyeEkle(arabalar, new Araba(6, "Passat"));
        listeyeEkle(arabalar, new Araba(7, "Volvo"));
        listeyeEkle(arabalar, new Araba(8, "Jaguar"));
        listeyeEkle(arabalar, new Araba(9, "Mazda"));
        listeyeEkle(arabalar, new Araba(10, "Togg"));

    }

    private void kiralamaOlustur() {
        Kiralama kiralama1 = new Kiralama(1, karsiyerler.get(0), musteriler.get(0), arabalar.get(0));
        arabalar.get(0).setDurum(EDurum.KIRADA);

        Kiralama kiralama2 = new Kiralama(1, karsiyerler.get(1), musteriler.get(1), arabalar.get(1));
        arabalar.get(1).setDurum(EDurum.KIRADA);

        Kiralama kiralama3 = new Kiralama(1, karsiyerler.get(2), musteriler.get(2), arabalar.get(2));
        arabalar.get(2).setDurum(EDurum.KIRADA);

        Kiralama kiralama4 = new Kiralama(1, karsiyerler.get(0), musteriler.get(3), arabalar.get(3));
        arabalar.get(3).setDurum(EDurum.KIRADA);

        Kiralama kiralama5 = new Kiralama(1, karsiyerler.get(3), musteriler.get(4), arabalar.get(7));
        arabalar.get(7).setDurum(EDurum.KIRADA);

        Kiralama kiralama6 = new Kiralama(1, karsiyerler.get(0), musteriler.get(0), arabalar.get(10));
        arabalar.get(10).setDurum(EDurum.KIRADA);

        listeyeEkle(kiralamalar, kiralama1);
        listeyeEkle(kiralamalar, kiralama2);
        listeyeEkle(kiralamalar, kiralama3);
        listeyeEkle(kiralamalar, kiralama4);
        listeyeEkle(kiralamalar, kiralama5);
        listeyeEkle(kiralamalar, kiralama6);
    }


    @Override
    public boolean kiralamaYap() throws OtoGaleriException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kasiyer id : ");
        int kasiyerId = Integer.parseInt(scanner.nextLine());

        System.out.println("----------------------------------");

        System.out.print("Müşteri id : ");
        int musteriId = Integer.parseInt(scanner.nextLine());

        System.out.println("----------------------------------");

        System.out.println("Kirada olmayan arabalar");
        /*

        1. Değişkenler  int Integer
        2. Diziler  sabit  10 tane 5 tane
        3. Listeler (esnet dizi) istediğim kadar ekleme çıkarma yapabiliyorum.
        4. Akış (Stream)  - üzerinde daha kolay iş yapabilmek için. (Lambda söz dizimi)
        */

        arabalar.stream()
                .filter(arabaParametresi -> arabaParametresi.getDurum().equals(EDurum.GALERIDE))
                .forEach(sonucParametresi ->  {
                    System.out.println(sonucParametresi.getId() + " - " + sonucParametresi.getIsim() + " - " + sonucParametresi.getDurum());
                } );

        System.out.println("Lütfen bir seçim yapınız");
        int arabaId = Integer.parseInt(scanner.nextLine());
        Araba araba = arabalar.get(arabaId - 1);

        return false;
    }

    @Override
    public Araba arabaAra() throws OtoGaleriException {
        return null;
    }

    @Override
    public Musteri musteriAra() throws OtoGaleriException {
        return null;
    }

    @Override
    public List<Araba> kiralananArabaListesi() throws OtoGaleriException {
        return null;
    }
}