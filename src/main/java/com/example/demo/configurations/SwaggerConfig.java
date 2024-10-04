package com.example.demo.configurations;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {

    @Bean
    public GroupedOpenApi groupOpenApi() {
        return GroupedOpenApi.builder()
                .group("Vessels")
                .pathsToMatch("/vessels/**")
                .build();
    }
}
