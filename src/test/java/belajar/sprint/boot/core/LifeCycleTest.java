package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
//        context.close();
    }

    @Test
    public void testConnection() {
       Connection connection =  context.getBean(Connection.class);

        Assertions.assertNotNull(connection);
    }
}
