package com.training.calc;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Addition : " + (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Division : " + (a/b));
		System.out.println("Modulo : " + (a%b));

	}

}
