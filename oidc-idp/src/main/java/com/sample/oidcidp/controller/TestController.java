package com.sample.oidcidp.controller;

import com.sample.oidcidp.domain.service.Oauth2ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TestController {

    private final Oauth2ClientService oauth2ClientService;

    @GetMapping("/permit-all")
    public String permitAll() {
        oauth2ClientService.findById();
        oauth2ClientService.findAll();
        return "permit-all";
    }

    @GetMapping("/test")
    public String getTestPage() {
        System.out.println("test");
        oauth2ClientService.findById();
        oauth2ClientService.findAll();
        return "test";
    }

}
