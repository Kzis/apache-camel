package com.demo.microservices.camelmicroservicesa.bean;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GetCurrentTimeBean {

    public String getCurrenrtTime(){
        return "Time now is : " + LocalDateTime.now();
    }
}
