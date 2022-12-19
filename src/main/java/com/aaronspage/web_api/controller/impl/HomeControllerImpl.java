package com.aaronspage.web_api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaronspage.web_api.controller.HomeController;
import com.aaronspage.web_api.service.HomeService;

@RestController
public class HomeControllerImpl implements HomeController {
    private HomeService homeService;

    @Autowired
    public HomeControllerImpl(HomeService homeService) {
        this.homeService = homeService;
    }
    
    @GetMapping("/")
    public ResponseEntity<String> home() {
        return homeService.home();
    }
}
