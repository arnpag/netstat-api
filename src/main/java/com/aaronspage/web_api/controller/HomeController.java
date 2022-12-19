package com.aaronspage.web_api.controller;

import org.springframework.http.ResponseEntity;

public interface HomeController {
    ResponseEntity<String> home();
}
