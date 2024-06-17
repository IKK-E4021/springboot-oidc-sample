package com.sample.oidcidp;

import com.sample.oidcidp.domain.entity.User;
import com.sample.oidcidp.domain.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByUserEmailUserEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found."));
        return new CustomUserDetails(user);
    }
}
