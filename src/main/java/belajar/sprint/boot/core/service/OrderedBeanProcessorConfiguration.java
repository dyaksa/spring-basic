package belajar.sprint.boot.core.service;

import belajar.sprint.boot.core.data.Car;
import belajar.sprint.boot.core.processor.IdBeanPostProcessor;
import belajar.sprint.boot.core.processor.IdBeanProcessorOrdered;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdBeanPostProcessor.class,
        IdBeanProcessorOrdered.class
})
public class OrderedBeanProcessorConfiguration {
}
