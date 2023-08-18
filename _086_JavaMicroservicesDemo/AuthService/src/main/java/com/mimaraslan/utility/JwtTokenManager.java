package com.mimaraslan.utility;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class JwtTokenManager {

    String secretKey = "Ankara_06";
    String issuer = "Adana_01";
    Long exDate = 1000L * 60 * 1; // 1 dakika


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

        try{
            Algorithm algorithm = Algorithm.HMAC512(secretKey);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
            DecodedJWT decodedJWT = verifier.verify(token);

            if (decodedJWT == null)
                return false;

        } catch (Exception e){
            return false;
        }
        return true;
    }


    // Tokendan bilgi aliyoruz.
    public Optional<Long> getIdFromToken (String token){
       try {
           Algorithm algorithm = Algorithm.HMAC512(secretKey);
           JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
           DecodedJWT decodedJWT = verifier.verify(token);

           System.out.println("Tokendaki decodedJWT : "+ decodedJWT);

           if (decodedJWT == null)
               return Optional.empty();

           Long id = decodedJWT.getClaim("id").asLong();

           String info = decodedJWT.getClaim("info").asString();
           System.out.println("info : "+ info);

           return Optional.of(id);

       } catch (Exception e){
           return Optional.empty();
       }

    }


}
