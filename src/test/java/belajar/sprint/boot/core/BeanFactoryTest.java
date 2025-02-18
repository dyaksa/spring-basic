package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testBeanFactory() {
        ObjectProvider<Foo> fooObjectProvider = context.getBeanProvider(Foo.class);

        System.out.println(fooObjectProvider.stream().collect(Collectors.toList()));

        Map<String, Foo> fooMap = context.getBeansOfType(Foo.class);

        System.out.println(fooMap);
    }
}
