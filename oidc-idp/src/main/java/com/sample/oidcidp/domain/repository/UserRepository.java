package com.sample.oidcidp.domain.repository;

import com.sample.oidcidp.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findById(long id);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.userEmail LEFT JOIN FETCH u.userCredential WHERE u.id = :id")
    Optional<User> findUserWithRelationshipsById(@Param("id") long id);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.userEmail LEFT JOIN FETCH u.userCredential WHERE u.userEmail.email = :email")
    Optional<User> findUserWithRelationshipsByEmail(@Param("email") String email);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.userEmail LEFT JOIN FETCH u.userCredential")
    List<User> findAllWithRelationships();
}
