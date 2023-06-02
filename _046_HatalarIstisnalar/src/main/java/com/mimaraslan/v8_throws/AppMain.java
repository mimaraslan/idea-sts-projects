package com.mimaraslan.v8_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppMain {

    public static void main(String[] args) {

       try {
           dosyaOku();
       } catch (Exception e){
           System.out.println("Istisna: " +e);
       }

    }

    private static void dosyaOku() throws FileNotFoundException {

        File yeniDosya = new File("C:\\myText.txt");
        FileInputStream inputStream = new FileInputStream(yeniDosya);
    }
}
