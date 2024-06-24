package com.sample.oidcidp.domain.service;

import com.sample.oidcidp.domain.repository.Oauth2ClientRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class Oauth2ClientService {

    private final Oauth2ClientRepository oauth2ClientRepository;

    public void findById() {
        oauth2ClientRepository.findOauth2ClientWithRelationshipsByClientId("test_client").orElseThrow(RuntimeException::new);
    }

    public void findAll() {
        oauth2ClientRepository.findAllWithRedirectUri();
    }

}
