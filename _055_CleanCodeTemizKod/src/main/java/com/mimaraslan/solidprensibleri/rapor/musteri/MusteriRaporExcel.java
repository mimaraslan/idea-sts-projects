package com.mimaraslan.solidprensibleri.rapor.musteri;

import com.mimaraslan.solidprensibleri.Musteri;
import com.mimaraslan.solidprensibleri.Rapor;
import com.mimaraslan.solidprensibleri.rapor.IExcel;

public class MusteriRaporExcel extends Rapor implements IExcel {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("mustreriRaporBilginiNotEt: " + musteri.getAdi() + " "  + musteri.getSoyadi());

    }
    @Override
    public void mustreriRaporExcel(Musteri musteri) {
        System.out.println("mustreriRaporExcel: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
