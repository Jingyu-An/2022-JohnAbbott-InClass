package com.jingyu.ws.soap;

import com.jingyu.ws.soap.dto.PaymentProcessorRequest;
import com.jingyu.ws.soap.dto.PaymentProcessorResponse;

public class PaymentProcessorImpl implements PaymentProcessor{

    @Override
    public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest) {
        PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
        paymentProcessorResponse.setResult(true);
        return paymentProcessorResponse;
    }
}
