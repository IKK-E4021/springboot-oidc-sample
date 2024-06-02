package com.sample.oidcidp.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Oauth2ClientService {

    private final Oauth2ClientRepository oauth2ClientRepository;

    public void findById() {
        var oauth2Client = oauth2ClientRepository.findById(1).orElseThrow(RuntimeException::new);
        System.out.println(oauth2Client);
    }

    public void findAll() {
        List<Oauth2Client> oauth2Clients = oauth2ClientRepository.findAllWithRedirectUri();
        System.out.println(oauth2Clients);
        System.out.println(oauth2Clients.get(0).getRedirectUris());
        System.out.println(oauth2Clients.get(1).getRedirectUris());
    }


}
