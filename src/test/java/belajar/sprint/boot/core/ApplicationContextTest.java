package belajar.sprint.boot.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    public void testApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        Assertions.assertNotNull(context);
    }
}

