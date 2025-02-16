package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Bar;
import belajar.sprint.boot.core.data.Foo;
import belajar.sprint.boot.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooFirst") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
