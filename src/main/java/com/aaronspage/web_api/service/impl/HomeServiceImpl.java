package com.aaronspage.web_api.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aaronspage.web_api.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

    @Override
    public ResponseEntity<String> home() {
        return new ResponseEntity<String>("Hello!", HttpStatus.OK);
    }
    
}
