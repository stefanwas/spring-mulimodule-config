package com.stefan.beta;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BetaConfig {

    public BetaBean beta() {
        return new BetaBean();
    }
}
