package belajar.sprint.boot.core;

import belajar.sprint.boot.core.service.MerchantService;
import belajar.sprint.boot.core.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    public void testInheritance() {
        MerchantService service = context.getBean(MerchantService.class);

        MerchantService service2 = context.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(service, service2);
    }
}
