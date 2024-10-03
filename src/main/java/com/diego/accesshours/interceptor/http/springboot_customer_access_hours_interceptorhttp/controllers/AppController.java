package com.diego.accesshours.interceptor.http.springboot_customer_access_hours_interceptorhttp.controllers;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/inter")
    public ResponseEntity<?> interceptor(){
        Map<String, Object> data = new HashMap<>();
        data.put("Title", "Bienvenidos al sistema de atencion");
        data.put("Time", new Date());
        return ResponseEntity.ok(data);
    }

}
