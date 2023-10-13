package com.vodafone.service;

// class under test
public class ArithOperations {
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public boolean isEven(int a) {
		return a%2==0;
	}
}
