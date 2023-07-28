package com.mimaraslan.service;

import com.mimaraslan.model.Kisi;
import com.mimaraslan.repository.KisiRepository;

public class KisiService {

    private KisiRepository kisiRepository;

    public KisiService() {
        this.kisiRepository = new KisiRepository();
    }

    public Kisi kisiOlustur(Kisi kisi) {
        return kisiRepository.kisiOlustur(kisi);
    }

    public Kisi kisiAraById(Long id) {
        return kisiRepository.kisiAraById(id);
    }
}
