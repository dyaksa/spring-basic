package belajar.sprint.boot.core;

import belajar.sprint.boot.core.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {

    @Configuration
    @Import({
            AuthService.class
    })
    public static class TestConfiguration {}


    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void testAware() {
        AuthService authService = context.getBean(AuthService.class);

        Assertions.assertEquals("belajar.sprint.boot.core.service.AuthService", authService.getName());

        Assertions.assertEquals(context, authService.getApplicationContext());
    }
}
