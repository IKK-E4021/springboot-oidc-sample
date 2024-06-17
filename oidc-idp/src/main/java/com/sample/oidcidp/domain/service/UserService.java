package com.sample.oidcidp.domain.service;

import com.sample.oidcidp.domain.entity.Oauth2Client;
import com.sample.oidcidp.domain.repository.Oauth2ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final Oauth2ClientRepository oauth2ClientRepository;

    public void findById() {
        var oauth2Client = oauth2ClientRepository.findById(1).orElseThrow(RuntimeException::new);
        System.out.println(oauth2Client);
    }

    public void findAll() {
        List<Oauth2Client> oauth2Clients = oauth2ClientRepository.findAllWithRedirectUri();
        System.out.println(oauth2Clients);
    }


}
