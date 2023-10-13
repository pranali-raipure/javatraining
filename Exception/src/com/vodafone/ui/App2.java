package com.vodafone.ui;

public class App2 {

		public static void main(String[] args) {
			int[] arr = {10,20,30};
			
			try {
			
				for(int i = 0; i <= 3; i++) {
					System.out.println(arr[i]);
				}
					
			} catch(ArrayIndexOutOfBoundsException  excep) {
				System.out.println("**** end of array ****");
			}
		}



}
