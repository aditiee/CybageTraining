package com.cybage.unitetsting;

public class Calculator {

	int add(int num1,int num2)
	{
		return num1+num2;
	}
	
	int substract(int num1,int num2)
	{
		return num1-num2;
	}
	
	int mul(int num1,int num2)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num1*num2;
	}
	
	int division(int num1,int num2) throws ArithmeticException
	{
		if(num2==0)
			throw new ArithmeticException();
		return num1/num2;
	}
	
	
	
}
