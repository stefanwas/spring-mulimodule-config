package com.stefan.alfa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlfaConfig {

    @Bean
    public AlfaBean alfa(){
        return new AlfaBean();
    }
}
