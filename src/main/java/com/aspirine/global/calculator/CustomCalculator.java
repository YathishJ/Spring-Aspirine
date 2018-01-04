package com.aspirine.global.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * No calculation is done in this class.
 *
 * @author yathish
 */
@Component
public class CustomCalculator {

    private static final Logger LOG = LoggerFactory.getLogger(CustomCalculator.class);

    public CustomCalculator() {
        LOG.info("-------------> Start <---------------");
    }

}
