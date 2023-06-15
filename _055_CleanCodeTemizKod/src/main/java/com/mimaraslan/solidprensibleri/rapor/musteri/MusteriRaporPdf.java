package com.mimaraslan.solidprensibleri.rapor.musteri;

import com.mimaraslan.solidprensibleri.Musteri;
import com.mimaraslan.solidprensibleri.Rapor;
import com.mimaraslan.solidprensibleri.rapor.IPdf;

public class MusteriRaporPdf extends Rapor implements IPdf {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporPdf: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporPdf(Musteri musteri) {
        System.out.println("musteriRaporPdf: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
