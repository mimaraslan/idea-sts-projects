package com.mimaraslan.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDosyaYazmaBuffer {
    public static void main(String[] args)  {

        try {

            // FIXME bakılacak
            FileWriter writer = new FileWriter("src/main/myInput.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

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
            bufferedWriter.write("*********************");

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
