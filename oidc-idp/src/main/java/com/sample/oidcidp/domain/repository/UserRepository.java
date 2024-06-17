package com.sample.oidcidp.domain.repository;

import com.sample.oidcidp.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

//    void create(Oauth2Client oauth2Client);

    Optional<User> findById(long id);

//    @Query("SELECT DISTINCT user FROM User u LEFT JOIN FETCH u.userEmail")
    Optional<User> findByUserEmailUserEmail(String userEmail);
}
