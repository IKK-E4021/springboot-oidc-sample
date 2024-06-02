package com.sample.oidcidp.controller;

import com.sample.oidcidp.domain.Oauth2ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TestController {

    private final Oauth2ClientService oauth2ClientService;

    @GetMapping("/test")
    public String getTestPage() {
        oauth2ClientService.findById();
        oauth2ClientService.findAll();
        return "test";
    }

}
