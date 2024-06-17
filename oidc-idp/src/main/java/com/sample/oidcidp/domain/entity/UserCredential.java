package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="user_credential")
@Data
public class UserCredential {

    @Id
    @Column(name="user_id")
    private long userId;
    @Column(name="password")
    private String password;
    @Column(name="salt")
    private byte[] salt;
    @Column(name="failure_count")
    private int failureCount;
    @Column(name="last_changed_at")
    private LocalDateTime lastChangedAt;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}

