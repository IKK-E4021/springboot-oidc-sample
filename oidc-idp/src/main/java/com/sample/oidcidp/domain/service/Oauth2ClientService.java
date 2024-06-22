package com.sample.oidcidp.domain.service;

import com.sample.oidcidp.domain.entity.Oauth2Client;
import com.sample.oidcidp.domain.repository.Oauth2ClientRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class Oauth2ClientService {

    private final Oauth2ClientRepository oauth2ClientRepository;

    public void findById() {
        var oauth2Client = oauth2ClientRepository.findOauth2ClientWithRelationshipsByClientId("test_client").orElseThrow(RuntimeException::new);
        System.out.println("oauth2Client clientId = test_client");
        System.out.println(oauth2Client);
        System.out.println(oauth2Client.getRedirectUris());
    }

    public void findAll() {
        List<Oauth2Client> oauth2Clients = oauth2ClientRepository.findAllWithRedirectUri();
        System.out.println("all oauth2Clients");
        oauth2Clients.forEach(System.out::println);
    }


}
