package com.caneroksuz;

import com.caneroksuz.controller.EvController;
import com.caneroksuz.controller.KiralamaController;
import com.caneroksuz.controller.KisiController;
import com.caneroksuz.model.Ev;
import com.caneroksuz.model.Kiralama;
import com.caneroksuz.model.Kisi;
import com.caneroksuz.model.enums.EEvStatus;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class AppMain {
    static Scanner scanner = new Scanner(System.in);
    static EvController evController;
    static KiralamaController kiralamaController;
    static KisiController kisiController;

    public AppMain() {
        this.evController = new EvController();
        this.kiralamaController = new KiralamaController();
        this.kisiController = new KisiController();
    }

    public static void main(String[] args) {

        AppMain appMain = new AppMain();
        appMain.anaMenu();

        //FIXME - menuleri tassi
        /*
        AppMenu appMenu = new AppMenu();
        appMenu.anaMenu();
         */

    }

    private void anaMenu() {

        int secim =0;

        do {
            System.out.println("1- Ev Ekle");
            System.out.println("2- Ev Ara");
            System.out.println("3- Kişi Ekle");
            System.out.println("4- Ev Kirala");
            System.out.println("5- Rapor");
            System.out.println("0- Çıkış");

            secim= scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Ev Ekle seçildi..");
                    evEkle();
                    break;

                case 2:
                    System.out.println("Ev Ara seçildi..");
                    evAra();
                    break;

                case 3:
                    System.out.println("Kisi Ekle seçildi..");
                    kisiEkle();
                    break;

                case 4:
                    System.out.println("Ev Kirala seçildi..");
                    evKirala();
                    break;

                case 5:
                    System.out.println("Rapor seçildi..");
                    rapor();
                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    break;
            }

        }while (secim!=0);
    }




    private static void evEkle() {
/*        Ev ev = Ev.builder()
                .durum(EEvStatus.MUSAIT)
                .kat(3)
                .semt("Ayrancı")
                .yapimYili(LocalDate.now())
                .tur("Rezidans")
                .build();*/

        System.out.println("Lütfen kat sayısını giriniz");
        int kat = scanner.nextInt();

        System.out.println("Lütfen yapım yılını giriniz");
        int sene = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Lütfen türü giriniz");
        String tur = scanner.nextLine();



        Ev ev = Ev.builder()
                .kat(kat)
                .yapimYili(LocalDate.of(sene,1,1))
                .tur(tur)
                .build();

        evController.evOlustur(ev);
    }
    private static void evAra() {

        System.out.println("Lütfen ev id sini giriniz");
        Long id = scanner.nextLong();

        Ev ev = evController.evAraById(id);
        System.out.println(ev);
    }
    private static void evKirala() {

        System.out.println("Lütfen ev id sini giriniz");
        Long id = scanner.nextLong();

        Ev ev = evController.evAraById(id);
        ev.setDurum(EEvStatus.KIRADA);
        System.out.println("EV BİLGİSİ: " + ev);


        System.out.println("Lütfen kiralamak isteyen kisi id sini giriniz");
        Long kisiId = scanner.nextLong();

        Kisi kisi = kisiController.kisiAraById(kisiId);
        System.out.println("KİŞİ BİLGİSİ:" + kisi);


        Kiralama kiralama = Kiralama.builder()
                .ev(ev)
                .kisi(kisi)
                .build();

        kiralamaController.kiralamaOlustur(kiralama);
    }

    private static void kisiEkle() {
        scanner.nextLine();

        System.out.println("Lütfen isminizi giriniz: ");
        String ad = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyad = scanner.nextLine();

        System.out.println("Lütfen tc nizi giriniz");
        String tc = scanner.nextLine();

      //  scanner.nextLine();

        Kisi kisi = Kisi.builder()
                .ad(ad)
                .soyad(soyad)
                .tcNo(tc)
                .build();

        kisiController.kisiOlustur(kisi);
    }
    private static void rapor() {

        int secim =0;

        do {
            System.out.println("1- Şuan Kirada olan Evler");
            System.out.println("2- Boşta müsait olan Evler");
            System.out.println("3- Herhangi bir müşterinin kiraladığı Evler");

            secim= scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Şuan Kirada olan Evler");
                    kiradakiEvler();
                    break;

                case 2:
                    System.out.println("Boşta müsait olan Evler");
                    musaitEvler();
                    break;

                case 3:
                    System.out.println("Herhangi bir müşterinin kiraladığı Evler");
                    herhangiBirMusterininKiraladigiEvler();
                    break;


                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    break;
            }

        }while (secim!=0);
    }

    private static void kiradakiEvler() {
        System.out.println(evController.kiradakiEvler());
    }

    private static void musaitEvler() {
        System.out.println(evController.musaitEvler());
    }

    private static void herhangiBirMusterininKiraladigiEvler() {
    }


}