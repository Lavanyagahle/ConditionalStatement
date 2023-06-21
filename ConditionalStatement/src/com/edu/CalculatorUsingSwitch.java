package com.edu;

import java.util.Scanner;

public class CalculatorUsingSwitch {
public static void main(String[] args) {
	int operation;
	int number1, number2, result;
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("Enter number to perform operation");
	operation=sc.nextInt();
	System.out.println("Enter numbers");
	number1 = sc.nextInt();
	number2 = sc.nextInt();
	switch(operation) {
	case 1:result = number1 + number2;
	       System.out.println("Addition  of two numbers "+number1+" and "+number2+" is "+result);
	       break;
	case 2:result = number1 - number2;
    System.out.println("Subtraction  of two numbers "+number1+" and "+number2+" is "+result);
    break;
	case 3:result = number1 * number2;
    System.out.println("Multiplication  of two numbers "+number1+" and "+number2+" is "+result);
    break;
	case 4:result = number1 + number2;
    System.out.println("Division of two numbers "+number1+" and "+number2+" is "+result);
    break;
    default:System.out.println("Invalid input");
  
	}
}
}
