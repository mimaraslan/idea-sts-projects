package com.mimaraslan;


import java.io.*;

// Serialization Deserialization
public class AppMain {
    public static void main(String[] args) {

        Calisan calisan1 = new Calisan();
        calisan1.setCalisanId(1);
        calisan1.setAdi("Yiğitcan");
        calisan1.setSoyadi("Abay");
        calisan1.setDepartmani("Teknik Yönetim");
        calisan1.setEmail("abc@abc.com");
        calisan1.setMaasi(70_000);

        Calisan calisan2 = new Calisan(
                2,
                "Engin",
                "Ertikmen",
                "Stajyer",
                "aaa@abc.com",
                10_000);


        // Serialization
        try {
            FileOutputStream dosya = new FileOutputStream("serilesen.txt");
            
            ObjectOutputStream yazStream = new ObjectOutputStream(dosya);
            
            yazStream.writeObject(calisan1);

            System.out.println(calisan1);

            yazStream.close();

            System.out.println("Yazma Başarılı");

        } catch (FileNotFoundException e) {
            System.out.println("Yazma Başarısız");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Yazma Başarısız");
            throw new RuntimeException(e);
        }


        //---------------------------------
        //  Deserialization

        try {
            FileInputStream okunacakDosya = new FileInputStream("serilesen.txt");
            ObjectInputStream okuStream = new ObjectInputStream(okunacakDosya);

            Calisan calisan = (Calisan) okuStream.readObject();
            System.out.println(calisan);
            okuStream.close();

            System.out.println("Okuma Başarılı");

        } catch (FileNotFoundException e) {
            System.out.println("Okuma Başarısız");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Okuma Başarısız");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Okuma Başarısız");
            throw new RuntimeException(e);
        }


    }
}