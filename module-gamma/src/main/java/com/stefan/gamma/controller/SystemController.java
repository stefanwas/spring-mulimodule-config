package com.stefan.gamma.controller;

import com.stefan.beta.BetaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    private BetaBean betaBean;

    @Autowired
    public SystemController(BetaBean betaBean) {
        this.betaBean = betaBean;
    }

    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }

    @GetMapping("/name")
    public String getProperty() {

        String name = betaBean.getName();
        return name;
    }
}
