package com.mimaraslan._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteYazJSON {

    public static void main(String[] args) {

        /*  calisanlar.json

  {"calisanlar":[
      { "adi":"Serkan", "soyadi":"Zorlu", "yas":25 },
      { "adi":"Burak", "soyadi":"Delice", "yas":33 },
      { "adi":"Mehmet", "soyadi":"Caner", "yas":28 }
   ]}
        */

        JSONObject calisanDetayi = new JSONObject();
        calisanDetayi.put("adi", "Serkan");   // K, V
        calisanDetayi.put("soyadi", "Zorlu"); // Key, Value
        calisanDetayi.put("yas", 25);

        JSONObject calisanlarObj= new JSONObject();
        calisanlarObj.put("calisanlar", calisanDetayi);

        //--------------------------------------------------------------
        JSONObject calisanDetayi2 = new JSONObject();
        calisanDetayi2.put("adi", "Burak");   // K, V
        calisanDetayi2.put("soyadi", "Delice"); // Key, Value
        calisanDetayi2.put("yas", 33);

        JSONObject calisanlarObj2= new JSONObject();
        calisanlarObj2.put("calisanlar", calisanDetayi2);

        //--------------------------------------------------------------

        JSONArray calisanList = new JSONArray();
        calisanList.add(calisanlarObj);
        calisanList.add(calisanlarObj2);

       try (FileWriter file = new FileWriter("calisanlar.json") ) {
           file.write(calisanList.toJSONString());
           file.flush();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


    }
}
