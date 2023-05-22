package com.mimaraslan.personel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personel {

    private String adi;
    private String soyadi;
    private String kimlikNo;
    private double maas;

    @Override
    public String toString() {
        return "Personel{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", maas=" + maas +
                '}';
    }
}
