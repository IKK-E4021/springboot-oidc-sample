package com.sample.oidcidp;

public class PasswordClearingCustomUserDetails extends CustomUserDetails {

    public PasswordClearingCustomUserDetails(String userUuid, String password) {
        super(userUuid, password);
    }

    public void clearPassword() {
        this.password = null;
    }
}