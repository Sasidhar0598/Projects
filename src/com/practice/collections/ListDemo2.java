package com.practice.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student{
	int rollNo;
	String name;
	String branch;
	
	
	Student(){}
	
	Student(int rollNo,String name,String branch){
		this.rollNo=rollNo;
		this.name = name;
		this.branch = branch;
		
		
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
	}
}

public class ListDemo2 {
	
	public static void main(String args[]) {
		
		List<Student> list =new LinkedList<Student>();
		
		list.add(new Student(101,"Sasidhar","cse"));
		list.add(new Student(102,"vamsidhar","Mech"));
		list.add(new Student(103,"Akash","Mech"));
		list.add(new Student(104,"Gouse","cse"));
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Student Details :" + itr.next());
		}

		
	}
	
	

}
