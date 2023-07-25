package com.caneroksuz.controller;

import com.caneroksuz.model.Kisi;
import com.caneroksuz.service.KisiService;

public class KisiController {

    private KisiService kisiService;

    public KisiController() {

        this.kisiService = new KisiService();
    }

    public Kisi kisiOlustur(Kisi kisi){
        return kisiService.kisiOlustur(kisi);
    }
}
