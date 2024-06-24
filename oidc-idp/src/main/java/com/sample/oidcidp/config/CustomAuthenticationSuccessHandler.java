package com.sample.oidcidp.config;

import com.sample.oidcidp.PasswordClearingCustomUserDetails;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    public CustomAuthenticationSuccessHandler() {
        super();
        setDefaultTargetUrl("/home");
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws ServletException, IOException {
        Object principal = authentication.getPrincipal();
        if (principal instanceof PasswordClearingCustomUserDetails) {
            ((PasswordClearingCustomUserDetails) principal).clearPassword();
        }
        // スーパークラスのメソッドを呼び出してリダイレクトを処理
        super.onAuthenticationSuccess(request, response, authentication);
    }
}