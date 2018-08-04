package com.cg.basicjava;
/*
 * This is a program to check the login credentials of a person
 * If incorrect credentials are put three times, the code stops execution
 * The user is asked to contact admin
 */
import java.util.Scanner;

public class LoginValidation {
	public static void main(String args[]) {
		int count = 0;
		String user = "dri";
		String password = "password";

		while (count < 4) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your user name and password");
			String uname = s.next();
			String pass = s.next();

			if (uname.equals(user) && pass.equals(password)) {
				System.out.println("Welcome");
				break;
			} else
				count = count + 1;

			if (count == 3) {
				System.out.println("Contact Admin");
				break;
			}
		}
	}
}
