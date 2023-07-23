package com.henry.springboot3springsecurity6oauth2jwt.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.henry.springboot3springsecurity6oauth2jwt.dto.JWTTokenDto;
import com.henry.springboot3springsecurity6oauth2jwt.services.DefaultService;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    private  final DefaultService defaultService;

    public HelloController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @GetMapping("/name")
    public Map<String, Object> getName(JwtAuthenticationToken jwt) throws JsonProcessingException {
        return  defaultService.getName(jwt);
    }

    @GetMapping("/principal")
    public JWTTokenDto getJWTByUser(JwtAuthenticationToken jwt) throws JsonProcessingException {
        return defaultService.getJWTByUser(jwt);
    }

}
