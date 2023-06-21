package com.edu;

import java.util.Scanner;

public class AreaUsingSwitch {
public static void main(String[] args) {
	int choice;
	int side, area;
	float length, breadth,arearec;
	float height, base, areatri;
	float radius, areacir;
	Scanner sc= new Scanner(System.in);
	System.out.println("**********MENU**********");
	System.out.println("1.Area of Square");
	System.out.println("2.Area of Rectangle");
	System.out.println("3.Area of Triangle");
	System.out.println("4.Area of Circle");
	
	
	System.out.println("Enter your choice");
	choice = sc.nextInt();
	switch(choice) {
	case 1: System.out.println("Enter side of square");
	        side = sc.nextInt();
	        area = side * side;
	        System.out.println("The area of square of side "+side+" is "+area);
	        break;
	case 2: System.out.println("Enter length and breadth of rectangle");
	        length = sc.nextFloat();
	        breadth = sc.nextFloat();
	        arearec = (length * breadth);
	        System.out.println("The area of rectangle of length "+length+" and breadth "+breadth+" is "+arearec);
	        break;
	case 3:System.out.println("Enter base and height of triangle");
	        height = sc.nextFloat();
	        base =sc.nextFloat();
	        areatri = 0.5f* (height*base);
	        System.out.println("Area of triangle of height "+height+" and base "+base+" is "+areatri);
	        break;
	case 4:System.out.println("Enter radius of circle");
	       radius = sc.nextFloat();
	       areacir = (3.14159f*radius*radius);
	       System.out.println("Area of circle of radius "+radius+ " is "+areacir);
	       break;
	default:System.out.println("Invalid input");
	     
	        
	
	}
}
}
