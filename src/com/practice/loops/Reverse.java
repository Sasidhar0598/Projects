package com.practice.loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want tgo reverse");
		int n = sc.nextInt();
		int temp;
		int rev=0;
		int rem=0;
		temp=n;
		
		while(temp>0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp=temp/10;
		}
		
			System.out.println("reverse of number "+n+ " :"+rev);
		

	}

}
