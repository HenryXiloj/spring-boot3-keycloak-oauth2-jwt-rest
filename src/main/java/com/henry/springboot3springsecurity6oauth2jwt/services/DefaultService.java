package com.henry.springboot3springsecurity6oauth2jwt.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.henry.springboot3springsecurity6oauth2jwt.dto.JWTTokenDto;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

import java.util.Map;

public interface DefaultService {

    public Map<String, Object> getName(JwtAuthenticationToken jwt) throws JsonProcessingException;

    public JWTTokenDto getJWTByUser(JwtAuthenticationToken jwt) throws JsonProcessingException;


}
