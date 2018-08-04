package com.cg.basicjava;

/*
 * This is a program to display the date entered in dd/mm/yyyy format in format where month is given in words
 */
import java.util.Scanner;

public class DD_MM_YYYY {
	public static void main(String args[]){
		int dd,mm,yyyy;
		
		//accepting the date from the user
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the date in the form of dd,mm,yyyy");
		String str;
		str = sc.next();
		
		//separating the date from month and year and storing it in an array
		String date[]=str.split(",");
		
		//checking for invalid inputs
		if(Integer.parseInt(date[0]) >31 || Integer.parseInt(date[1]) >12 )
			System.out.println("Invalid Input");
		else{
			switch(date[1])
			{
				case "01": System.out.println(date[0] + "/January/" + date[2]);
				break;
				case "02": System.out.println(date[0] + "/February/" + date[2]);
				break;
				case "03": System.out.println(date[0] + "/March/" + date[2]);
				break;
				case "04": System.out.println(date[0] + "/April/" + date[2]);
				break;
				case "05": System.out.println(date[0] + "/May/" + date[2]);
				break;
				case "06": System.out.println(date[0] + "/June/" + date[2]);
				break;
				case "07": System.out.println(date[0] + "/July/" + date[2]);
				break;
				case "08": System.out.println(date[0] + "/August/" + date[2]);
				break;
				case "09": System.out.println(date[0] + "/September/" + date[2]);
				break;
				case "10": System.out.println(date[0] + "/October/" + date[2]);
				break;
				case "11": System.out.println(date[0] + "/November/" + date[2]);
				break;
				case "12": System.out.println(date[0] + "/December/" + date[2]);
				break;
				default : System.out.println("Invalid input");
			}
		}
	}
}
