package com.mimaraslan;

// Custom Exception
public class OtoGaleriException extends Exception {

    private String mesaj;

    public OtoGaleriException(String mesaj) {
        super(mesaj);
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}
