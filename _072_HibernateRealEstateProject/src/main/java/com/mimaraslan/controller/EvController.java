package com.mimaraslan.controller;

import com.mimaraslan.model.Ev;
import com.mimaraslan.service.EvService;

import java.util.List;

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
