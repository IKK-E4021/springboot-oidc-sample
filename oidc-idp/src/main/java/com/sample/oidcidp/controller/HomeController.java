package com.sample.oidcidp.controller;

import com.sample.oidcidp.CustomUserDetails;
import com.sample.oidcidp.domain.service.Oauth2ClientService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HomeController {

    private final Oauth2ClientService oauth2ClientService;

    @GetMapping("/home")
    public String getHomePage(@AuthenticationPrincipal CustomUserDetails customUserDetails) {
        System.out.println("home");
        oauth2ClientService.findById();
        oauth2ClientService.findAll();
        return "home";
    }

}
