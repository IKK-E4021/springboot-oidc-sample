package com.sample.oidcidp.domain.repository;

import com.sample.oidcidp.domain.entity.Oauth2Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface Oauth2ClientRepository extends JpaRepository<Oauth2Client, Long> {

//    void create(Oauth2Client oauth2Client);

    Optional<Oauth2Client> findById(long id);

    @Query("SELECT u FROM User u JOIN FETCH u.userEmail ue WHERE ue.userEmail = :userEmail")
    List<Oauth2Client> findAllWithRedirectUri();
}
