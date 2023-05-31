package com.mimaraslan.files;

import java.io.BufferedInputStream;
import java.io.IOException;

public class ReadingDemo {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);

        try {

            System.out.println("Bir giriş yapınız: ");
            char c = (char) bufferedInputStream.read();
            System.out.println(c);

        } catch (Exception e){

            System.out.println(e);

        } finally {

            bufferedInputStream.close();

        }


    }



}
