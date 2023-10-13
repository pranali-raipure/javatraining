package com.vodafone.ui;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
		
			System.out.println("Enter two numbers: ");
			int firstNumber = scan.nextInt();
			int secondNumber = scan.nextInt();
	
			int result;
	
			result = firstNumber + secondNumber;
			System.out.println("Sum = " + result);
			result = firstNumber - secondNumber;
			System.out.println("Difference = " + result);
			result = firstNumber * secondNumber;
			System.out.println("Product = " + result);
			
			try {
				result = firstNumber / secondNumber;
				System.out.println("Quotient = " + result);
				result = firstNumber % secondNumber;
				System.out.println("Remainder = " + result);
			} catch(ArithmeticException excep) {
				System.out.println("cannot divide by zero and could not calculate quotient and remainder");
			} 
			
			
		} catch(InputMismatchException excep) {
			System.out.println("please give integers only ...");
		}  finally {
			System.out.println("exception handling done");
		}

		scan.close();

	}

}
