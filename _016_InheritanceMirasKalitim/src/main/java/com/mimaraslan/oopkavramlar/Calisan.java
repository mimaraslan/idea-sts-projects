package com.mimaraslan.oopkavramlar;


// Class
public class Calisan {

    // Fields // Variables
    private  Long kimlikNo;
    private  String adi;
    private  String soyadi;
    private  Float maas;
    private  Boolean sigorta;
//  Erişim Belirteçleri private, public, protected - Encapsulation (Kormuma)

 // Constructors // Hazırlayıcı Yapıcı
    public Calisan() {
    }

    public Calisan(Long kimlikNo, String adi, String soyadi, Float maas, Boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }

    // Setters Getters
    public Long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(Long kimlikNo) {
        this.kimlikNo = kimlikNo;
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

    public Float getMaas() {
        return maas;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public Boolean getSigorta() {
        return sigorta;
    }

    public void setSigorta(Boolean sigorta) {
        this.sigorta = sigorta;
    }



    // Polymorphism
    // toString metothod
  @Override // Ezme
    public String toString() {
        return "Calisan{" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }



    // Sıradan bir method
    public Float getMaasSonDurumu(float asgariUcret, float bonus) {
        return asgariUcret*3 + bonus;
    }

    public Float getMaasSonDurumu(float asgariUcret, float bonus, int ucretliIzin) {
        return asgariUcret*3 + bonus + ucretliIzin*14;
    }



}
