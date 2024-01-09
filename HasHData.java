package com.AssignmentsCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;




public class HasHData {
	public static void main(String[] args) {
		Map<Integer, String> data=new HashMap<Integer, String>();
		data.put( 105 , "Aamir");
		data.put( 102 , "Arkan");
		data.put( 103 , "Moin");
		data.put(101, "");
		System.out.println(data);
		
		
		Iterator<Map.Entry<Integer, String>> empdata=data.entrySet().iterator();
		while (empdata.hasNext()) {
			System.out.println(empdata.next());
			
		
			
		}
		

 
  
	

	}}
