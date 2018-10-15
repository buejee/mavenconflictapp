package com.xxx.adaptor;

import com.xxx.service.HelloWorld;

public class GoodbyeAdaptorService {
    private HelloWorld helloWorld;
    public GoodbyeAdaptorService(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    public String goodbye(){
        return helloWorld.goodbye();
    }
}
