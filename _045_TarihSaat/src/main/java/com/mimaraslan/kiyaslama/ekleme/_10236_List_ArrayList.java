package com.mimaraslan.kiyaslama.ekleme;

import java.util.ArrayList;
import java.util.List;

public class _10236_List_ArrayList {

    public static void main(String[] args) {

        long start_time1 = System.currentTimeMillis();

        List<String> myRecord = new ArrayList<>();

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
