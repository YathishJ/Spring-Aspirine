package com.aspirine.global;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Main aspirine class for spring application
 *
 * @author yathish
 */
@SpringBootApplication
public class GlobalApplication {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalApplication.class);

    public static void main(String[] args) {
        LOG.info("Default Charset {}:", Charset.defaultCharset());
        LOG.info("Current Date Time {}", LocalDateTime.now(ZoneOffset.UTC));
        SpringApplication.run(GlobalApplication.class, args);
    }

}
