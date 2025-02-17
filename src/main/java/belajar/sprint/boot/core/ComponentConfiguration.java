package belajar.sprint.boot.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajar.sprint.boot.core.service",
        "belajar.sprint.boot.core.repository"
})

public class ComponentConfiguration {
}
