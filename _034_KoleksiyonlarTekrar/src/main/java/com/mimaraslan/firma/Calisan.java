package com.mimaraslan.firma;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Calisan {

   private int id, yasi;
   private String adi, soyadi, adres;


   public static void getCalisanDetay(ArrayList<Calisan> calisanlarinListesi){
      for (int i = 0; i < calisanlarinListesi.size(); i++) {
         System.out.println(calisanlarinListesi.get(i).getId());
         System.out.println(calisanlarinListesi.get(i).getAdi());
         System.out.println(calisanlarinListesi.get(i).getSoyadi());
         System.out.println(calisanlarinListesi.get(i).getYasi());
         System.out.println(calisanlarinListesi.get(i).getAdres());
         System.out.println("-------------------------");
      }
   }

   @Override
   public String toString() {
      return "Calisan{" +
              "id=" + id +
              ", yasi=" + yasi +
              ", adi='" + adi + '\'' +
              ", soyadi='" + soyadi + '\'' +
              ", adres='" + adres + '\'' +
              '}';
   }
}
