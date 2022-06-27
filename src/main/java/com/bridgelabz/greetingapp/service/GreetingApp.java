package com.bridgelabz.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingApp implements IgreetingApp {


    @Override

    public String getMessage() {

        return "hello world";
    }
}
