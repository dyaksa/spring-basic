package belajar.sprint.boot.core.processor;

import belajar.sprint.boot.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Mengakses BeanPostProcessorConfiguration After Initialization untuk bean {}", beanName);
        if (bean instanceof IdAware) {
            IdAware idAware = (IdAware) bean;
            log.info("Mengeset ID untuk bean {}", beanName);
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
