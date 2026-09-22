package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    @Autowired
    private final PaymentService paymentService;

//    @Autowired
    public OrderService(@Qualifier("upiPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void orderPlace(){
        paymentService.pay();
        System.out.println("Order Place Successfully");
    }
}
