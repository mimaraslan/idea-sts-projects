package com.mimaraslan.okul;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sinif {

   int sirasSayi;
   boolean projeksiyon;
   boolean akilliTahta;
   String subeNo;      //  101-Aziz Sancar  201- İlber Ortaylı
   List<Ogrenci> ogrenciListesi;
   List<Ogretmen> ogretmenListesi;

}
