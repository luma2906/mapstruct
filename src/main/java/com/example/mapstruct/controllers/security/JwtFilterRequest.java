package com.example.mapstruct.controllers.security;

import com.example.mapstruct.model.User;
import com.example.mapstruct.service.users.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class JwtFilterRequest extends OncePerRequestFilter {
    @Autowired
    private JWTGenerate jwtGenerate;

    @Autowired
    private UserServiceImpl userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String autorizationHeader = request.getHeader("Authorization");
        if(autorizationHeader != null && autorizationHeader.startsWith("Bearer")){
            String jwt = autorizationHeader.substring(7);
            String email = jwtGenerate.getEmail(jwt);
            if (email != null && SecurityContextHolder.getContext().getAuthentication() == null){
                User user = userService.findByEmail(email);
                if(jwtGenerate.validateToken(jwt,user)) {
                    SecurityContextHolder.getContext().setAuthentication(new TokenAuthentication(jwt, email, null));
                    request.setAttribute("claims", jwtGenerate.getClaim(jwt));
                    request.setAttribute("subject", jwtGenerate.getClaim(jwt).getSubject());
                    request.setAttribute("roles",  null);
                }
            }
        }
        filterChain.doFilter(request,response);
    }
}
