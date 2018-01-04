package com.aspirine.global.interfaces;

import java.math.BigDecimal;

/**
 * Calculator interface is used as requirements are unknown.
 *
 * @author yathish
 */
public interface Calculator {

    BigDecimal add(BigDecimal... bigDecimals);

    BigDecimal subtract(BigDecimal a, BigDecimal b);

    BigDecimal multiply(BigDecimal... bigDecimals);

    BigDecimal divide(BigDecimal a, BigDecimal b);
}
