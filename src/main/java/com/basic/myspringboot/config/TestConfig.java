package com.basic.myspringboot.config;

import com.basic.myspringboot.dto.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestConfig {
    @Bean
    public Customer customer() {
        return Customer.builder() //CustomerBuilder inner class
                .name("테스트모드")
                .age(10)
                .build();
    }
}
