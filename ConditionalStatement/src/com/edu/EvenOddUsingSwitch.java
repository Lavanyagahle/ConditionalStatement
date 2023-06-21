package com.edu;

import java.util.Scanner;

public class EvenOddUsingSwitch {
	public static void main(String[] args) {
	
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        switch(num % 2) {
        case 0:
        	  System.out.println("Given number is an even number");
              break;
        case 1:
        	System.out.println("Given number is an odd ");
        	break;
        default:
        	System.out.println("Invalid input");
          
        }
        
        
	}
}
