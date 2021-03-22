package com.demo.microservices.camelmicroservicesa.route.a;

import com.demo.microservices.camelmicroservicesa.bean.GetCurrentTimeBean;
import com.demo.microservices.camelmicroservicesa.components.SimpleLockingComponent;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyFirstTimerRouter extends RouteBuilder {

    @Autowired
    GetCurrentTimeBean getCurrentTimeBean;

    @Autowired
    SimpleLockingComponent simpleLockingComponent;

    @Override
    public void configure() throws Exception {

        from("timer:first-timer") //queue
        .log("${body}")
        .transform().constant("My Constant Message")
        .log("${body}")

//        .transform().constant(getCurrentTimeBean.getCueenrtTime())
        .bean(getCurrentTimeBean)
        .log("${body}")
        .bean(simpleLockingComponent)
        .log("${body}")
        .to("log:first-timer"); //database


    }

}
