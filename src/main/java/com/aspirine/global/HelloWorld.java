package com.aspirine.global;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Sample hello world class.
 *
 * @author yathish.
 */
@Component
public class HelloWorld {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

    public void getHelloWorld() {
        LOG.info(" Log message ---> Hello World :) ");
    }
}
