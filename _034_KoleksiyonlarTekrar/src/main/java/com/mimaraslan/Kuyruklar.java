package com.mimaraslan;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kuyruklar {
    public static void main(String[] args) {

        Queue myPriorityQueueList1 = new PriorityQueue();
        myPriorityQueueList1.add("Aysu");   // 0
        myPriorityQueueList1.add("Serkan"); // 1
        myPriorityQueueList1.add("Gizem");  // 2
        myPriorityQueueList1.add("Ali");    // 3
     //    myPriorityQueueList1.add(null);     // 4 // null değeri girilmez!
     //   myPriorityQueueList1.add(null);     // 5
        myPriorityQueueList1.offer("Engin");  // 6
        System.out.println(myPriorityQueueList1);

        myPriorityQueueList1.peek();

        myPriorityQueueList1.clear();
     //   myPriorityQueueList1.remove();
        myPriorityQueueList1.poll();
        System.out.println(myPriorityQueueList1);


        System.out.println("-----------------------------");

        Deque myArrayDequeList1 = new ArrayDeque();
        myArrayDequeList1.add("Aysu");   // 0
        myArrayDequeList1.add("Serkan"); // 1
        myArrayDequeList1.add("Gizem");  // 2
        myArrayDequeList1.add("Ali");    // 3
        //    myArrayDequeList1.add(null);     // 4 // null değeri girilmez!
        //   myArrayDequeList1.add(null);     // 5
        myArrayDequeList1.offer("Engin");  // 6
        System.out.println(myArrayDequeList1);

        myArrayDequeList1.clear();
        //   myPriorityQueueList1.remove();
        myArrayDequeList1.poll();
        System.out.println(myArrayDequeList1);


    }
}
