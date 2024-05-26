package com.sample.oidcidp.controller;

import com.sample.oidcidp.domain.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String getTestPage() {
        testService.findById();
        return "test";
    }

}
