package com.vodafone.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>(); 
		LinkedList<Integer> list = new LinkedList<>(); 
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		list.add(40);
		
		System.out.println(list);
		System.out.println("--------------------------------------------");
		
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		System.out.println("-------------------------------------------");
		
		list.remove(0);
		list.set(2, 25);
		
		for(Integer data : list) {
			System.out.println(data);
		}
		System.out.println("-------------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------------");
		
	}

}