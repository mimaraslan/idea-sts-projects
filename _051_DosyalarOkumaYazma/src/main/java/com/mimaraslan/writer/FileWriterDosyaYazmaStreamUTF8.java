package com.mimaraslan.writer;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriterDosyaYazmaStreamUTF8 {
    public static void main(String[] args)  {

        try {
            //    FileWriter writer = new FileWriter("src/main/myInput.txt", true);
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/myInput.txt", true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\nAbdullah Aktaş\n" +
                    "Ahmet Akkoyun\n" +
                    "Ali Güneş\n" +
                    "Aminenur Göynük\n" +
                    "Aysu Çağışlar\n" +
                    "Burak Delice\n" +
                    "Gizem Kuşçuoğlu\n" +
                    "Mehmet Caner Öksüz\n" +
                    "Orhun Bayındır\n" +
                    "Osman Onur Baş\n" +
                    "Salih Polat Dönmez\n" +
                    "Serkan Şahin Zorlu\n" +
                    "Yiğitcan Abay\n" +
                    "Ünal Gani Berk\n");
            bufferedWriter.newLine();
            bufferedWriter.write("\n*********************");
            bufferedWriter.write("\n*********************");
            bufferedWriter.write("\n*********************");

            bufferedWriter.write("\n你好嗎？");
            bufferedWriter.write("\n找到錢就打電話。");






            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
