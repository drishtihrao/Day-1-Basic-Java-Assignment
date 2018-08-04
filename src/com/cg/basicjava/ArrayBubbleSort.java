package com.cg.basicjava;

//to sort an array of 15 inputs using bubble sort
import java.util.*;

public class ArrayBubbleSort {
	public static void main(String args[]) {
		Array A = new Array(); // creating an object of class Array
		A.sort();
	}
}

//creating a class array to take input from the user and make the array
class Array {
	int a[] = new int[15];
	int F, i, j = 0, temp = 0;
	Scanner s = new Scanner(System.in);

	public Array() {
		System.out.println("Enter an array of 15 numbers");
		for (i = 0; i < 15; i++) {
			a[i] = s.nextInt();
		}
	}

	//creating a class to sort the array in ascending order
	public void sort() {
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 14; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j]; // swapping the values in the array
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println("The sorted array is ");
		for (i = 0; i < 15; i++) {
			System.out.println(a[i] + " ");
		}

	}
}
