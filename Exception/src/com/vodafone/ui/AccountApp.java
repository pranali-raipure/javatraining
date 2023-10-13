package com.vodafone.ui;

import com.vodafone.model.Account;

public class AccountApp {

	public static void main(String[] args) {
		Account first = new Account(101, "srinivas", 30000.0);
		
		first.deposit(5000);
		System.out.println(first.getBalance());
		
		first.withdraw(60000);
		System.out.println(first.getBalance());

	}

}