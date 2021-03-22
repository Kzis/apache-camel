package com.demo.microservices.camelmicroservicesa.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleLockingComponent {

    Logger logger = LoggerFactory.getLogger(SimpleLockingComponent.class);

    public void  process(String msg){
        logger.info("SimpleLockingComponent {}" , msg);
    }
}
