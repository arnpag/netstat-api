package com.aaronspage.web_api.controller.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.aaronspage.web_api.service.HomeService;

@ExtendWith(MockitoExtension.class)
public class HomeControllerImplTest {

    @InjectMocks
    private HomeControllerImpl homeController;
    @Mock
    private HomeService homeService;

    @Test
    void happyPathTest(){
        ResponseEntity<String> expectedResponse = new ResponseEntity<>( "Hello!", HttpStatus.OK);
        Mockito.when(homeService.home()).thenReturn(expectedResponse);
        ResponseEntity<String> actualResponse = homeController.home();
        Assertions.assertEquals(expectedResponse, actualResponse);
    }
}
