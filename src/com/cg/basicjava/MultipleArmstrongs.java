package com.cg.basicjava;
/*
 * Checking for Armstrong numbers between 100 and 1000
 */
public class MultipleArmstrongs {
	public static void main(String args[]) {
		int a, rem, sum = 0, n;

		for (a = 100; a < 1000; a++) {
			sum = 0;
			n = a;
			while (n > 0) {
				rem = n % 10;
				sum = sum + (rem * rem * rem);
				n = n / 10;

			}
			//printing the values which are Armstrong
			if (sum == a)
				System.out.println(a + " is Armstrong");
		}
	}
}