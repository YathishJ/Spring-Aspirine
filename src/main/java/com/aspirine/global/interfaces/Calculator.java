package com.aspirine.global.interfaces;

import java.math.BigDecimal;

public interface Calculator {

    BigDecimal add(BigDecimal... bigDecimals);

    BigDecimal subtract(BigDecimal... bigDecimals);

    BigDecimal multiply(BigDecimal... bigDecimals);

    BigDecimal divide(BigDecimal... bigDecimals);
}
