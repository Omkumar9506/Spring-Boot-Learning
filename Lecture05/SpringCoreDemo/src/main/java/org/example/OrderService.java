package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void orderPlace(){
        paymentService.pay();
        System.out.println("Order Place Successfully");
    }
}
