package com.henry.springboot3springsecurity6oauth2jwt.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.henry.springboot3springsecurity6oauth2jwt.dto.JWTTokenDto;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DefaultServiceImpl implements DefaultService{

    public static ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public Map<String, Object> getName(JwtAuthenticationToken jwt) throws JsonProcessingException {
        objectMapper.findAndRegisterModules();
        var respData = objectMapper.writeValueAsString(jwt.getTokenAttributes());
        var user = objectMapper.readValue(respData, JWTTokenDto.class);

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("name", user.getName());

        return dataMap;
    }

    @Override
    public JWTTokenDto getJWTByUser(JwtAuthenticationToken jwt) throws JsonProcessingException {
        objectMapper.findAndRegisterModules();
        var respData = objectMapper.writeValueAsString(jwt.getTokenAttributes());

        var user = objectMapper.readValue(respData, JWTTokenDto.class);
        return user;
    }
}
