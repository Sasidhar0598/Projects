package com.practice.Exception;

import java.io.IOException;


class Demo{
	public void demo() throws IOException{
		throw new  IOException("This is a custom Exception");
	}
}



public class ThrowAndThrowsDemo {
	
	public static void main(String args[]) {
		Demo d = new Demo();
		
		try {
			d.demo();
			
		}catch(IOException e) {
			System.out.println(e.getMessage() );
		}
	}
	
	

}
