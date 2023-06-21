package com.edu;

import java.util.Scanner;

public class StudentGrade {
public static void main(String[] args) {
	int marks;
	System.out.println("Enter marks");
	Scanner sc= new Scanner(System.in);
	marks= sc.nextInt();
	if(marks>=90 && marks<=100) {
		System.out.println("Your grade is A+");
	}else if(marks>=70 && marks<=89){
		System.out.println("Your grade is A");
	}else if(marks>=50 && marks<=69) {
		System.out.println("Your grade is B+");
	}else if(marks>=35 && marks<=48) {
		System.out.println("Your grade is B");
	}else if(marks>0 && marks<=34) {
		System.out.println("Your are failed");
	}else {
		System.out.println("Invalid marks");
	}
}
}
