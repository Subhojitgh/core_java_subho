package com.array;


public class RemoveOneElement {
	public static void main(String[] args) {
		int []ar= new int[] {10,20,30,40,50};
		int num = 40;
		
		int []ar2 = new int[ar.length-1];
		int count= 0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=num) {
				ar2[count]=ar[i];
				count++;
			}
		}
		
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
	}
	

}
