package com.mimaraslan.solidprensibleri;

import com.mimaraslan.solidprensibleri.rapor.musteri.MusteriRaporExcel;

import java.util.ArrayList;

public class AppMain {
    /*
Single Responsibility (Tekil Sorumluluk):
Bir nesnenin veya metodun sadece bir tane sorumluluğu olmalıdır.

Open/Closed (Açık / Kapalılık):
Nesnemiz veya metodumuz geliştirilmeye açık, ama değişikliğe de kapalı olmalıdır.

Liskov Substitution (Yerine Geçme):
Child olan bir nesnenin parent yerine geçtiği durumunda parent sınıfın özelliklerinin tamamını kullanabiliyor olmalıdır.

Interface Segregation (Arayüz Ayırma):
Sorumluluklar tek bir interface'de değil daha küçük ve anlamlı parçalara bölünmesi gereklidir.

Dependency Inversion (Bağımlılığı Tersine Çevirme):
Bir sınıfın bir başka sınıfa doğrudan bağlı olmaması yerine abstraction üzerinden bağımlılıkların yönetilmesi gerekir.

    */


    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        musteri.setAdi("Ünal");
        musteri.setSoyadi("Gani");

        Adres adres = new Adres();
        adres.setSehir("Adana");
        adres.setCadde("Seyhan");
        adres.setSokak("Ceyhan");

        Adres adres2 = new Adres();
        adres2.setSehir("Anakra");
        adres2.setCadde("Aşağı Ayrancı");
        adres2.setSokak("Yukarı Ayrancı");

        ArrayList<Adres> adresler = new ArrayList<>();
        adresler.add(adres);
        adresler.add(adres2);

        musteri.setAdresListesi(adresler);


        System.out.println(musteri);


        MusteriRaporExcel musteriRaporExcel = new MusteriRaporExcel();
        musteriRaporExcel.mustreriRaporBilginiNotEt(musteri);
        musteriRaporExcel.mustreriRaporExcel(musteri);

    }
}
