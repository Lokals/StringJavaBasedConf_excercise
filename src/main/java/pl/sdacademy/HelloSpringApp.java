package pl.sdacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(HelloSpringConfig.class);
//        HelloSpring bean = context.getBean(HelloSpring.class);
//        System.out.println(bean.getWelcomeMessage());

        ApplicationContext context =
                SpringApplication.run(HelloSpringConfig.class);
        HelloSpring bean = context.getBean(HelloSpring.class);
        System.out.println(bean.getWelcomeMessage());
//        HelloSpring bean = context.getBean(HelloSpring.class);


    }
}
