package com.example.mapstruct.controllers.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

public class JWTGenerate {
    private static final String KEY = "lU1S4M4R1N";
    public String generateToken(UserDetails userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 *2))
                .signWith(SignatureAlgorithm.HS256,KEY)
                .compact();

    }
}
