package com.henry.springboot3springsecurity6oauth2jwt.controller;

import com.henry.springboot3springsecurity6oauth2jwt.services.DefaultService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRestController {

    private  final DefaultService defaultService;

    public AdminRestController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

}
