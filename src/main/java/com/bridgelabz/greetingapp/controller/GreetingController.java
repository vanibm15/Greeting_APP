package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.service.IgreetingApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
    public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    IgreetingApp igreetingApp;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }

    @RequestMapping(value = ("/hello"), method = RequestMethod.GET)
    public String hello() {

        //String message = igreeting.getMessage();
        return "hello world";
    }

    @PostMapping("/messages")
    public String get(@RequestBody Greeting greeting) {
        String getGreeting = igreetingApp.getGreeting(greeting);
        return getGreeting;
    }

    @GetMapping("/getmessage/{getId}")
    public Greeting greeting(@PathVariable long getId) {

        Greeting greeting = igreetingApp.getGreetingMessage(getId);
        return greeting;

    }


    @GetMapping("/getgreetings")
    List<Greeting> getMessages() {

        List<Greeting> greetings = igreetingApp.getGreetings();
        return greetings;
    }

    @PutMapping("/updatemessage/{getId}")
    public Greeting greeting(@PathVariable long getId, @RequestBody Greeting greeting) {

        Greeting greeting1 = igreetingApp.updateGreeting(getId);
        return greeting1;
    }
    @DeleteMapping("/delete")
    public String deleteMessage(@RequestParam long id){
        igreetingApp.deleteMessage(id);
        return "deleted....!";
    }

    private Greeting greeting() {
        return greeting();
    }
}



