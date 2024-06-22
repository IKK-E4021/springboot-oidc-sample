package com.sample.oidcidp.domain.service;

import com.sample.oidcidp.CustomUserDetails;
import com.sample.oidcidp.domain.entity.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email);
        user.getUserCredential().setPassword("{noop}" + user.getUserCredential().getPassword());
        return new CustomUserDetails(user);
    }
}
