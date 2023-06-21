package com.edu;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	int number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number 1 to 7 to print day name");
	number = sc.nextInt();
	switch(number) {
	case 1:{
		System.out.println("Monday");
		break;
	}
	case 2:{
		System.out.println("tuesday");
		break;
	}
	case 3:{
		System.out.println("wednesday");
		break;
	}
	case 4:{
		System.out.println("thursday");
		break;
	}
	case 5:{
		System.out.println("Friday");
		break;
	}
	case 6:{
		System.out.println("Saturday");
		break;
	}
	case 7:{
		System.out.println("Sunday");
		break;
	}
	default:{
		System.out.println("Invalid Number");
	}
	}
}
}
