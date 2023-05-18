package com.mimaraslan;

public class Veteriner {

    public String hayvanBilgisiAl (Hayvan hayvan){

        String cevap = "Hayvan bilgisi bulunmadı.";

        if(hayvan instanceof Kedi){ // Kedi
            cevap = "Kedi nesnesi gönderildi." ;
        }

        if(hayvan instanceof Kopek){ // Kopek
            cevap = "Kopek nesnesi gönderildi." ;
        }

        if(hayvan instanceof Kus){ // Kus
            cevap = "Kus nesnesi gönderildi." ;
        }

        return cevap;
    }
}
