package com.mimaraslan.javadate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateSinifi {

    public static void main(String[] args) {

        Date zaman = new Date();

        System.out.println("Zaman bilgisi: " + zaman);

        System.out.println("Milisaniye: " + zaman.getTime());

        //System.out.println("After  :" + zaman.after(zaman));
        //System.out.println("Before :" + zaman.before(zaman));

        System.out.println("Zaman hash : " + zaman.hashCode());



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        System.out.println("Gün: " + simpleDateFormat.format(zaman.getTime()) );

        simpleDateFormat = new SimpleDateFormat("MM");
        System.out.println("Ay : " + simpleDateFormat.format(zaman.getTime()) );

        simpleDateFormat = new SimpleDateFormat("yyyy");
        System.out.println("Yıl: " + simpleDateFormat.format(zaman.getTime()) );

    }
}
