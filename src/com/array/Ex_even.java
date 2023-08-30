package com.array;

import java.util.Scanner;

public class Ex_even {
	public static void main(String[]srgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int ar []= new int[n];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter the element "+(i+1)+" :");
			ar[i]=sc.nextInt();
		}
		System.out.println("Even numbers in the array are :");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%i==0) {
				System.out.print(ar[i]+" ");
			}
		}
		sc.close();
	}
}
