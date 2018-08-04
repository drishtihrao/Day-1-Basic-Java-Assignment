package com.cg.basicjava;

import java.util.Scanner;

public class ResultDetermnator {
	public static void main(String args[]) {
		int Phy, Chem, Math;
		Scanner scanner = new Scanner(System.in);

		// Taking Marks of three subjects as input from the user
		System.out.println("Enter the marks in Physics");
		Phy = scanner.nextInt();
		System.out.println("Enter the marks in Chemistry");
		Chem = scanner.nextInt();
		System.out.println("Enter the marks in Math");
		Math = scanner.nextInt();

		// Checking the conditions for Passing, Failing or getting Promoted using a
		// nested if-else
		if (Phy > 60 && Chem > 60 && Math > 60)
			System.out.println("Passed");
		else if ((Phy < 60 && Chem > 60 && Math > 60) || (Phy > 60 && Chem < 60 && Math > 60)
				|| (Phy > 60 && Chem > 60 && Math < 60))
			System.out.println("Promoted");
		else
			System.out.println("Failed");
	}
}