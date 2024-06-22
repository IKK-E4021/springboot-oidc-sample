package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="oauth2_client_redirect_uri")
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Oauth2ClientRedirectUri {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @EqualsAndHashCode.Include
    @ToString.Include
    @Column(name="redirect_uri")
    private String redirectUri;

    @ManyToOne
    @JoinColumn(name="oauth2_client_id")
    private Oauth2Client oauth2Client;
}

