package com.mimaraslan._04_jackson;

// POJO - Model
public class Calisan {
    private   int calisanId;
    private   String adi;
    private  String soyadi;
    private  String departman;
    private  float maas;

    public int getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(int calisanId) {
        this.calisanId = calisanId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("*********************************");
        sb.append( "\ncalisanId=").append(calisanId);
        sb.append( "\nadi=").append(adi);
        sb.append( "\nsoyadi=").append(soyadi);
        sb.append( "\ndepartman=").append(departman);
        sb.append( "\nmaas=").append(maas);
        sb.append("\n*********************************");

        return sb.toString();
    /*
        return "Calisan{" +
                "calisanId=" + calisanId +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", departman='" + departman + '\'' +
                ", maas=" + maas +
                '}';
        */
    }
}
