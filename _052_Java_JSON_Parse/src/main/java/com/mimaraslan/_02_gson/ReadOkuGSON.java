package com.mimaraslan._02_gson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadOkuGSON {

    public static void main(String[] args) {

        BufferedReader reader = null;
        Gson gsonObj = new Gson();

        try {
            reader = new BufferedReader(new FileReader("calisanlar2.json"));
            Calisan calisan = gsonObj.fromJson(reader, Calisan.class);

            System.out.println("ID:" + calisan.getCalisanId());
            System.out.println("ADI:" + calisan.getAdi());
            System.out.println("SOYADI:" + calisan.getSoyadi());
            System.out.println("DEPARTMANI:" + calisan.getDepartman());
            System.out.println("MAASI:" + calisan.getMaas());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
