package com.mimaraslan;


import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        List<String> myArrayList1 = new ArrayList();
        myArrayList1.add("Aysu");   // 0
        myArrayList1.add("Serkan"); // 1
        myArrayList1.add("Gizem");  // 2
        myArrayList1.add("Ali");    // 3
        System.out.println(myArrayList1.get(0));

        myArrayList1.set(0, "Aysu".toUpperCase());
        System.out.println(myArrayList1.get(0));

        myArrayList1.set(2, myArrayList1.get(2).toUpperCase());
        System.out.println(myArrayList1.get(2));

        System.out.println("------------------------------------");
        ArrayList<String> myArrayList2 = new ArrayList<>();
        myArrayList2.add("Aysu");
        myArrayList2.add("Serkan");
        myArrayList2.add("Gizem");
        myArrayList2.add("Ali");
        System.out.println(myArrayList2);

        myArrayList2.set(0, "Aminenur");
        System.out.println(myArrayList2);

        myArrayList2.remove("Aysu");
        myArrayList2.remove(0);
        System.out.println(myArrayList2);

        System.out.println("------------------------------------");

        ArrayList <Integer> myArrayList3 = new ArrayList<>();
        myArrayList3.add(11); // 0
        myArrayList3.add(22); // 1
        myArrayList3.add(33); // 2
        myArrayList3.add(11); // 3
        myArrayList3.add(44); // 4
        myArrayList3.add(null);
        myArrayList3.add(null);
        myArrayList3.remove(4);
        System.out.println(myArrayList3);

        myArrayList3.clear();
        System.out.println(myArrayList3);

        System.out.println("-----------------------------------");

        List<String> myLinkedList1 = new LinkedList<>();
        myLinkedList1.add("Aysu");   // 0
        myLinkedList1.add("Serkan"); // 1
        myLinkedList1.add("Gizem");  // 2
        myLinkedList1.add("Ali");    // 3
        myLinkedList1.add(null);
        myLinkedList1.add(null);
        System.out.println(myLinkedList1);

        myLinkedList1.remove(0);
        myLinkedList1.set(0, "Burak");
        System.out.println(myLinkedList1);


        System.out.println("-----------------------------------");

        Vector<String> myVectorList1 = new Vector<>();
        myVectorList1.add("Aysu");   // 0
        myVectorList1.add("Serkan"); // 1
        myVectorList1.add("Gizem");  // 2
        myVectorList1.add("Ali");    // 3
        myVectorList1.add(null);
        myVectorList1.add(null);
        System.out.println(myVectorList1);

        myVectorList1.remove(0);
        myVectorList1.set(0, "Burak");
        System.out.println(myVectorList1);


        System.out.println("-----------------------------------");

        Stack<String> myStackList1 = new Stack<>();
        myStackList1.push("Aysu");   // 0
        myStackList1.push("Serkan"); // 1
        myStackList1.push("Gizem");  // 2
        myStackList1.push("Ali");    // 3
        myStackList1.push(null);     // 4
        myStackList1.push(null);     // 5
        myStackList1.push("Engin");  // 6
        System.out.println(myStackList1);

        myStackList1.pop();
        System.out.println(myStackList1);

        myStackList1.remove(2);
        System.out.println(myStackList1);

        myStackList1.set(4, "Burak");
        System.out.println(myStackList1);


    }
}
