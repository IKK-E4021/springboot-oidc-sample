package com.sample.oidcidp.controller;

import com.sample.oidcidp.CustomUserDetails;
import com.sample.oidcidp.domain.service.Oauth2ClientService;
import com.sample.oidcidp.util.PasswordEncoderUtil;
import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TestController {

    private final Oauth2ClientService oauth2ClientService;
    private final PasswordEncoderUtil passwordEncoderUtil;

    @GetMapping("/permit-all")
    public String permitAll(@AuthenticationPrincipal CustomUserDetails customUserDetails) {
        System.out.println("permit-all");
        if (customUserDetails != null) {
            System.out.println("getUuid()");
            System.out.println(customUserDetails.getUserUuid());
        }
        oauth2ClientService.findById();
        oauth2ClientService.findAll();
        passwordEncoderUtil.encodePassword("password");
        return "permit-all";
    }

}
