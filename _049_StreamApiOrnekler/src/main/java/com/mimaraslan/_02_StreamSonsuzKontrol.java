package com.mimaraslan;

import java.util.stream.Stream;

public class _02_StreamSonsuzKontrol {

    public static void main(String[] args) {
/*
        Stream <Double> sonsuz1 = Stream.generate(Math::random);
        sonsuz1.forEach(System.out::println);

        Stream<Integer> sonsuz2 = Stream.iterate(1, n -> n+2);
        sonsuz2.forEach(System.out::println);
*/
        Stream<Integer> sonsuz3 = Stream.iterate(500_000   ,      n -> n< 501_501    ,     n -> n+100);
        sonsuz3.forEach(System.out::println);

    }
}
