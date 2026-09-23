package org.example.simple;

public class B {
    private A a;

    public B(){
        System.out.println("Created B");
        this.a=new A();
    }
}
