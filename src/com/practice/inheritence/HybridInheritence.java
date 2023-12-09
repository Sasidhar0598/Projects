package com.practice.inheritence;


   
class GrandFather    
{    
public void show()    
{    
System.out.println("He is grandfather.");    
}    
}    
   
class Father extends GrandFather    
{    
public void display()    
{    
System.out.println("He is father.");    
}    
}    
  
class Son extends Father    
{    
public void disp()    
{    
System.out.println("He is son.");    
}    
}       
class Daughter extends Father    
{    
public void showD()    
{    
System.out.println("She is daughter.");    
}    

}  

public class HybridInheritence {
	public static void main(String args[])    
	{    
    

	
	Son obj = new Son();  
	obj.disp();   
	obj.display();    
	obj.show(); 
	
	System.out.println("-----------");
	
	
	Daughter obj2 = new Daughter();  
	obj2.showD();   
	obj2.display();      
	obj2.show();
	
	System.out.println("-----------");

	}    

}
