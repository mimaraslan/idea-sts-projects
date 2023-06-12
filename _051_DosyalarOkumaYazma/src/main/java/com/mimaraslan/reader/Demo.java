package com.mimaraslan.reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("https://github.com/mimaraslan/idea-sts-projects/blob/7cc094928e687470547c77f823fb3df45e0476d3/_051_DosyalarOkumaYazma/pom.xml");

            file = null;

            file.read();
        }
        catch (IOException e)
        {
            //Alternate logic
            e.printStackTrace();
        }
    }
}
