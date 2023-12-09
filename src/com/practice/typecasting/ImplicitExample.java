package com.practice.typecasting;

public class ImplicitExample {
	
public static void main(String[] args) {
		
		byte smallCount = 100 ;  // 1 byte => -128 to 127 
		
		System.out.println("Byte count : "+ smallCount);
		
		short shortCount = smallCount ; // 2 byte => -32768 to 32767  // Implicit Type cast
		
		System.out.println("Short count : "+ shortCount);

		
		int intCount = shortCount ;     //  4 bytes => -2,147,483,648 to 2,147,483,647  // Implicit Type cast
		
		System.out.println("Integer count : "+ intCount);

		
		long bigCount = intCount ;      // Implicit Type cast -> int => long
		
		System.out.println("Long count : "+ bigCount);

		
		float floatCount = bigCount;    // Implicit Type cast -> long => float
		
		System.out.println("Float count : "+ floatCount);

		
		double decimalCount = bigCount; // Implicit Type cast -> long => double
		
		System.out.println("Doube count 1 : "+ decimalCount);

		
		double decimalCount2 = floatCount; // Implicit Type cast -> float => double
		
		System.out.println("Double count 2 : "+ decimalCount2);
	}

}
