package com.dylan.apirest.apirest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
        // Configuración de CORS para permitir solicitudes desde un origen específico
        registry.addMapping("/**") // Aplica a todas las rutas
                .allowedOrigins("http://127.0.0.1:5500") // Permite solicitudes
                                                         // desde este origen
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
                .allowedHeaders("*") // Permite todos los headers
                .allowCredentials(true); // Permite cookies
    }
}
