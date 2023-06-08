package com.mimaraslan.ornek05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AppMainSinifDegiskeniTanimlama {

    static String ifade; // = "Selam";

    static String[] gunler; // = {"Pa","Sa","Ca","Pe","Cu","Ct","Pz"};

    static List<String> ogrencilerListesi; // = null; ogrencilerListesi.add("Gani");

    static Optional<String> ifade2;

    static Optional<String>[] gunler2;

    static Optional<List<String>> ogrencilerListesi2;


    public static void main(String[] args) {

        System.out.println(ifade);
        System.out.println(gunler);
        System.out.println(ogrencilerListesi);

        System.out.println(ifade2);
        System.out.println(gunler2);
        System.out.println(ogrencilerListesi2);

        try {
            // NullPointerException
            System.out.println(ifade.charAt(0));
            System.out.println(gunler[10]);
            System.out.println(ogrencilerListesi.get(0));

           // System.out.println(ifade2.charAt(0));


            // FIXME buna bakılacak. Array için Optional kullanımı
            //  System.out.println(gunler2[10]);
            /*
            List<String> myList = Arrays.asList(Arrays.toString(gunler2));
            System.out.println(myList.get(0));
             */

           // System.out.println(ogrencilerListesi2.get(0));

        } catch (NullPointerException e) {
            System.out.println("Istisna....: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Istisna....: " + e);
        } catch (Exception e) {
            System.out.println("Istisna....: " + e);

        }


    }
}
