package com.aaronspage.web_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class test {
    
    @Value("${my.home:#{null}}")
    private String myHomeValue;

    public void afterPropertiesSet() {
        if (this.myHomeValue == null || this.myHomeValue.equals("${my.home}")) {
            throw new IllegalArgumentException("${my.home} must be configured");
        }
        else {
            System.out.println("All good!" + myHomeValue);
        }
    }
}

