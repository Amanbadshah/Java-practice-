package com.AssignmentsCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCopy {
	public static void main(String[] args) {
		List<String> one=new ArrayList<String>();
		one.add("1");
		one.add("2");
		one.add("3");
		one.add("4");
		
		List<String> two=new ArrayList<String>();
		two.add("Aman");
		two.add("Sahil");
		two.add("Muda");
		two.add("Sameer");
		
		System.out.println("Before Copy ArrayList " +  one  +  "  "   + two);
		Collections.copy(one, two);
		
		System.out.println("After Copy"+ one + " " + two);
		
		
		
		
	}
	
	
	

	
	

}
