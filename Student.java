package com.practiceclover;

public class Student {
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	
	
	public void setStudDetails(int rollNum,String studName,int mark1,int mark2,int mark3) 
	{
		this.rollNum=rollNum;
		this.studName=studName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;	
	}
	
	public int calculateTotal() {
		totalMarks=mark1+mark2+mark3;
		return totalMarks;
	}
	public void displayStudDetails(){
		System.out.println(rollNum);
		System.out.println(studName);
		System.out.println(calculateTotal());
		
	}

}
