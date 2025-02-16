package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);
    }


    @Test
    void testPrimaryBean() {
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo1, foo);

        Assertions.assertNotSame(foo2, foo);
    }
}
