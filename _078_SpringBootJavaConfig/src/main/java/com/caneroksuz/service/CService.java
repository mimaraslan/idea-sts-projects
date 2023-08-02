package com.caneroksuz.service;

public class CService implements SelectService {

    @Override
    public void sendMsg(String message) {
        System.out.println("Service C: " + message);
    }
}
