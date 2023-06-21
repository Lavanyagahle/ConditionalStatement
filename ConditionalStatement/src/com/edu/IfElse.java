package com.edu;

import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	int num;
	System.out.println("Enter any number");
	Scanner sc= new Scanner(System.in);
	num = sc.nextInt();
	if(num>0) {
		System.out.println(num+" is Positive number");
	}else {
		System.out.println(num+" is Negetive number");
	}
}
}
