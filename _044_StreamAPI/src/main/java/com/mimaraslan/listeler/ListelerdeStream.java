package com.mimaraslan.listeler;

import java.util.List;
import java.util.stream.Stream;

public class ListelerdeStream {

    public static void main(String[] args) {

        Stream <String> bosKayit =  Stream.empty();
        Stream <String> tekKayit = Stream.of("Gizem");
        Stream <Double> virgulluSayilar = Stream.of(2.0, 3.0);

        List<String> gunler = List.of("Pzt", "Sal", "Çrş");
        Stream<String> gunlerStream = gunler.stream();
        System.out.println(gunlerStream.count());
    }
}
