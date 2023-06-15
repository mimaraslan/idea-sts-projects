package com.mimaraslan.solidprensibleri.rapor.musteri;

import com.mimaraslan.solidprensibleri.Musteri;
import com.mimaraslan.solidprensibleri.Rapor;
import com.mimaraslan.solidprensibleri.rapor.IJson;

public class MusteriRaporJson  extends Rapor implements IJson {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporJson: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporJson(Musteri musteri) {
        System.out.println("musteriRaporJson: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
