package com.mimaraslan._03_javax_json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JavaxJSONRead {

    public static void main(String[] args) {
        File okunacakJsonDosyasi = new File("calisanlar3.json");
        InputStream inputStream;

        try {
            inputStream = new FileInputStream(okunacakJsonDosyasi);

            JsonReader reader = Json.createReader(inputStream);

            JsonObject calisanObj = reader.readObject();
            reader.close();

            System.out.println(calisanObj.getInt("calisanId"));
            System.out.println(calisanObj.getString("adi"));
            System.out.println(calisanObj.getString("soyadi"));
            System.out.println(calisanObj.getString("departman"));
            System.out.println(calisanObj.get("maas"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
