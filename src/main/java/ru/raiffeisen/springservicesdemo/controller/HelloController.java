package ru.raiffeisen.springservicesdemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello(String name) {

        return "hello";
    }

}
