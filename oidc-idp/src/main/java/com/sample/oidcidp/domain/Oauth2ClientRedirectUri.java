package com.sample.oidcidp.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="oauth2_client_redirect_uri")
@Data
public class Oauth2ClientRedirectUri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="oauth2_client_id")
    private Oauth2Client oauth2Client;
}

