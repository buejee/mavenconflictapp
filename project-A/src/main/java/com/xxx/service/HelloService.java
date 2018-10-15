package com.xxx.service;

public class HelloService {
    private HelloWorld helloWorld;
    public HelloService(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    public String hello(){
        return helloWorld.hello();
    }
}
