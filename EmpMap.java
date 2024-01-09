package com.AssignmentsCollection;

import java.util.TreeMap;

public class EmpMap {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> emp=new TreeMap<Integer, String>();
		 emp.put(107, "Aman");
		   emp.put(102, "Sahil");
			emp.put(103, "Muda");
			emp.put(104, "Sameer");
			emp.put(105, "Nehal");
			emp.put(106, "Moin");
			System.out.println(emp.entrySet());
			
			
			System.out.println("Key Base Get Value Is: "  + emp.get(105));
			System.out.println("Key Base Get Value Is: "  + emp.get(103));
			
			//contains key is return boolean
	}

}
