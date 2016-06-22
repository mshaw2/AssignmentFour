package com.sessionone;
/*
 * Assume that the integer variable x is 5 and the integer variable y is 10.
 *  Give the values of the following expressions:
a. x + y * 2
b. x - y + 2
c. (x+y) * 2
d. y % x
 */
public class AssignmentFour {
	public static void main(String args[])
	{
		int x=5,y=10;
		System.out.println("Value of x + y * 2 is " + (x+y*2) );
		System.out.println("Value of x - y + 2 is "+ (x-y+2));
		System.out.println("Value of (x+y) * 2 is "+ ((x+y)*2));
		System.out.println("Value of y % x is "+ y%x);
	}

}
