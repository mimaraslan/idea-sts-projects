package com.mimaraslan.service;

public class AService implements SelectService {
    @Override
    public void sendMsg(String message) {
        System.out.println("Service A: " + message);
    }
}
