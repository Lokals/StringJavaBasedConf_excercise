package pl.sdacademy;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloSpringConfig {

    @Bean
    public HelloSpring helloSpring() {

        return new HelloSpring("Hello lets dance with JAVA R&D Spring");
    }
    @Bean
    @Scope("singleton")
    public SingletonGreeter helloSingleton(){
        return new SingletonGreeter("Greeting from Singleton");
    }

    @Bean
    @Scope("prototype")
    public PrototypeGreeter helloPrototype(){
        return new PrototypeGreeter("Hello from Prototype");
    }
}

