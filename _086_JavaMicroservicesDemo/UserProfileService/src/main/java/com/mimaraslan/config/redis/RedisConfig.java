package com.mimaraslan.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableCaching
@EnableRedisRepositories
public class RedisConfig {

    @Value("${user-profile-service.redis.hostname}")
    String hostname; // localhost

    @Value("${user-profile-service.redis.port}")
    int port; // 6379

    @Bean
    public LettuceConnectionFactory redisConnectionFactory(){
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration(hostname, port));
    }
}
