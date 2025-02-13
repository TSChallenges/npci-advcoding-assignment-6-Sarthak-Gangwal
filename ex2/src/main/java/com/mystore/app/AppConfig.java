package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        Product p = new Product();
        p.setId(1);
        p.setName("Tumbler");
        return p;
    }

    @Bean
    public Product bucket() {
        Product p = new Product();
        p.setId(2);
        p.setName("Bucket");
        return p;
    }
}
