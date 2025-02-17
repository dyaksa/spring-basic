package belajar.sprint.boot.core.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String url;

    private String apiKey;

    private String publicKey;
}
