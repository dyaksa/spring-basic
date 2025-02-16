package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Bar;
import belajar.sprint.boot.core.data.Foo;
import belajar.sprint.boot.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    public void testDI() {
        Foo foo = context.getBean("fooFirst",Foo.class);
        Bar bar = context.getBean(Bar.class);

        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    public void testFooBar() {
        Foo foo = new Foo();
        Bar bar = new Bar();

        FooBar foobar = new FooBar(foo, bar);

        Assertions.assertSame(foo, foobar.getFoo());
        Assertions.assertSame(bar, foobar.getBar());
    }
}
