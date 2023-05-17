package io.lolo;

public class AppMain {

    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        mudur.setAdi("Mehmet Caner");
        mudur.setSoyadi("Öksüz");
        mudur.setAdres("Berlin");
        mudur.setMudurDerecesi("Genel Müdür");
        mudur.setTahsisliPersonel("Lisans");
        mudur.setYoneticiDepartman("Büyükelçi");
        mudur.setGorevTazminati(1_000_000);
        mudur.setMaasKatSayi(50);
        mudur.setTc("12345678901");
        mudur.setYas(42);

        System.out.println("Adı Soyadı:"+ mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println(mudur.getMudurDerecesi());
        System.out.println(mudur.getYoneticiDepartman());
        System.out.println(mudur.getAdres());
        System.out.println(mudur.getTahsisliPersonel());
        System.out.println(mudur.getYas());
        System.out.println(mudur.getTc());

        System.out.println("---------------------------");
        Hizmetli hizmetli = new Hizmetli();
        int [] sorumlulukKatlari = new int[] {2,5,6,10};
        hizmetli.setKatGorevAlani(sorumlulukKatlari);

        System.out.println(hizmetli.getKatGorevAlani());

        System.out.println(hizmetli);

        for (int kat: hizmetli.getKatGorevAlani()) {
            System.out.print (kat + " ");
        }



    }
}
