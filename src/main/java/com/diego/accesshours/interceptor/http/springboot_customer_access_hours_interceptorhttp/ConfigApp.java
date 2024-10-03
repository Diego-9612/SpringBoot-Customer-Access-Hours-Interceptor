package com.diego.accesshours.interceptor.http.springboot_customer_access_hours_interceptorhttp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigApp implements WebMvcConfigurer{

    @Autowired
    @Qualifier("calendar")
private HandlerInterceptor calendar;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(calendar);
        
    }



}
