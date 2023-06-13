package com.mimaraslan;

import java.io.Serializable;


// POJO - Model
public class Calisan implements Serializable {

    private transient int calisanId;
    private String adi;
    private String soyadi;
    private String email;
    private transient String departmani;
    private static float maasi;


    public Calisan() {
    }

    public Calisan(int calisanId, String adi, String soyadi, String email, String departmani, float maasi) {
        this.calisanId = calisanId;
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.departmani = departmani;
        this.maasi = maasi;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    public float getMaasi() {
        return maasi;
    }

    public void setMaasi(float maasi) {
        this.maasi = maasi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calisan{");
        sb.append("calisanId=").append(calisanId);
        sb.append(", adi='").append(adi).append('\'');
        sb.append(", soyadi='").append(soyadi).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", departmani='").append(departmani).append('\'');
        sb.append(", maasi=").append(maasi);
        sb.append('}');
        return sb.toString();
    }
}
