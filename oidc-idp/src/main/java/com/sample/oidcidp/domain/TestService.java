package com.sample.oidcidp.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public void findById() {
        var test = testRepository.findById(1).orElseThrow(RuntimeException::new);
        System.out.println(test);
    }

}
