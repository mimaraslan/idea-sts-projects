package com.mimaraslan.ornek07future;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class AppMain {


    private static long baslangic;

    public static void main(String[] args) {

        baslangic = System.currentTimeMillis();

        Runnable runnable1 = () -> {
            System.out.println("1. Yapilacak Gorev");
            System.out.println("Sure : " +   (System.currentTimeMillis() - baslangic)  );
        };

        Runnable runnable2 = () -> {
            System.out.println("2. Yapilacak Gorev");
            System.out.println("Sure : " +   (System.currentTimeMillis() - baslangic)  );
        };


        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> scheduledFuture1 = scheduledExecutorService.schedule(runnable1, 8, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture2 = scheduledExecutorService.schedule(runnable2, 3, TimeUnit.SECONDS);

    }
}
