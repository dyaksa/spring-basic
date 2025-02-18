package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testBeanPostProcessor() {
        Car car = context.getBean(Car.class);
        System.out.println(car.getId());

        Assertions.assertNotNull(car.getId());
    }
}
