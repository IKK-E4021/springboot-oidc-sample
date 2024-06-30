package com.sample.oidcidp.controller;

import com.sample.oidcidp.domain.entity.User;
import com.sample.oidcidp.domain.service.UserService;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserInfoEndpoint {

    private final UserService userService;

    public UserInfoEndpoint(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userinfo")
    public Map<String, Object> getUserInfo(JwtAuthenticationToken authentication) {
        String userUuid = authentication.getName();
        User user = userService.findByUuid(userUuid);

        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put("sub", user.getUuid());
        userInfo.put("email", user.getUserEmail().getEmail());
        // Add more user information as needed

        return userInfo;
    }
}