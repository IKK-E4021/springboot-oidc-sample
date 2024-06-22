package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Long id;
    @EqualsAndHashCode.Include
    private String uuid;
    private boolean enabled;
    private boolean quit;

    @ToString.Include(rank = 1)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private UserEmail userEmail;

    @ToString.Include(rank = 2)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private UserCredential userCredential;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // または適切なコレクションを返す
    }
}
