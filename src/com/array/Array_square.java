package com.array;

import java.util.Scanner;

public class Array_square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n = sc.nextInt();
		
		int ar []= new int[n];
		for(int i=0;i<ar.length;i++){
			System.out.println("enter the element"+(i+1));
			ar[i]=sc.nextInt();
		}
		System.out.println("perfect square of given element");
	}

}
