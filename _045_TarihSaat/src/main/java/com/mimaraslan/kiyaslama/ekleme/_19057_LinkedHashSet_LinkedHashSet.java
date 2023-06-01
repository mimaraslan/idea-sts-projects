package com.mimaraslan.kiyaslama.ekleme;

import java.util.LinkedHashSet;

public class _19057_LinkedHashSet_LinkedHashSet {
    public static void main(String[] args) {
        long start_time1 = System.currentTimeMillis();

        LinkedHashSet<String> myRecord = new LinkedHashSet<>();

        for (int i = 0; i < 100_000_000; i++) {
            myRecord.add("" + i);
        }

      /*  for (String str : myRecord) {
            // System.out.println(str);
        }
        */

        long end_time1 = System.currentTimeMillis();
        System.out.println(end_time1 - start_time1);
    }
}
