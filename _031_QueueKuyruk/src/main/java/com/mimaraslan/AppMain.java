package com.mimaraslan;

import java.util.PriorityQueue;
import java.util.Queue;

public class AppMain {

    public static void main(String[] args) {

        Queue queue1 = new PriorityQueue();
        queue1.add(100);
        queue1.add(150);
        System.out.println(queue1);

        Queue queue2 = new PriorityQueue();
        queue2.add("Aysu");
        queue2.add("Gizem");
        System.out.println(queue2);

        Queue queue3 = new PriorityQueue();
        queue3.add(3.14);
        queue3.add(5.18);
        System.out.println(queue3);

        Queue queue4 = new PriorityQueue();
        queue4.add(Boolean.TRUE);
        queue4.add(Boolean.FALSE);
        System.out.println(queue4);

    }
}
