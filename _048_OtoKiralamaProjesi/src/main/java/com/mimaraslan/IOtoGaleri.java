package com.mimaraslan;

import java.util.List;

public interface IOtoGaleri {

    boolean kiralamaYap() throws OtoGaleriException;

    Araba arabaAra() throws OtoGaleriException;

    Musteri musteriAra() throws OtoGaleriException;

    List<Araba> kiralananArabaListesi() throws OtoGaleriException;

}
