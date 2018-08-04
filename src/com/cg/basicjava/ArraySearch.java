package com.cg.basicjava;
/*
 * This is a program to search a number in a array of numbers
 */
import java.util.Scanner;

public class ArraySearch {
	public static void main(String args[]) {
		int a[] = new int[15];
		int F, i, j = 0;
		Scanner scanner = new Scanner(System.in);

		//taking 15 numbers as input for array
		System.out.println("Enter an array of 15 numbers");
		for (i = 0; i < 15; i++) {
			a[i] = scanner.nextInt();
		}
		
		//taking a number from user which has to be searched
		System.out.println("Enter the number you want to search");
		F = scanner.nextInt();

		//searching the array for the number
		for (i = 0; i < 15; i++) {
			if (a[i] == F) {
				System.out.println("Number is present in the array at position " + i);
				j = j + 1;
			}
		}
			
		if (j == 0)
			System.out.println("Entered number not present");
		}
	}
