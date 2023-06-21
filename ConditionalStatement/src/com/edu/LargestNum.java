//Laegest of two number
package com.edu;

import java.util.Scanner;

public class LargestNum {
public static void main(String[] args) {
	int a, b;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter first number");
	a= sc.nextInt();
	System.out.println("Enter second number");
	b = sc.nextInt();
	if(a>b) {
		System.out.println(a+ " is large number");
	}else {
		System.out.println(b+ " is large number");
	}
}
}
