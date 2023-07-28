package com.caneroksuz.service;

import com.caneroksuz.model.Kiralama;
import com.caneroksuz.repository.KiralamaRepository;

public class KiralamaService {

    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {
        this.kiralamaRepository = new KiralamaRepository();
    }

    public void kiradakiEvler() {
        kiralamaRepository.kiradakiEvler();
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        return kiralamaRepository.kiralamaOlustur(kiralama);
    }
}
