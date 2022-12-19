package com.aaronspage.web_api.service;

import org.springframework.http.ResponseEntity;

public interface HomeService {

    ResponseEntity<String> home();
    
}
