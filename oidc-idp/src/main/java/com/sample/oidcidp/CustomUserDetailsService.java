package com.sample.oidcidp;

import com.sample.oidcidp.domain.entity.User;
import com.sample.oidcidp.domain.repository.UserRepository;
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

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserWithRelationshipsByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found."));
        return new CustomUserDetails(user);
    }
}
