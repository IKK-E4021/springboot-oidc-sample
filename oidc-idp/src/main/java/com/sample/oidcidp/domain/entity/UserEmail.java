package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="user_email")
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @ToString.Include
    private String email;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
