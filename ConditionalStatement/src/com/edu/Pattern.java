package com.edu;

public class Pattern {
public static void main(String[] args) {
	int row=3, v;
	v=1;
	for(int i=1; i<=row;i++) {
		for(int b=1;b<=row-1;b++) {
			System.out.print(" ");
		}
		//print value
		for(int j=1;j<=i;j++) {
		System.out.print(v+" ");
		v++;
	}
		System.out.println();
}
}
}