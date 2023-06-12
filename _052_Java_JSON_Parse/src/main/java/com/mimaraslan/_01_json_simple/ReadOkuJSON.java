package com.mimaraslan._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadOkuJSON {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader readerOkuma = new FileReader("calisanlar.json")){

            Object  obj = jsonParser.parse(readerOkuma);

            JSONArray calisanlarListesi = (JSONArray) obj;
            System.out.println(calisanlarListesi);

           calisanlarListesi.forEach(calisan -> calisanlariYazParse(    (JSONObject) calisan    )    );

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }

    /*  calisanlar.json

[
{"calisanlar":
    {"adi":"Serkan","soyadi":"Zorlu","yas":25}},
{"calisanlar":
    {"adi":"Burak","soyadi":"Delice","yas":33}}
]
    */
    private static void calisanlariYazParse(JSONObject calisan) {

        JSONObject calisanObj = (JSONObject) calisan.get("calisanlar");

        String adi = (String) calisanObj.get("adi");
        String soyadi = (String) calisanObj.get("soyadi");
        Long yas = (Long) calisanObj.get("yas");
       // String yas = calisanObj.get("yas").toString();

        System.out.println("-----------------------------------");
        System.out.println("ADI: " + adi);
        System.out.println("SOYADI: " + soyadi);
        System.out.println("YASI: " + yas);

    }
}
