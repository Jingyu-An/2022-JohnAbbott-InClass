package com.jingyu.ws.soap;

import com.jingyu.ws.soap.dto.PaymentProcessorRequest;
import com.jingyu.ws.soap.dto.PaymentProcessorResponse;
import com.jingyu.ws.soap.exceptions.ServiceException;

public class PaymentProcessorImpl implements PaymentProcessor{

    @Override
    public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest) throws ServiceException {

        PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
        if(paymentProcessorRequest.getCreditCardInfo().getCardNumber() == null ||
                paymentProcessorRequest.getCreditCardInfo().getCardNumber().length() == 0) {
            throw new ServiceException("Invalid Card Number");
        }

        paymentProcessorResponse.setResult(true);
        return paymentProcessorResponse;
    }
}
