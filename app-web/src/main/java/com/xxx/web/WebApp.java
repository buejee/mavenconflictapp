package com.xxx.web;
import com.xxx.adaptor.GoodbyeAdaptorService;
import com.xxx.service.GoodbyeService;
import com.xxx.service.HelloService;
import com.xxx.service.HelloWorld;
public class WebApp {

    private HelloService helloService = new HelloService(new HelloWorld());
    private GoodbyeService goodbyeService = new GoodbyeService(new GoodbyeAdaptorService(new HelloWorld()));

    public void helloTest(){
        String hello = helloService.hello();
        System.out.println(hello);
    }
    public void goodbyeTest(){
        String goodbye = goodbyeService.goodbye();
        System.out.println(goodbye);
    }

    public static void main(String[] args) {
        WebApp app = new WebApp();
        app.helloTest();
        app.goodbyeTest();
    }
}
