package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("home")
    public String hello(){
        return "<h1>Welcome to my home page</h1>";
    }

    @GetMapping("login")
    public String login(){
        return "<h1>Welcone to Login page</h1>";
    }

    @GetMapping("course")
    public String course(){
        return "<h1>Welcome to our Course page" +
                "<h1>Purchase our Spring boot course</h1>";
    }

    @GetMapping("signup")
    public String signUp(){
        return "<h1>SignUp now and access this web application</h1>";
    }

    @GetMapping("about")
    public String about(){
        return "<h1>Welcome to our about page</h2>";
    }

    @GetMapping("contact-us")
    public String contactUs(){
        return "<h1>Welcome to our contact us page</h1>";
    }
}