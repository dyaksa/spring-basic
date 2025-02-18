package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Car;
import belajar.sprint.boot.core.service.OrderedBeanProcessorConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderedBeanProcessorTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context =  new AnnotationConfigApplicationContext(OrderedBeanProcessorConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testOrderedBeanProcessor() {
        Car car = context.getBean(Car.class);

        System.out.println(car.getId());
    }
}
