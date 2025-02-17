package belajar.sprint.boot.core;

import belajar.sprint.boot.core.configuration.BarConfiguration;
import belajar.sprint.boot.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class,
})
public class MainConfiguration {
}
