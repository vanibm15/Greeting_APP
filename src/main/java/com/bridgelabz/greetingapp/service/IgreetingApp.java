package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;

import java.util.List;

public interface IgreetingApp {



    public String getMessage();

    public String getGreeting(Greeting greeting);

    Greeting getGreetingMessage(long getId);


    List<Greeting> getGreetings();
}
