package com.loops;

public class SquareOfEvenCubeOfOdd {
	public static void main(String[]args) {
		int square,cube;
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			
				square = i * i;
				System.out.println("square of even number"+ i + " *  " + i + "=" +square);
				System.out.println();
			}else 
			{
				cube=i*i*i;
				
				System.out.println("cube of odd number"+ i+ "*" + i + "*" + i + "=" +cube);
			}
		}
		
		
	}

}
