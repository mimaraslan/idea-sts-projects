package com.mimaraslan.tarihkarsilastirmasi;

import java.time.LocalDate;
import java.util.Date;

public class TarihKarilastirmasi {

    public static void main(String[] args) {


        Date date1 = new Date(2000, 1, 1);
        Date date2 = new Date(2000, 1, 1);
        System.out.println(date1.compareTo(date2));

        LocalDate ld1 = LocalDate.parse("2019-02-11");
        LocalDate ld2 = LocalDate.parse("2019-02-11");
        System.out.println("The first LocalDate object is: " + ld1);
        System.out.println("The second LocalDate object is: " + ld2);
        int val = ld1.compareTo(ld2);
        System.out.println("DURUM: "+ val);

        if(val > 0)
            System.out.println("The first LocalDate object is greater than the second LocalDate object");
        else if(val < 0)
            System.out.println("The first LocalDate object is lesser than the second LocalDate object");
        else
            System.out.println("The LocalDate objects are equal");



    }
}
