package com.sample.oidcidp.util;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PasswordEncoderUtil {

    private final PasswordEncoder passwordEncoder;

    public String encodePassword(String rawPassword) {
        String encodedPassword = passwordEncoder.encode(rawPassword);
        System.out.println("===========================encodedPassword==============================");
        System.out.println(encodedPassword);
        return encodedPassword;
    }
}
