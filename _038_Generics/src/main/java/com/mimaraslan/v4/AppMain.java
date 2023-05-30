package com.mimaraslan.v4;

public class AppMain {

    public static void main(String[] args) {


        JenerikTipim<Integer> benimObj1 = new JenerikTipim<>(25);
        benimObj1.sinifinTipiniYazdir();

        JenerikTipim<String> benimObj2 = new JenerikTipim<>("Orhun");
        benimObj2.sinifinTipiniYazdir();

    }

}
