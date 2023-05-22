package com.mimaraslan.arac;

import com.mimaraslan.personel.Surucu;
import lombok.Getter;
import lombok.Setter;

 @Getter
 @Setter
public class Arac {

   private String plakaNo;
   private Integer model;
   private int tekerSayisi;
   private int koltukSayisi;
   private Surucu surucu;

    void hareketEt(){
        System.out.println("Arac.hareketEt");
    }


     @Override
     public String toString() {
         return "Arac{" +
                 "plakaNo='" + plakaNo + '\'' +
                 ", model=" + model +
                 ", tekerSayisi=" + tekerSayisi +
                 ", koltukSayisi=" + koltukSayisi +
                 ", surucu=" + surucu +
                 '}';
     }
 }
