package no.rune.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Leaf {

    @Bean
    public String myString() {
        return "Hello World!";
    }
}
