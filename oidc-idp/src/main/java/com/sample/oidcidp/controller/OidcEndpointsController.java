package com.sample.oidcidp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OidcEndpointsController {

    @GetMapping("/.well-known/openid-configuration")
    public Map<String, Object> oidcConfiguration() {
        return Map.of(
                "issuer", "http://localhost:8080",
                "authorization_endpoint", "http://localhost:8080/oauth2/authorize",
                "token_endpoint", "http://localhost:8080/oauth2/token",
                "userinfo_endpoint", "http://localhost:8080/userinfo",
                "jwks_uri", "http://localhost:8080/oauth2/jwks",
                "scopes_supported", new String[]{"openid", "profile", "email"},
                "response_types_supported", new String[]{"code"},
                "grant_types_supported", new String[]{"authorization_code", "refresh_token"},
                "subject_types_supported", new String[]{"public"}
        );
    }
}