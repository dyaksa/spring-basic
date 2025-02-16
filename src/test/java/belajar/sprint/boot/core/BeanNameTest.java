package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo = context.getBean(Foo.class);
        Foo fooFirst = context.getBean("fooFirst", Foo.class);
        Foo fooSecond = context.getBean("fooSecond", Foo.class);

        Assertions.assertSame(fooFirst, foo);

        Assertions.assertNotSame(fooSecond, foo);
    }
}
