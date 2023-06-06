package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class _03_StreamDiziDonusum {
    public static void main(String[] args) {

        var kelimeDizisi = new String[] {"S", "a", "l", "i", "h"};

        String sonucToplam ="";
        for ( String kelime: kelimeDizisi ) {
          //  sonucToplam = sonucToplam + kelime;
            sonucToplam += kelime;
            System.out.println(kelime);
        }

        System.out.println(sonucToplam);

        System.out.println("--------------------------");

        Stream <String> streamIfade = Stream.of("S", "a", "l", "i", "h");
        String yeniIfade = streamIfade.reduce("", (mevcutIsim, sonrakiIsim) -> mevcutIsim + sonrakiIsim);
        System.out.println(yeniIfade);

        System.out.println("--------------------------");

        Stream <String> isimListesi = Stream.of("Salih", "Gizem", "Abdullah", "Ali", "Ahmet");

        Optional<String> enKisaIsim = isimListesi.min((mevcutIsim, sonrakiIsim) -> mevcutIsim.length() - sonrakiIsim.length());
        enKisaIsim.ifPresent(System.out::println);

        System.out.println("--------------------------");

        Stream<String> isimListesiArama = Stream.of("Ünal","Gani","Salih", "Gizem", "Abdullah", "Ali", "Ahmet", "Aysu");
      //  isimListesiArama.filter(ara -> ara.contains("a")).forEach(System.out::println);
      //  isimListesiArama.filter(ara -> ara.contains("i")).forEach(System.out::println);
        isimListesiArama.filter(ara -> ara.length()==4).forEach(System.out::println);

        System.out.println("--------------------------");

        List<Personel> personelList = new ArrayList<Personel>();
/*        personelList.add(new Personel(1, "Ahmet", "Akkoyun"));
        personelList.add(new Personel(2, "Ali", "Güneş"));
        personelList.add(new Personel(3, "Ünal Gani", "Berk"));
        personelList.add(new Personel(4, "Osman Onur", "Baş"));
        personelList.add(new Personel(5, "Aminenur", "Göynük"));
*/
        personelList.add(new Personel("Ahmet", "Akkoyun"));
        personelList.add(new Personel("Ali", "Güneş"));
        personelList.add(new Personel("Ünal Gani", "Berk"));
        personelList.add(new Personel("Osman Onur", "Baş"));
        personelList.add(new Personel("Aminenur", "Göynük"));

        personelList
                .stream()
                .filter(p ->   p.getAd().contains("i")  &&  p.getSoyad().length()>4 )
                .forEach(System.out::println);

    }
}
