package spring01_dasar.lesson25_factory_bean;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String endpoint;

    private String publickKey;

    private String privateKey;
}
