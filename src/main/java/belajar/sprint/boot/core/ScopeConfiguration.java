package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Bar;
import belajar.sprint.boot.core.data.Foo;
import belajar.sprint.boot.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        var configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
