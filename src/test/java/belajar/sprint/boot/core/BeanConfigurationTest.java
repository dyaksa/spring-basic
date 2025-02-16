package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationTest {

    @Test
    public void testBeanConfiguration() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);
    }

    @Test
    public void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        var foo1 = context.getBean(Foo.class);
        var foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
