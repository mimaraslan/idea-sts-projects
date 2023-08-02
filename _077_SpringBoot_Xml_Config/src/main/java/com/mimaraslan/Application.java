package com.mimaraslan;

import com.mimaraslan.service.MessageProcessor;
import com.mimaraslan.service.MessageProcessorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {


     //  SpringApplication.run(Application.class, args);

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        MessageProcessor messageProcessor =  applicationContext.getBean(MessageProcessor.class);
        messageProcessor.processingMsg("Selamlar nasılsın?");


    }

}
