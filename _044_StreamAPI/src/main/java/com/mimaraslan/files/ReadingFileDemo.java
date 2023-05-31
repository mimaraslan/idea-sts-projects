package com.mimaraslan.files;

import java.io.*;

public class ReadingFileDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("C:\\DOSYAADI.txt "));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        try {
            char c = (char) bufferedInputStream.read();
            System.out.println("Okunan veri: "+ c);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            bufferedInputStream.close();
        }






        String myData = "Uzerinde işlemler yapıldı.";
        BufferedOutputStream cikti = null;
        try {

            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\DOSYA_SONUC.txt "));
            cikti = new BufferedOutputStream(fileOutputStream);

            cikti.write(myData.getBytes());
            System.out.println("Basarılı");

        } catch (Exception e){

            System.out.println(e);

        } finally {
            cikti.close();
        }

    }



}
