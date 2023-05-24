package com.mimaraslan.okul;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {

    // TODO miras yapılacak
    String ad;
    String soyad;
    String adres;
    String okulNo;
    List<Ders> dersListesi;
}
