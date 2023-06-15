package com.mimaraslan.solidprensibleri;

public class Adres {
    private String sehir;
    private String semt;
    private String cadde;
    private String sokak;
    private String binaNo;
    private String kapiNo;

    public Adres() {
    }

    public Adres(String sehir, String semt, String cadde, String sokak, String binaNo, String kapiNo) {
        this.sehir = sehir;
        this.semt = semt;
        this.cadde = cadde;
        this.sokak = sokak;
        this.binaNo = binaNo;
        this.kapiNo = kapiNo;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getSemt() {
        return semt;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getBinaNo() {
        return binaNo;
    }

    public void setBinaNo(String binaNo) {
        this.binaNo = binaNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adres{");
        sb.append("sehir='").append(sehir).append('\'');
        sb.append(", semt='").append(semt).append('\'');
        sb.append(", cadde='").append(cadde).append('\'');
        sb.append(", sokak='").append(sokak).append('\'');
        sb.append(", binaNo='").append(binaNo).append('\'');
        sb.append(", kapiNo='").append(kapiNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
