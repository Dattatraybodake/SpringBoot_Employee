package com.example.Employee_Management.config.jwtConfig;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Component
public class JwtProvider {


    @Value("${jwt.secrate-key}")
    String secrateKey;


    @Value("${jwt.expiration-time}")
     Long expirationTime;

// generate JWT Token by using authentication object who has a username
    public String generateToken(Authentication authentication)
    {
        String name=authentication.getName();
        Date currentDate=new Date();
        Date expireDate= new Date(new Date().getTime()+expirationTime);

        return Jwts.builder()
                .subject(name)
                .issuedAt(new Date())
                .expiration(expireDate)
                .signWith(Keys.hmacShaKeyFor(Decoders.BASE64.decode(secrateKey)))
                .compact();
    }


//     Verify token or not
    public Boolean verifyToken(String token)
    {
        Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(Decoders.BASE64.decode(secrateKey)))
                .build()
                .parse(token);
            return true;
    }

//
    public String getUserNameFromToken(String token)
    {
        return Jwts.parser()
                .verifyWith((SecretKey) key())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    public Key key()
    {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secrateKey));
    }

}
