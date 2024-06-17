package com.sample.oidcidp.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="oauth2_client")
@Data
public class Oauth2Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="client_id")
    private String clientId;
    @Column(name="client_secret")
    private String clientSecret;
    @Column(name="service_uri")
    private String serviceUri;
    @Column(name="display_name")
    private String displayName;
    private boolean enabled;
    @OneToMany(mappedBy = "oauth2Client", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Oauth2ClientRedirectUri> redirectUris;
}

