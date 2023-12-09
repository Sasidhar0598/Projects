package com.practice.loops;

import java.util.Scanner;

public class PatternDemo {
	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc .nextInt();
		
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		System.out.println("-------------");
		
		for (int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
