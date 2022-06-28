package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    greetingRepo.save(greeting);
        return greeting.toString();
    }

    @Override
    public Greeting getGreetingMessage(long getId) {
        Optional<Greeting> greeting=greetingRepo.findById(getId);
        return greeting.get() ;
    }


    @Override
    public List<Greeting> getGreetings() {
        List<Greeting> greetings =greetingRepo.findAll();
        return greetings;
    }
}
