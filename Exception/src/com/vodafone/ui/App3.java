package com.vodafone.ui;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

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

		if (secondNumber != 0) {
			result = firstNumber / secondNumber;
			System.out.println("Quotient = " + result);
			result = firstNumber % secondNumber;
			System.out.println("Remainder = " + result);
		} else {
			System.out.println("cannot divide by zero and could not calculate quotient and remainder");
		}
		scan.close();

	}

}

