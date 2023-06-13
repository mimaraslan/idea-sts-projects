package com.mimaraslan._04_jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class JacksonJSONWriteYaz {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();
        calisan.setCalisanId(1);
        calisan.setAdi("Gizem");
        calisan.setSoyadi("Kuşçuoğlu");
        calisan.setDepartman("Proje Yönetimi");
        calisan.setMaas(65_000);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonStr = objectMapper.writeValueAsString(calisan);
            System.out.println(jsonStr);

            FileWriter file = new FileWriter("calisanlar4.json");
            file.write(jsonStr);
            file.flush();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
