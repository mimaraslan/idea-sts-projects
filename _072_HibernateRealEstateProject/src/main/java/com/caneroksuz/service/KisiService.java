package com.caneroksuz.service;

import com.caneroksuz.model.Kisi;
import com.caneroksuz.repository.KisiRepository;

public class KisiService {

    private KisiRepository kisiRepository;

    public KisiService() {
        this.kisiRepository = new KisiRepository();
    }

    public Kisi kisiOlustur(Kisi kisi) {
        return kisiRepository.kisiOlustur(kisi);
    }
}
