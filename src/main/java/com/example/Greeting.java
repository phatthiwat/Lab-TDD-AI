package com.example;

public class Greeting {
    public String sayHello(String name) {
        if (name == null) {
            name = "Friend";
        }
        return "Hello, " + name;
    }
}
