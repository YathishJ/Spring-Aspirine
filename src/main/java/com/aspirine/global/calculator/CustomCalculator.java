package com.aspirine.global.calculator;

import com.aspirine.global.service.MathWorkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * No calculation is done in this class.
 *
 * @author yathish
 */
@Component
public class CustomCalculator {

    private static final Logger LOG = LoggerFactory.getLogger(CustomCalculator.class);

    private MathWorkService mathWorkService;

    @Autowired
    public CustomCalculator(MathWorkService mathWorkService) {
        this.mathWorkService = mathWorkService;
        LOG.info("Addition Check {}", mathWorkService.add(new BigDecimal(10), new BigDecimal(20)));
        LOG.info("Subtract Check {}", mathWorkService.subtract(new BigDecimal(10), new BigDecimal(20)));
        LOG.info("Multiply Check {}", mathWorkService.multiply(new BigDecimal(7), new BigDecimal(9),new BigDecimal(10)));
        LOG.info("Divide Check {}", mathWorkService.divide(new BigDecimal(30), new BigDecimal(6)));
    }

}
