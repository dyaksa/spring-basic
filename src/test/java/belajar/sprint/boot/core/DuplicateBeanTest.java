package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {

    @Test
    public void testErrorDuplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            context.getBean(Foo.class);
        });
    }

    @Test
    public void testSuccess(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);


        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
