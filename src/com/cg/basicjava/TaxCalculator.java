package com.cg.basicjava;

//This is a class which calculates tax to be paid by the company according to the employee's salary
import java.util.*;

class TaxCalculator {
	public static void main(String args[]) {
		int ctc;
		//taking input from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your CTC");
		ctc = s.nextInt();
		
		//calculating the tax as per the conditions provided and printing it
		if (ctc >= 0 && ctc <= 180000)
			System.out.println("You dont have to pay tax ");
		else if (ctc >= 181001 && ctc <= 300000)
			System.out.println("You have to pay 10% tax which is " + ctc * 0.1);
		else if (ctc >= 300001 && ctc <= 500000)
			System.out.println("You have to pay 20% tax which is " + ctc * 0.2);
		else if (ctc >= 500001 && ctc <= 1000000)
			System.out.println("You have to pay 30% tax which is " + ctc * 0.3);
		else
			System.out.println("Invalid input");

	}
}