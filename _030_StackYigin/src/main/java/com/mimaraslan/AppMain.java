package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AppMain {

    public static void main(String[] args) {

        Stack <String> stackList = new Stack();
        stackList.push("Ali"); // 0
        stackList.push("Salih"); // 1
        stackList.push("Orhun"); // 2
        stackList.push("Aysu"); // 3
        stackList.push("Gizem"); // 4
        stackList.push("Ahmet"); // 5
        System.out.println(stackList);

        stackList.pop();
        System.out.println(stackList);

        stackList.add("Burak"); // 5
        System.out.println(stackList);

        System.out.println(stackList.peek());
        System.out.println(stackList.lastElement());

        System.out.println(stackList.search("Ali"));

        System.out.println(stackList.empty());
        System.out.println(stackList.isEmpty());




    }
}
