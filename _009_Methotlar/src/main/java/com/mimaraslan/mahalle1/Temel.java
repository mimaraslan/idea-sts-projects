package com.mimaraslan.mahalle1;

import com.mimaraslan.mahalle2.B;

public class Temel {

    // ERİŞİM BELİRTEÇLERİ
    // public // fark etmez!!!!
    //         (default) // ayni pakette olacak
    // protected // miras alirsa
    // private  // sadece o sinifa özel

    public static void main(String[] args) {

        A obj = new A();
        obj.goster();

        B obj2 = new B();
        obj2.goster();



    }
}
