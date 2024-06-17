CREATE TABLE user (
    id             BIGINT UNSIGNED  AUTO_INCREMENT,
    uuid           CHAR(36)      NOT NULL,
    enabled        TINYINT(1)    NOT NULL,
    quit           TINYINT(1)    NOT NULL,
    created_at     DATETIME      NOT NULL,
    updated_at     DATETIME      NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (uuid)
);

CREATE TABLE user_credential (
    user_id           BIGINT          UNSIGNED NOT NULL,
    password          VARCHAR(4000)            NOT NULL,
    salt              TINYBLOB                 NOT NULL,
    failure_count     INT             UNSIGNED NOT NULL,
    last_changed_at   DATETIME                 NOT NULL,
    created_at        DATETIME                 NOT NULL,
    updated_at        DATETIME                 NOT NULL,
    PRIMARY KEY (user_id),
    FOREIGN KEY (user_id) REFERENCES user (id)
);

CREATE TABLE user_email (
    id                BIGINT          UNSIGNED AUTO_INCREMENT,
    user_id           BIGINT          UNSIGNED                 NOT NULL,
    user_email        VARCHAR(255)                             NOT NULL,
    created_at        DATETIME                                 NOT NULL,
    updated_at        DATETIME                                 NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (user_email),
    FOREIGN KEY (user_id) REFERENCES user (id)
);
