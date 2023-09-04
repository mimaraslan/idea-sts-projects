package com.mimaraslan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class ElasticSecurityConfig {

    @Bean
    JwtTokenFilter getTokenFilter(){
        return new JwtTokenFilter();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
/*
        httpSecurity.authorizeHttpRequests()
                .antMatchers("/mylogin.html").permitAll()
                .anyRequest().authenticated();

        httpSecurity.formLogin().loginPage("/mylogin.html");
*/

        httpSecurity.csrf().disable();
        httpSecurity.authorizeHttpRequests()
               // .antMatchers("/elastic/**", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                .antMatchers("/elastic/**").permitAll()
                .antMatchers("/swagger-ui/**").permitAll()
                .antMatchers("/v3/api-docs/**").permitAll()
                .anyRequest().authenticated();

      //  httpSecurity.formLogin();

        httpSecurity.addFilterBefore(getTokenFilter(), UsernamePasswordAuthenticationFilter.class);

        return httpSecurity.build();
    }

}
