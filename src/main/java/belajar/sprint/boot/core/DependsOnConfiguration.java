package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Bar;
import belajar.sprint.boot.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @Lazy
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("Create Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create Bar");
        return new Bar();
    }
}
