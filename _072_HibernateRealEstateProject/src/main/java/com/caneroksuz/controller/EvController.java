package com.caneroksuz.controller;

import com.caneroksuz.model.Ev;
import com.caneroksuz.service.EvService;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class EvController {

    private EvService evService;

    public EvController() {
        this.evService = new EvService();
    }

    public Ev evOlustur(Ev ev) {
        return evService.evOlustur(ev);
    }

    public Ev evAraById(Long id) {
        return evService.evAraById(id);
    }

    public List<Ev> kiradakiEvler() {
        return evService.kiradakiEvler();
    }

    public List<Ev> musaitEvler() {
        return evService.musaitEvler();
    }

}
