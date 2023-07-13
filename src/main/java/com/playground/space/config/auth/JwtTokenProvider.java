package com.playground.space.config.auth;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Base64;

//@Component
//public class JwtTokenProvider {
//
//    @Value("${security.jwt.token.expire-length:3600000}")
//    private final long validityInMilliSeconds = 3600000; // 1h
//    private final UserDetailsService userDetailsService;
//    @Value("${security.jwt.token.secret-key:secret}")
//    private String secretKey = "secret";
//
//
//    public JwtTokenProvider(UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @PostConstruct
//    protected void init() {
//
//        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
//
//
//    }
//}
