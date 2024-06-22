package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="oauth2_client")
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Oauth2Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @EqualsAndHashCode.Include
    @Column(name="client_id")
    private String clientId;
    @EqualsAndHashCode.Include
    @Column(name="client_secret")
    private String clientSecret;
    @EqualsAndHashCode.Include
    @Column(name="service_uri")
    private String serviceUri;
    @EqualsAndHashCode.Include
    @Column(name="display_name")
    private String displayName;
    private boolean enabled;
    @OneToMany(mappedBy = "oauth2Client", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Include
    private List<Oauth2ClientRedirectUri> redirectUris;
}

