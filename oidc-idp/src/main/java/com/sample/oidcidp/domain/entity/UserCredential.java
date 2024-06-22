package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="user_credential")
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @ToString.Include
    private String password;

    @ToString.Include
    private byte[] salt;

    @Column(name="failure_count")
    @ToString.Include
    private int failureCount;

    @Column(name="last_changed_at")
    @ToString.Include
    private LocalDateTime lastChangedAt;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
