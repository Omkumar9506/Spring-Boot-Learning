package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;


public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        order.orderPlace();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

//        CartSerive cs = new CartSerive();
//        cs.addToCart();

        User user = context.getBean(User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());

        CartSerive cart = context.getBean(CartSerive.class);
        cart.addToCart();
    }
}
