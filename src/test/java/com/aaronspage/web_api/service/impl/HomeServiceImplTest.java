package com.aaronspage.web_api.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HomeServiceImplTest {

    private HomeServiceImpl homeService = new HomeServiceImpl();

    @Test
    void homeTest() {
        ResponseEntity<String> expectedResponse = new ResponseEntity<>("Hello!", HttpStatus.OK);
        ResponseEntity<String> actualResponse = homeService.home();
        Assertions.assertEquals(expectedResponse, actualResponse);
    }
    
}
