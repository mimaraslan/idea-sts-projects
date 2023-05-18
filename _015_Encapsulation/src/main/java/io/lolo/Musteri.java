package io.lolo;

public class Musteri {

    private Long hesapNo;

    private String adi;
    private String soyadi;

    public Double hesapCuzdan;




    public Musteri() {
    }

    public Musteri(Long hesapNo, String adi, String soyadi, Double hesapCuzdan) {
        this.hesapNo = hesapNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.hesapCuzdan = hesapCuzdan;
    }





    public Long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(Long hesapNo) {
        this.hesapNo = hesapNo;
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

    public Double getHesapCuzdan() {
        return hesapCuzdan;
    }

    public void setHesapCuzdan(Double hesapCuzdan) {
        this.hesapCuzdan = hesapCuzdan;
    }



    //Annotation
    @Override
    public String toString() {
        return "Musteri{" +
                "hesapNo=" + hesapNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", hesapCuzdan=" + hesapCuzdan +
                '}';
    }
}
