package com.sample.oidcidp.domain.repository;

import com.sample.oidcidp.domain.entity.Oauth2Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface Oauth2ClientRepository extends JpaRepository<Oauth2Client, Long> {

//    void create(Oauth2Client oauth2Client);

    @Query("SELECT client FROM Oauth2Client client LEFT JOIN FETCH client.redirectUris WHERE client.clientId = :client_id")
    Optional<Oauth2Client> findOauth2ClientWithRelationshipsByClientId(@Param("client_id") String clientId);

    @Query("SELECT DISTINCT client FROM Oauth2Client client LEFT JOIN FETCH client.redirectUris")
    List<Oauth2Client> findAllWithRedirectUri();
}
