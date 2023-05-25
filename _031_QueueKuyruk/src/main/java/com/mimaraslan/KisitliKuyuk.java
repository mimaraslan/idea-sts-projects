package com.mimaraslan;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class KisitliKuyuk {
    public static void main(String[] args) {

        Queue <String> kisitliKuyruk = new ArrayBlockingQueue<>(3);

        kisitliKuyruk.add("Ali"); // 0
        kisitliKuyruk.add("Aysu"); // 1
        kisitliKuyruk.add("Aminenur"); // 2
    //    kisitliKuyruk.add("Serkan"); // 3
   //     kisitliKuyruk.add("Orhun"); // 4
        kisitliKuyruk.offer("Burak");

        System.out.println(kisitliKuyruk);

        System.out.println(kisitliKuyruk.poll());
        System.out.println(kisitliKuyruk);


        //System.out.println(kisitliKuyruk.peek());

    }
}
