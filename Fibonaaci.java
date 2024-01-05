package com.practiceclover;

public class Fibonaaci {
	
	public static void main(String[] args) {
		int number=10;
		int fb=0,fs=1,ft=0;
		
		for(int i=0;i<number;i++) {
			ft=fs+fb;
			
			System.out.println(fs+"");
			
			fb=fs;
			fs=ft;
		}
	}

}
