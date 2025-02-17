package belajar.sprint.boot.core.factory;

import belajar.sprint.boot.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setUrl("https://payment-gateway.co.id");
        client.setApiKey("12345");
        client.setPublicKey("67890");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
