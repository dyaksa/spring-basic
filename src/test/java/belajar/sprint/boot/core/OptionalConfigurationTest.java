package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Bar;
import belajar.sprint.boot.core.data.Foo;
import belajar.sprint.boot.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalConfigurationTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    public void testOptional() {
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertNotNull(fooBar.getFoo());

        Assertions.assertNull(fooBar.getBar());
    }
}
