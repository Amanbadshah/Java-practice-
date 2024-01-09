package com.AssignmentsCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	int id;
	String name;
	int age;
	String dateOfJoinning;
	public Student(int id, String name, int age, String dateOfJoinning) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfJoinning = dateOfJoinning;
	}
	
	

	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", date-Of-Joinning=" + dateOfJoinning + "]";
	}


	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(01, "Aman", 26, "22-Jun-2000"));
		list.add(new Student(05, "Zaid", 26, "2-April-2001"));
		list.add(new Student(04, "Moin", 28, "20-May-2002"));
		list.add(new Student(06, "Aamin", 28, "20-May-2002"));
		list.add(new Student(02, "Arkan", 28, "20-May-2002"));
	
	Iterator<Student> sd=list.iterator();
	while(sd.hasNext()) {
		System.out.println(sd.next());
	}
	
	
	System.out.println();
	System.out.println("After Using  NameComparato");
	
 Collections.sort(list, new NameComparato());
 Iterator<Student> list1=list.iterator();
 while(list1.hasNext()) {
	 System.out.println(list1.next());
 }
 
// System.out.println(list);
	
	
	
	
	
	
	}
	
	

	
	
	

}
