package com.daniel.wit.util;

import java.math.BigDecimal;

public class Utility {
	public static final BigDecimal ZERO = new BigDecimal(0);
	
	private Utility() {}
	
	public static BigDecimal convertToBigDecimal(String strNumber) {
		if(strNumber == null) return ZERO;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) return new BigDecimal(number);
		return ZERO;
	}

	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
