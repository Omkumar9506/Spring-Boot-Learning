package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy   //Singleton
//@Scope("prototype")
public class PaymentService {

    private OrderService orderService;

    public PaymentService(OrderService orderService){
        this.orderService=orderService;
        System.out.println("PaymentService Created");
    }

    public void pay(){
        System.out.println("Payment Done");

        orderService.getOrderDetails();
    }
}
