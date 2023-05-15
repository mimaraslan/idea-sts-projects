package com.mimaraslan.mahalle2;

import com.mimaraslan.mahalle1.A;

public class B {
    public void goster() {
        System.out.println("Ben B sınıfındaki        göster metoduyum.");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.goster();
    }
}