package com.cg.basicjava;

//to determine if a number is Armstrong number or not
import java.util.*;

class Armstrong {

	public static void main(String args[]) {
		int rem, a, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		a = n;

		/*
		 * splitting the number digit wise and checking if the number is Armstrong or
		 * Not An Armstrong number is a number same as sum of cube of its digits
		 */

		while (n != 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		
		//Printing the result
		if (sum == a)
			System.out.println("The given number is Armstrong");
		else
			System.out.println("The given number is not Armstrong");
	}

}
