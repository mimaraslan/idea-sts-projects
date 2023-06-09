package com.mimaraslan.reader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextFileReadingYaziDosyaOkumaStreamUtf8 {
    public static void main(String[] args)  {


        try {
            FileInputStream inputStream = new FileInputStream("src/main/myInput.txt");
          //  InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);


            // FileReader reader = new FileReader("src/main/myInput.txt");
          //  FileReader reader = new FileReader("src/main/myInput.json");
          //  FileReader reader = new FileReader("src/main/myInput.xml");

          //  FileReader reader = new FileReader("D:\\demo\\myInput.txt");

            int okumaKarakteri;

            while ((okumaKarakteri = reader.read()) != -1){
                System.out.print((char) okumaKarakteri);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        //   reader.close();
        }


    }
}