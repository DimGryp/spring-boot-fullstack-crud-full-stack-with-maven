package com.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootFullstackCrudFullStackWithMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFullstackCrudFullStackWithMavenApplication.class, args);
    }
   @Bean
   public WebMvcConfigurer corsConfigurer() {
       return new WebMvcConfigurer() {
           @Override
            public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/instructors/{username}/courses").allowedOrigins("http://localhost:3000");
        //test
               //test3
               //test4
            }
        };
    }
}
