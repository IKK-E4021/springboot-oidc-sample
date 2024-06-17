package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user_email")
@Data
public class UserEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name="user_id")
//    private long userId;
@Column(name="user_email")
    private String userEmail;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}

