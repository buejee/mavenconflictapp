package com.xxx.service;

import com.xxx.adaptor.GoodbyeAdaptorService;

public class GoodbyeService {
    private GoodbyeAdaptorService goodbyeAdaptorService;
    public GoodbyeService(GoodbyeAdaptorService goodbyeAdaptorService){
        this.goodbyeAdaptorService = goodbyeAdaptorService;
    }
    public String goodbye(){
        return goodbyeAdaptorService.goodbye();
    }
}
