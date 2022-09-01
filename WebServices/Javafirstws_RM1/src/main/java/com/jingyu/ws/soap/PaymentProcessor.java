package com.jingyu.ws.soap;

import com.jingyu.ws.soap.dto.PaymentProcessorRequest;
import com.jingyu.ws.soap.dto.PaymentProcessorResponse;
import com.jingyu.ws.soap.exceptions.ServiceException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "PaymentProcessor")
public interface PaymentProcessor {

    @WebMethod
    public @WebResult(name = "response") PaymentProcessorResponse processPayment(
            @WebParam(name = "paymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest) throws ServiceException;
}
