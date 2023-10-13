package com.vodafone.service;

import java.util.Comparator;

import com.vodafone.model.Employee;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String currentName = o1.getName();
		String otherName = o2.getName();
		
		return currentName.compareTo(otherName);
	}

}
