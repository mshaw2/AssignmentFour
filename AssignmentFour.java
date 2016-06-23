package com.sessiontwo;
/*
 * Write a program to print total number of days in the given month.
 */

public class AssignmentFour {
	
	public static void main(String[] args) {
		String month=args[0];
		switch(month){
		case "January": System.out.println(month + " has 31 Days");
		break;
		case "Feburary": System.out.println(month + " has 28 Days");
		break;
		case "March": System.out.println(month + " has 30 Days");
		break;
		case "April": System.out.println(month + " has 31 Days");
		break;
		case "May": System.out.println(month + " has 30 Days");
		break;
		case "June": System.out.println(month + " has 31 Days");
		break;
		case "July": System.out.println(month + " has 30 Days");
		break;
		case "August": System.out.println(month + " has 31 Days");
		break;
		case "September": System.out.println(month + " has 30 Days");
		break;
		case "October": System.out.println(month + " has 31 Days");
		break;
		case "November": System.out.println(month + " has 30 Days");
		break;
		case "December": System.out.println(month + " has 31 Days");
		break;
		default : System.out.println("Enter a valid Month");
		}
	}

}
