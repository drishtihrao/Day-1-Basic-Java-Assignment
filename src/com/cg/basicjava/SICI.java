package com.cg.basicjava;

//to calculate simple and compound interest
import java.util.*;

class SICI {
	public static void main(String args[]) {
		double p_amt, si, ci;
		int no_years, rate;
		
		Scanner s = new Scanner(System.in);
		
		//Taking the principle amount and required number of days required to repay the loan is number of years
		System.out.println("Enter the principle amount, number of years and rate of interest");
		p_amt = s.nextDouble();
		no_years = s.nextInt();
		rate = s.nextInt();
		
		// Calculating simple interest
		si = (float) (p_amt * no_years * rate) / 100; 
		
		// Calculating compound interest
		ci = (float) (p_amt * ((1 + rate / 100) ^ no_years)) - p_amt; 
		
		//Printing the value of Simple and Compound Interest
		System.out.println("SI is " + si + " CI is " + ci);
	}
}