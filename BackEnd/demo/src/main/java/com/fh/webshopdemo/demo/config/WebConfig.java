package com.fh.webshopdemo.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")// Fügt ein CORS mapping für alle requests hinzu
                .allowedMethods("*")// Erlaubte Methoden zu leeren String gesetzt
                .allowedOrigins("*"); // Erlaubte Origins zu allen gesetzt
    }
}

