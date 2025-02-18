package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Car;
import belajar.sprint.boot.core.processor.IdBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdBeanPostProcessor.class
})

public class BeanPostProcessorConfiguration {
}
