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
        HelloSpring beanSpring = context.getBean(HelloSpring.class);
        HelloSpring beanSpring1 = context.getBean(HelloSpring.class);

        PrototypeGreeter beanPrototype = context.getBean(PrototypeGreeter.class);
        SingletonGreeter beanSingleton1 = context.getBean(SingletonGreeter.class);
        PrototypeGreeter beanPrototype1 = context.getBean(PrototypeGreeter.class);
        SingletonGreeter beanSingleton = context.getBean(SingletonGreeter.class);

        System.out.println(beanSpring.getWelcomeMessage());
        System.out.println(beanPrototype.getPrototypeMessage());
        System.out.println(beanSingleton.getMessageSingleton());
        System.out.println(beanSpring1.getWelcomeMessage());
        System.out.println(beanPrototype1.getPrototypeMessage());
        System.out.println(beanSingleton1.getMessageSingleton());
//        HelloSpring bean = context.getBean(HelloSpring.class);

        System.out.println("+++comparison+++");
        System.out.println("Prototype");
        System.out.println(beanPrototype.equals(beanPrototype1));
        System.out.println("Singleton");
        System.out.println(beanSingleton.equals(beanSingleton1));
        System.out.println("Spring");
        System.out.println(beanSpring.equals(beanSpring1));


    }
}
