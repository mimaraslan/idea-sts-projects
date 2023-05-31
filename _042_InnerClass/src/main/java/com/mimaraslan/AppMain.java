package com.mimaraslan;

class DisSinif {

    int sayi = 44;
        class YavruSinif {
        int sayi = 55;
    }

}


public class AppMain {

    public static void main(String[] args) {

        DisSinif obj1 = new DisSinif();
        System.out.println(obj1.sayi);

       // DisSinif.YavruSinif obj2 = new DisSinif.YavruSinif();
        DisSinif.YavruSinif obj2 = obj1.new YavruSinif();
        System.out.println(obj2.sayi);

    }

}




