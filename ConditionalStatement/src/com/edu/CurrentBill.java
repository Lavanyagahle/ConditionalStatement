/* 
 * units        rate/unit
 * first 100    2rs
 * next 200     3rs
 * above 300    4rs
 */



package com.edu;

import java.util.Scanner;

public class CurrentBill {
public static void main(String[] args) {
	int unit;
	float price;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter unit");
	unit=sc.nextInt();
	if(unit<0) {
		System.out.println("Invalid input");
		System.exit(0);
	}
	if(unit>=1 && unit<=100 ) {
		price = (unit*2);
		System.out.println("The current bill for units "+unit+ " is "+price);
	}else if(unit>100 && unit<=300) {
		price = 100*2 + 3*(unit-100);
		System.out.println("The current bill for units "+unit+ " is "+price);
	}else if(unit>300) {
		price = 100*2 + 3*200 + 4*(unit - 300 );
		System.out.println("The current bill for units "+unit+ " is "+price);
	}
	
}
}
