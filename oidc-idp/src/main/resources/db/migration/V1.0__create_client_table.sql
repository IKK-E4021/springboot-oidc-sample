CREATE TABLE oauth2_client (
    id             INT UNSIGNED  AUTO_INCREMENT,
    client_id      VARCHAR(256)  NOT NULL,
    client_secret  VARCHAR(512),
    service_uri    VARCHAR(191)  NOT NULL,
    display_name   VARCHAR(1024) NOT NULL,
    enabled        BOOLEAN       NOT NULL,
    created_at     DATETIME      NOT NULL,
    updated_at     DATETIME      NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (client_id)
);

CREATE TABLE oauth2_client_redirect_uri (
    id                INT    UNSIGNED AUTO_INCREMENT,
    oauth2_client_id  INT    UNSIGNED NOT NULL,
    redirect_uri      VARCHAR(256),
    created_at        DATETIME        NOT NULL,
    updated_at        DATETIME        NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (oauth2_client_id, redirect_uri),
    FOREIGN KEY (oauth2_client_id) REFERENCES oauth2_client (id)
);

--CREATE TABLE oauth2_client_scopes (
--    id                BIGINT UNSIGNED AUTO_INCREMENT,
--    oauth2_client_id  INT    UNSIGNED NOT NULL,
--    scope_id          VARCHAR(256)    NOT NULL,
--    created_at        DATETIME        NOT NULL,
--    PRIMARY KEY (id),
--    UNIQUE KEY (oauth2_client_id, scope_id),
--    FOREIGN KEY (oauth2_client_id) REFERENCES oauth2_client (id)
--);
