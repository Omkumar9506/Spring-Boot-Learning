package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Hariom", 24);
    }

    @Bean
    public CartSerive createCartService(){
        return new CartSerive();
    }

    @Bean
//    @Primary
    @Qualifier("cs")
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
//    @Primary
    @Qualifier("up")
    public PaymentService createUpiPayment(){
        return new UpiPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("cs") PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
