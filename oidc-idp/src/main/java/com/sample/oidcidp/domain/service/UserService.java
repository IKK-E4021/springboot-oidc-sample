package com.sample.oidcidp.domain.service;

import com.sample.oidcidp.domain.entity.User;
import com.sample.oidcidp.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(long id) {
        return userRepository.findUserWithRelationshipsById(id)
                .orElseThrow(() -> new UsernameNotFoundException("user not found."));
    }

    public User findByUuid(String uuid) {
        return userRepository.findUserWithRelationshipsByUuid(uuid)
                .orElseThrow(() -> new UsernameNotFoundException("user not found."));
    }

    public User findByEmail(String email) {
        return userRepository.findUserWithRelationshipsByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("user not found."));
    }

    public List<User> findAll() {
        return userRepository.findAllWithRelationships();
    }

}
