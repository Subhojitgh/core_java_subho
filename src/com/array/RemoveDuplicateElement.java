package com.array;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		int ar[] = new int[] { 10, 20, 30, 40, 30, 50 };
		System.out.print("The input array is :");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(" " + ar[i]);
		}

		int num = 30;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == num) {
				count++;
			}
		}
		int ar2[] = new int[ar.length - count];
		int count2 = 0;
		System.out.println("");
		System.out.print("The output array is: ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != num) {
				ar2[count2] = ar[i];
				count2++;
			}
		}
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");

		}
	}
}
