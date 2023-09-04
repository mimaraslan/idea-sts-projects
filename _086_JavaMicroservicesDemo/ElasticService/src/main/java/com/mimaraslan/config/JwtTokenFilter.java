package com.mimaraslan.config;

import com.mimaraslan.exception.ElasticServiceException;
import com.mimaraslan.exception.ErrorType;
import com.mimaraslan.utility.JwtTokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    JwtTokenManager jwtTokenManager;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Eklediğimiz filter");


        if("/elastic/user/save".equals(request.getRequestURI())){
            // arada hiçbir işleme alamadan geri dönüş yapılıyor.
            filterChain.doFilter(request,response);
            return;
        }



        String bearerToken = request.getHeader("Authorization");
        // System.out.println("Bearer Token : "+ bearerToken);
        // System.out.println("Bearer Token : "+ bearerToken.substring(7));

        if (bearerToken == null || !bearerToken.startsWith("Bearer ") )
            throw new ElasticServiceException(ErrorType.INVALID_TOKEN);


        String token = bearerToken.substring(7);
        Optional<Long> authid = jwtTokenManager.getIdFromToken(token);

        if(authid.isEmpty())
            throw new ElasticServiceException(ErrorType.INVALID_TOKEN);


        // arada hiçbir işleme alamadan geri dönüş yapılıyor.
        filterChain.doFilter(request,response);
    }
}


