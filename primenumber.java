package com.practiceclover;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Check For Prime Number Or Not?");
		 int UserNumber = sc.nextInt();
		 int count=0;
		 
		 if(UserNumber>1) 
		 {
			 for(int i=1;i<=UserNumber;i++)
			 {
				 if(UserNumber%i==0)
				 {
					 count++;
				 }
				
				
			 }
			 if(count==2) {
				 System.out.println("Prime Number");
			 }
			 else {
				 System.out.println("Not Prime Number");
			 }
		 }
		 else {
			 System.out.println("Not Prime Number");
		 }
	
		
		
	}

}
