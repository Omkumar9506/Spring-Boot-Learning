package org.example.simple;

public class A {

    private B b;
    public A(){
        System.out.println("Created A");
        this.b= new B();
    }
}
