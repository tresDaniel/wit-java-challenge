package com.daniel.wit.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.wit.exception.UnsupportedMathOperationException;
import com.daniel.wit.math.MathOperation;
import com.daniel.wit.messaging.QueueSender;
import com.daniel.wit.util.Utility;


@RestController
public class CalculatorController {
	
	@Autowired
	private QueueSender queueSender;
	
	MathOperation math = new MathOperation();
			
	@GetMapping(value="/sum")
	public BigDecimal sum(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		
		queueSender.send(String.format("Sum - %s and %s", a, b));
		BigDecimal sum = math.sum(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return sum;

	}
	
	@GetMapping(value="/subtract")
	public BigDecimal subtract(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		
		queueSender.send(String.format("Subtract - %s and %s", a, b));
		BigDecimal subtraction = math.subtract(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return subtraction;
	}
	
	@GetMapping(value="/multiply")
	public BigDecimal multiply(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		
		queueSender.send(String.format("Multiply - %s and %s", a, b));
		BigDecimal multiplication = math.multiply(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return multiplication;
	}
	
	@GetMapping(value="/divide")
	public BigDecimal divide(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
		if(!Utility.isNumeric(a) || !Utility.isNumeric(b)) {
			throw new UnsupportedMathOperationException("You need to set a numeric vale.");
		}
		
		queueSender.send(String.format("Divide - %s and %s", a, b));
		BigDecimal division = math.divide(Utility.convertToBigDecimal(a), Utility.convertToBigDecimal(b));
		
		return division;
	}
}
