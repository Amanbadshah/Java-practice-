package com.AssignmentsCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empty {
	public static void main(String[] args) {
		
		List<Integer> empId=new  ArrayList<Integer>();
		empId.add(101);
		empId.add(102);
		empId.add(103);
		boolean empty2 = empId.isEmpty();
		System.out.println(empty2);
		
		
		
		List<String> empName=new ArrayList<String>();

		
		
		boolean empty = empName.isEmpty();
		System.out.println(empty);
		
	}

}
