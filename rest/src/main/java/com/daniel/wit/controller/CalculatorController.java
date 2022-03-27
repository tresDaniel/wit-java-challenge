package com.daniel.wit.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.wit.exception.UnsupportedMathOperationException;
import com.daniel.wit.math.MathOperation;
import com.daniel.wit.util.Utility;


@RestController
public class CalculatorController {
	
	MathOperation math = new MathOperation();
		
	@RequestMapping(value="/sum", method=RequestMethod.GET)
	public BigDecimal sum(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		BigDecimal sum = math.sum(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return sum;
	}
	
	@RequestMapping(value="/subtract", method=RequestMethod.GET)
	public BigDecimal subtract(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		BigDecimal subtraction = math.subtract(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return subtraction;
	}
	
	
	@RequestMapping(value="/multiply", method=RequestMethod.GET)
	public BigDecimal multiply(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		BigDecimal multiplication = math.multiply(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return multiplication;
	}
	
	
	@RequestMapping(value="/divide", method=RequestMethod.GET)
	public BigDecimal divide(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		BigDecimal division = math.divide(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return division;
	}
}
