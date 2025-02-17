package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "belajar.sprint.boot.core.service",
        "belajar.sprint.boot.core.repository",
        "belajar.sprint.boot.core.configuration"
})

@Import({
        MultiFoo.class
})

public class ComponentConfiguration {
}
