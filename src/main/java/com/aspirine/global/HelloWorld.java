package com.aspirine.global;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(HelloWorld.class);

    public void getHelloWorld() {
        LOG.info(" Log message ---> Hello World :) ");
    }
}
