package belajar.sprint.boot.core;

import belajar.sprint.boot.core.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {

    private ConfigurableApplicationContext context;


    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);
    }

    @Test
    public void testFactoryBean() {
        PaymentGatewayClient client = context.getBean(PaymentGatewayClient.class);

        Assertions.assertEquals("https://payment-gateway.co.id", client.getUrl());
        Assertions.assertEquals("12345", client.getApiKey());
        Assertions.assertEquals("67890", client.getPublicKey());
    }
}
