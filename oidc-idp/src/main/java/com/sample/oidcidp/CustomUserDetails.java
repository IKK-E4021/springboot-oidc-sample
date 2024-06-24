package com.sample.oidcidp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@AllArgsConstructor
public class CustomUserDetails implements UserDetails {

    @Getter
    private final String userUuid;
    protected String password;

    // 認証時のみ使用
    @Override
    public String getPassword() {
        return password;
    }

    // unused
    @Override
    public boolean isEnabled() {
        return true;
    }

    // unused
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    // unused
    @Override
    public String getUsername() {
        return null;
    }

    // unused
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // unused
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // unused
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}
