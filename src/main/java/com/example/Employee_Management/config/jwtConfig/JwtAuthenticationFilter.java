package com.example.Employee_Management.config.jwtConfig;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {


    private UserDetailsService userDetailsService;

    private JwtProvider jwtProvider;

    public JwtAuthenticationFilter(UserDetailsService userDetailsService, JwtProvider jwtProvider) {
        this.userDetailsService = userDetailsService;
        this.jwtProvider = jwtProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String token=getToken(request);


        if(StringUtils.hasText(token) && jwtProvider.verifyToken(token))
        {
            String username= jwtProvider.getUserNameFromToken(token);

            UserDetails userDetails=userDetailsService.loadUserByUsername(username);

            UsernamePasswordAuthenticationToken authentication=new UsernamePasswordAuthenticationToken(userDetails.getUsername(),
                    null,
                    userDetails.getAuthorities());

            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

            SecurityContextHolder.getContext().setAuthentication(authentication);

        }
    filterChain.doFilter(request,response);

    }

    public String getToken(HttpServletRequest request)
    {
        String token=request.getHeader("Authorization");
        System.out.println(" token ="+token);
        if(StringUtils.hasText(token) && token.startsWith("Bearer "))
        {
            String mainToken=token.substring(7,token.length());
            System.out.println(" Main Jwt Token ="+mainToken);
            return mainToken;
        }

        return  null;
    }

}
