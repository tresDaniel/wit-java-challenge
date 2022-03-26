package com.daniel.wit.math;

import java.math.BigDecimal;
import java.math.MathContext;

public class MathOperation {
	
	public BigDecimal sum(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}
	
	public BigDecimal subtract(BigDecimal a, BigDecimal b) {
		return a.subtract(b);
	}
	
	public BigDecimal multiply(BigDecimal a, BigDecimal b) {
		return a.multiply(b);
	}
	
	public BigDecimal divide(BigDecimal a, BigDecimal b) {
		return a.divide(b, MathContext.DECIMAL32);
	}
	
}
