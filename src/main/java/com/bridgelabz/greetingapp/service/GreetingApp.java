package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingApp implements IgreetingApp {

    @Autowired
    GreetingRepo greetingRepo;
    @Override

    public String getMessage() {

        return "hello world";
    }

    @Override
    public String getGreeting(Greeting greeting) {

        return greeting.toString();
    }
}
