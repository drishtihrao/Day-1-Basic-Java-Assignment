package com.cg.basicjava;

//to calculate avg of three marks for each student
import java.util.Scanner;

public class AvgMarks {
	public static void main(String args[]) {
		int P1, P2, P3, c1, c2, c3, b1, b2, b3;

		Scanner scanner = new Scanner(System.in);
		// taking input from user
		System.out.println("Enter the marks in Physics  for three students");
		P1 = scanner.nextInt();
		P2 = scanner.nextInt();
		P3 = scanner.nextInt();
		System.out.println("Enter the marks in Chem  for three students");
		c1 = scanner.nextInt();
		c2 = scanner.nextInt();
		c3 = scanner.nextInt();
		System.out.println("Enter the marks in Bio  for three students");
		b1 = scanner.nextInt();
		b2 = scanner.nextInt();
		b3 = scanner.nextInt();

		System.out.println("The avg phy marks scored by students is " + (float) (P1 + P2 + P3) / 3);
		System.out.println("The avg chem marks scored by students is " + (float) (c1 + c2 + c3) / 3);
		System.out.println("The avg bio marks scored by students is " + (float) (b1 + b2 + b3) / 3);
		System.out.println("The avg marks scored by student 1 is " + (float) (P1 + c1 + b1) / 3);
		System.out.println("The avg marks scored by student 2 is " + (float) (P2 + b2 + c2) / 3);
		System.out.println("The avg marks scored by student 3 is " + (float) (P3 + b3 + c3) / 3);

	}
}
