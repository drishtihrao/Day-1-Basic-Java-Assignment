package com.cg.basicjava;

//to calculate the square of a number and displaying it in the form num*1=num
import java.util.*;

public class Square {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// taking input from user
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		// printing the square of the number, calculated by square method
		System.out.println(n + "*1 = " + n + ", Square = " + square(n));
	}

	// This is a method to calculate the square of a given number
	public static int square(int n) {
		return (n * n);
	}
}