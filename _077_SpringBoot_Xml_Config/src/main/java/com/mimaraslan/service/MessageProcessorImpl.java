package com.mimaraslan.service;

public class MessageProcessorImpl implements MessageProcessor{

    private SelectService selectService;

    public void setSelectService(SelectService selectService) {
        this.selectService = selectService;
    }

    @Override
    public void processingMsg(String message) {
        selectService.sendMsg(message);
    }
}
