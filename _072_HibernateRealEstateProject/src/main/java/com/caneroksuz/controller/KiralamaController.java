package com.caneroksuz.controller;

import com.caneroksuz.model.Kiralama;
import com.caneroksuz.service.KiralamaService;

public class KiralamaController {

    private KiralamaService kiralamaService;

    public KiralamaController() {
        this.kiralamaService = new KiralamaService();
    }

    public void kiradakiEvler() {
        kiralamaService.kiradakiEvler();
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        return kiralamaService.kiralamaOlustur(kiralama);
    }
}
