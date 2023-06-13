package com.mimaraslan._04_jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JacksonJSONReadOku {
    public static void main(String[] args) {

        File okunacakDosya = new File("calisanlar4.json");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Calisan calisan = objectMapper.readValue(okunacakDosya, Calisan.class);
            System.out.println(calisan);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
