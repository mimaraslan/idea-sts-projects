package com.mimaraslan.utility;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class JwtTokenManager {

    String secretKey = "Ankara_06";
    String issuer = "Adana_01";
    Long exDate = 1000L * 60 * 2; // 2 dakika


    // Token uretme
    public Optional<String> createToken (Long id){
        String token = "";
        try {
            token = JWT.create().withAudience()
                    .withClaim("id", id)
                    .withClaim("info", "AuthService")
                    .withClaim("lastjoin", System.currentTimeMillis())
                    .withIssuer(issuer)
                    .withIssuedAt(new Date())
                    .withExpiresAt(new Date(System.currentTimeMillis() + exDate))
                    .sign(Algorithm.HMAC512(secretKey));

            return Optional.of(token);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    // Token dogulama
    public Boolean verifyToken (String token){
        return null;
    }


    // Tokendan bilgi aliyoruz.
    public Optional<Long> getIdFromToken (String token){
        return null;
    }


}
