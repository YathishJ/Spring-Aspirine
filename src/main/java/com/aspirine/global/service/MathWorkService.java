package com.aspirine.global.service;

import com.aspirine.global.interfaces.Calculator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

/**
 * All math works are done here.
 *
 * @author yathish
 */
@Service
public class MathWorkService implements Calculator {

    private static final MathContext mathContext = new MathContext(4);

    public BigDecimal add(BigDecimal... bigDecimals) {

        Objects.requireNonNull(bigDecimals);

        BigDecimal r = BigDecimal.ZERO;
        for (BigDecimal b : bigDecimals) {
            r = r.add(b);
        }
        return r;
    }

    public BigDecimal subtract(BigDecimal valueOne, BigDecimal valueTwo) {

        Objects.requireNonNull(valueOne);
        Objects.requireNonNull(valueTwo);

        return valueOne.subtract(valueTwo);
    }

    public BigDecimal multiply(BigDecimal... bigDecimals) {

        Objects.requireNonNull(bigDecimals);
        BigDecimal r = BigDecimal.ONE;
        for (BigDecimal b : bigDecimals) {
            r = r.multiply(b);
        }
        return r;
    }

    public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {

        Objects.requireNonNull(dividend);
        Objects.requireNonNull(divisor);

        return dividend.divide(divisor, mathContext);
    }

}
