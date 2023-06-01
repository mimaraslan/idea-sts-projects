package com.mimaraslan.javacalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarSinifi {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        System.out.println("Gün: " + simpleDateFormat.format(calendar.getTime()) );

         simpleDateFormat = new SimpleDateFormat("MM");
        System.out.println("Ay : " + simpleDateFormat.format(calendar.getTime()) );

         simpleDateFormat = new SimpleDateFormat("yyyy");
        System.out.println("Yıl: " + simpleDateFormat.format(calendar.getTime()) );

    }
}
