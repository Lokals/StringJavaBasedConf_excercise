package pl.sdacademy;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfig {

    @Bean
    public HelloSpring helloSpring() {

        return new HelloSpring("Hello lets dance with JAVA R&D Spring");
    }
}

