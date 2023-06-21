package com.edu;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
       System.out.println("Enter a number");
       Scanner sc= new Scanner(System.in);
       n = sc.nextInt();
       if(n % 2==0) {
    	   System.out.println(n+" is an Even number");
       }else {
    	   System.out.println(n+" is an odd number");
       }
	}

}
