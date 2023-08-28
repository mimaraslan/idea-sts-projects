package com.mimaraslan.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    String directExchangeAuth = "direct-exchange-product";

    String queueAuth = "queue-product";

    String saveBindingKey = "save-binding-key";

    @Bean
    DirectExchange directExchangeAuth(){
        return new DirectExchange(directExchangeAuth);
    }

    @Bean
    Queue queueAuth(){
        return new Queue(queueAuth);
    }

    @Bean
    public Binding saveBindingDirectExchange(final Queue queueAuth,  final DirectExchange directExchangeAuth){
        return BindingBuilder.bind(queueAuth).to(directExchangeAuth).with(saveBindingKey);
    }

}
